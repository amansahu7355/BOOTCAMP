public class DeleteRow {
    public static void main(String[] args){
        
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] newMat = new int[2][3];

        int k = 0;

        for(int i = 0; i < 3; i++) {
            if(i == 1) // delete row 1
                continue;

            for(int j = 0; j < 3; j++) {
                newMat[k][j] = mat[i][j];
            }
            k++;
        }

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
