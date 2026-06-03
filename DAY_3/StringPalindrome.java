import java.util.*;
public class StringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str  = sc.nextLine();

        int left = 0;
        int right = str.length() - 1;
        boolean palindrome = true;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
