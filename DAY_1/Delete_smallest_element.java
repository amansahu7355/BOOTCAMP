import java.util.*;
public class Delete_smallest_element {
    public static void main(String[] args){
        int arr[]= {7,5,3,4,1};
        int smallest;
        
        smallest = arr[0];
        int pos=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest)
                smallest = arr[i];
                pos=i;
        }
        for(int i=pos;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("Array  after deleting Smallest element is:");

        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }

    }
    
}
