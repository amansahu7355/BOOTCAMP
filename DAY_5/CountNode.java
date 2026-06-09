import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CountNode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        while(true){
            int value = sc.nextInt();

            if(value == -1){
                break;
            }
            Node newNode = new Node(value);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail =  newNode;
            }
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }
}