 public class ReverseRowsMatrix {
    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Reverse each row
        for (int i = 0; i < rows; i++) {

            int start = 0;
            int end = cols - 1;

            while (start < end) {

                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

        // Print matrix
        System.out.println("Matrix after reversing each row:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}