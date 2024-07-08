//Transpose of a matrix using constant space using O(1)

public class TransposeMatrix{
    public static void main(String[] args){
        int A[][] = { { 1, 1, 1, 1 }, 
                      { 2, 2, 2, 2 }, 
                      { 3, 3, 3, 3 }, 
                      { 4, 4, 4, 4 } };
        transpose(A);
        System.out.println("Modified Matrix:");
        printMatrix(A);
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    } 
    public static void transpose(int[][] mat){
        int temp;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}