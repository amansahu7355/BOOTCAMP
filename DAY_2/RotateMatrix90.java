public class RotateMatrix90 {
    public static void main(String[] args){
        int [][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n = mat.length;

        int [][] rotated = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                rotated[j][n - i - 1] = mat[i][j];
            }
        }

        System.out.println("Rotated Matrix:");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(rotated[i][j] + "");
            }
            System.out.println();
        }

        
        
        

    }
}
    

