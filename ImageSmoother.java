public class ImageSmoother {
    static int[][] image(int[][] mat){
        int row = mat.length;
        int col = mat[0].length;
        int[][] result = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int sum = 0;
                int count = 0;
                for(int x=i-1;x<=i+1;x++){
                    for(int y=j-1;y<=j+1;j++){
                        if(x>=0 && x<row && y>=0 && y<col){
                            sum+=mat[x][y];
                            count=count+1;
                        }
                    }
                }
                result[i][j] = sum/count;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] img1 = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int[][] res = image(img1);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.println(res[i][j]);
            }
        }
    }
}
