import java.util.*;

class Node{
    int data;
    Node next;
    Node(int value){
        data = value;
        next = NULL;
    }
}
public class main{
    public static void main(String[] args){
    static Node head = null;
    static void main(int val){
        Node newNode = newNode(val);
        if(head == null){
            head = newNode;
            return ;
        }
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;

        temp.next = Newnode;
    
    }
    static int countNode(){

        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}
}

