

public class SetZeroes
{
    public static void modifyMatrix(int[][] matrix){
	    boolean row_flag = false;
	    boolean col_flag = false;
	    for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0 && matrix[i][j]==1){
                    row_flag = true;
                }
                if(j==0 && matrix[i][j]==1){
                    col_flag = true;
                }
                if(matrix[i][j]==1){
                    matrix[0][j]=1;
                    matrix[i][0]=1;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[0][j]==1 || matrix[i][0]==1){
                    matrix[i][j]=1;
                }
            }
        }
        if(row_flag == true){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=1;
        }
        }
        if(col_flag == true){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=1;
        }
        }
	}
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main(String[] args) {
	   int matrix[][] = {{1, 0},
           {0, 0}};
 
        System.out.println("Input Matrix :");
        printMatrix(matrix);
        modifyMatrix(matrix);
        System.out.println("After putting zeroes as 1:");
        printMatrix(matrix);
	}
	
}
