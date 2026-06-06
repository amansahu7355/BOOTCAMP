import java.util.*;
public class RemoveVowelElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if("AEIOUaeiou".indexOf(ch)== -1){
                result += ch;
            }
        }
        System.out.println(result);
    }
    
}
