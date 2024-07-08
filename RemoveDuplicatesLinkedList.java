public class RemoveDuplicatesLinkedList {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.append(1);        
        // linkedList.append(1);        
        // linkedList.append(2);
        // linkedList.display();
    }
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    void append(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node lastnode = head;
        while(lastnode.next!=null){
            lastnode = lastnode.next;
        }
        lastnode.next = newnode;
    }
    void display(){
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}