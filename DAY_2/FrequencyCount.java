public class FrequencyCount {
    public static void main(String[] args){
        int [] arr = {1,2,2,3,2,4,4,4,4,5};
        int n = arr.length;
        int threshold = n/4;


        System.out.println("Elements with frequency greater than n/4:");

        for(int i=0; i<n; i++){
            int count = 0;

            boolean checked = false;
            for(int k=0; k<i; k++){
                if(arr[k] == arr[i]){
                    checked = true;
                    break;
                }
            }
            if(checked)
                continue;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > threshold){
                System.out.println(arr[i] +" -> " + count + "times");
            }
        }
    }
    
}
