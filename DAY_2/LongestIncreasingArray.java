public class LongestIncreasingArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4,5,6,7,8,1,2};

        int currentLength = 1;
        int maxLength = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                currentLength++;
            }
            else{
                currentLength = 1;
            }
            if(currentLength > maxLength){
                maxLength = currentLength;
            }
        }
        System.out.println("Length = " + maxLength);
    }
    
}
