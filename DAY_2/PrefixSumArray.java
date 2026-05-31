import java.util.*;

public class PrefixSumArray {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int prefix[] = new int[n];

        System.out.println("Enter array  elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        prefix[0] = arr[0];
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println("Enter left index:");
        int l = sc.nextInt();

        System.out.println("Enter righht index:");
        int r = sc.nextInt();

        int sum;
        if(l == 0){
            sum = prefix[r];
        }
        else{
            sum = prefix[r] - prefix[l -1];
        }
        System.out.println("Range Sum = "+sum);



    }
    
}
