import java.util.*;
public class PermutaionOfString {

        static void permute(char arr[],int index){
            if(index == arr.length){
                System.out.println(new String(arr));
                return;
            }
            for(int i=index;i<arr.length;i++){
                char temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                permute(arr, index + 1);

                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }    
        }
        public static void main(String[] args){
            String str = "ABC";

            permute(str.toCharArray(),0);
        }
        
}
    

