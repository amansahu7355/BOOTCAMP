import java.util.*;
public class NonRepeating {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // String result = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            int count = 0;
            for(int j= 0 ;j<s.length();j++){
                if(s.charAt(j) == ch){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch);
                return ;
            }
        }
        System.out.println("No Non-Repeating Character");

    }
    
}
