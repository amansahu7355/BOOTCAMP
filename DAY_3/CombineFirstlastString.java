import java.util.Scanner;

public class CombineFirstlastString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String id = sc.nextLine();

        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");

        String firstName = words[0];
        String lastName = words[words.length - 1];

        String username = firstName + "_" + lastName + id;

        System.out.println(username);

        sc.close();
    }
}