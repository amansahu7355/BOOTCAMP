import java.util.*;;
class Node{
    int data;
    Node prev;
    Node next;

    Node (int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class DoublyLinkedList{
    static Node head = null;
    static Node tail = null;

    static void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    static void update(int index,int newPrice){
        Node temp = head;

        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        temp.data = newPrice;
    }
    static void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        int index = sc.nextInt();
        int newPrice = sc.nextInt();

        update(index,newPrice);
        display();
    }
}