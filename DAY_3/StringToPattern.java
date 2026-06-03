import java.util.*;
public class StringToPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        String ch = sc.nextLine();

        String result = str.replace(pattern ,ch);
        System.out.println(result);
    }
    
}
