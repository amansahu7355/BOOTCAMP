public class MatrixDiagonalDifference {
    public static void main(String[] args){
        int mat[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = mat.length;
        int primarySum = 0;
        int secondarySum = 0;

        for(int i=0;i<n;i++){
            primarySum += mat[i][i];
            secondarySum += mat[i][n - 1 - i];
        }
        int difference = Math.abs(primarySum - secondarySum);
        System.out.println("Difference = " + difference);
    }
    
}
