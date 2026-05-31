import java.util.*;
public class Largest_element_array {
    public static void main(String[] args){
        // Scanner input = new Scanner(System.in);
        // System.out.println("Largest element");
        int arr[] ={5,2,11,9,3};
        // System.out.println("Enter elements in array:");
        
        int largest;
        largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest)
                largest = arr[i];
        }
        System.out.println("Largest element in array is:"+largest);

    }
    
}
