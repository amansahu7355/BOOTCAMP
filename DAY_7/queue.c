public class queue {

    for each element in the (ticket)
        enqueue ticker

    sum = 0
    iterate over queue
        sum+= current element
    print sum

    class queue{
        public;
        Node *front,rear;
        queue()
    }
    front =rear=Null;
    
}
void enqueue(int val){
    Node *temp = new Node(val);
    if(rear==Null){
        front = rear = temp;
        return ;
    }
    rear -> next=temp;
    rear = temp;
}
int sum(){
    int sum =0;
    Node *temp=front;
    while(temp!=Null){
        sum+=temp ->data;
        temp=temp -> next;
    }
    return sum;
}
