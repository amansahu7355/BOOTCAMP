public class Add_a_Row {
    public static void main(String[] args){
        int [][] mat ={
            {1,2,3},
            {4,5,6}
        };
        int [][] newMat = new int[3][3];
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                newMat[i][j] = mat[i][j];
            }
        }
        newMat[2][0] = 7;
        newMat[2][1] = 8;
        newMat[2][2] = 9;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println(newMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
