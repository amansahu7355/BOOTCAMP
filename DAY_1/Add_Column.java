public class Add_Column {
    public static void main(String[] args){
        int [][] mat ={
            {1,2},
            {4,5}
        };
        int [][] newMat = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                newMat[i][j] = mat[i][j];
            }
        }

        newMat [0][2] = 3;
        newMat [1][2] = 6;

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
