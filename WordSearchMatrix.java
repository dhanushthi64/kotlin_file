//this perform word search in matrix in 8 directions
import java.util.*;
public class WordSearchMatrix {
    public static void main(String[] args){
        char[][] board = {{'o', 'a', 'a', 'n'},
                          {'e', 't', 'a', 'e'},
                          {'i', 'h', 'k', 'r'},
                          {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};
        Solution solver = new Solution();
        List<String> result = new ArrayList<>();
        result = solver.findWords(board, words);
        System.out.println(result);
    }
}

 class Solution{
    int[][] mover = {{1, 0}, {0, 1}, {-1, 0},
    {0, -1}, {1, 1}, {-1, -1},
    {1, -1}, {-1, 1}};
    public boolean dfs(int x,int y,String word,boolean[][] visited,char[][] board){
        if(word.length()==0){
            return true;
        }
        visited[x][y] = true;
        boolean sol = false;
        for(int[] move:mover){
            int curr_x = x+move[0];
            int curr_y = y+move[1];
            if(0<=curr_x && curr_x<board.length && 0<=curr_y && curr_y<board[0].length){
                if (board[curr_x][curr_y]==word.charAt(0) && !visited[curr_x][curr_y]) {
                    String s = word.substring(1);
                    sol = dfs(curr_x, curr_y, s, visited, board);
                }
            }
        }
        visited[x][y] = false;
        return sol;
    }

    public List<String> findWords(char[][] board,String[] words){
        List<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(String word: words){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]==word.charAt(0)){
                        String s = word.substring(1);
                        if(dfs(i, j, s, visited, board)){
                            ans.add(word+" -> {"+i+" ,"+j+" }");
                        }
                    }
                }
            }
        }
        return ans;
    }

}
