public class IslandPerimeter {
    static int island(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int perimeter = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    if(i==0 || mat[i-1][j]==0){
                        perimeter++;
                    }
                    if(i==row-1 || mat[i+1][j]==0){
                        perimeter++;
                    }
                    if(j==0 || mat[i][j-1]==0){
                        perimeter++;
                    }
                    if(j==col-1 || mat[i][j+1]==0){
                        perimeter++;
                    }
                }
            }
        }
        return perimeter;
    }
    public static void main(String[] args) {
        int[][] grid1 = {
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };
        int res = island(grid1);
        System.out.println(res);
    }
}
