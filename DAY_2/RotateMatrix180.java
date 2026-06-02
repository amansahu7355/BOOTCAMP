public class RotateMatrix180 {
    public static void main(String[] args){
        int [][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        for(int i=mat.length - 1;i>=0;i--){
            for(int j=mat[0].length -1;j>=0;j--){
                System.out.println(mat[i][j] +" ");
            }
            System.out.println();
            
        }
    }
    
}
