public class RemoveMaxSumRow {
    public static void main(String[] args) {

        int[][] mat = {
            {1, 2, 3},
            {7, 8, 9},
            {4, 5, 6}
        };

        int maxSum = 0;
        int maxRow = 0;

        // Find row with maximum sum
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;

            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        // Create new matrix with one less row
        int[][] newMat = new int[mat.length - 1][mat[0].length];

        int k = 0;

        for (int i = 0; i < mat.length; i++) {

            if (i == maxRow)
                continue;

            for (int j = 0; j < mat[i].length; j++) {
                newMat[k][j] = mat[i][j];
            }

            k++;
        }

        // Print new matrix
        System.out.println("Matrix after deleting row with maximum sum:");

        for (int i = 0; i < newMat.length; i++) {
            for (int j = 0; j < newMat[i].length; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

