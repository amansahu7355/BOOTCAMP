import java.util.Arrays;
public class FrequencySort {
    public static void main(String[] args){
        int arr[] = {2,3,4,5,8,4,3,9,4};
        Arrays.sort(arr);
        int n = arr.length;

        for(int i=0;i<n;){
            int count = 1;
            int value = arr[i];
            int j = i+1;
            while(j<n && arr[j] == value){
                count++;
                j++;
            }
            System.out.println(value + " -> " + count);
            i=j;

        }
    }
    
}
