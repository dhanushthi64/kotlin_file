public class ReShapeMatrix {
    static int[][] reshape(int[][] mat,int r,int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int row=0;
        int col=0;
        int[][] reshaped = new int[r][c];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                reshaped[row][col] = mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return reshaped;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r=1;
        int c=4;
        int[][] res = reshape(mat,r,c);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]);
            }
        }
    }
}
