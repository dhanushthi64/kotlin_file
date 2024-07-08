import java.util.LinkedList;
import java.util.Queue;
class Nod {
    int x;
    int y;

    Nod(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class RottingOrange {
    static void orangesRotting(int[][] grid) {
        Queue<Nod> q = new LinkedList<>();
        int freshCount = 0;
        
        // Adding initially rotten oranges to the queue
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Nod(i, j));
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        // If there are no fresh oranges
        if (freshCount == 0) {
            System.out.println(0);
            return;
        }
        
        int minutes = 0;
        int[] rowdir = {1, -1, 0, 0};
        int[] coldir = {0, 0, 1, -1};
        
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenInThisMinute = false;
            
            for (int i = 0; i < size; i++) {
                Nod curr = q.poll();
                int x = curr.x;
                int y = curr.y;
                
                for (int j = 0; j < 4; j++) {
                    int newx = x + rowdir[j];
                    int newy = y + coldir[j];
                    
                    if (newx >= 0 && newx < grid.length && newy >= 0 && newy < grid[0].length && grid[newx][newy] == 1) {
                        grid[newx][newy] = 2;
                        q.add(new Nod(newx, newy));
                        freshCount--;
                        rottenInThisMinute = true;
                    }
                }
            }
            
            if (rottenInThisMinute) {
                minutes++;
            }
        }
        
        // If there are still fresh oranges left
        if (freshCount > 0) {
            System.out.println(-1);
        } else {
            System.out.println(minutes);
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        orangesRotting(grid);
    }
}

