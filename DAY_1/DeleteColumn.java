public class DeleteColumn {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] newMat = new int[2][2];

        for(int i = 0; i < 2; i++) {
            int k = 0;

            for(int j = 0; j < 3; j++) {
                if(j == 1) // delete column 1
                    continue;

                newMat[i][k] = mat[i][j];
                k++;
            }
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    

