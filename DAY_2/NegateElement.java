public class NegateElement {
    public static void main(String[] args){
        int [][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int rows = mat.length;
        int cols = mat[0].length;

        for(int i=0;i<rows ; i+=2){
            for(int j=0;j<cols;j++){
                mat[i][j] = -mat[i][j];
            }
        }
        for(int i=rows-1;i>=0;i--){
            for(int j=0;j<cols;j++){
                System.out.println(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
