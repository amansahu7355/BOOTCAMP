import java.util.*;
public class diff{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int[] arr= new int[5];
        System.out.println("Enter the elements of the array:");

        for(int i = 0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int difference = arr[0]-arr[5-1];
        System.out.println("Differnece ="+ difference);

    }
}
