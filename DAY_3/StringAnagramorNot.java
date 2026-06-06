import java.util.*;
import java.util.Arrays;

public class StringAnagramorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = "listen";
        String s2 = "silent";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b)){
            System.out.print("Anagram");
        }
        else{
            System.out.print("Not Anagram");
        }


    }
    
}
