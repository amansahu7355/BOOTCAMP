import java.util.*;
public class Sort12 {
    public static void main(String[] args){
        int arr[] = {0,0,1,2,1,1,0,0,2,0,2,2,1};
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n -1;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                // swap(arr[low],arr[mid]);
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                // swap(arr[mid],arr[high]);
                high--;
            }
        }
        for(int num : arr)
            System.out.print(num + " " );
    }
}
