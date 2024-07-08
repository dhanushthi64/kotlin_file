public class ReorderList {
    public static void main(String[] args) {
        Linked1 linked = new Linked1();
        linked.append(1);
        linked.append(2);
        linked.append(3);
        linked.append(4);
        linked.append(5);
        linked.append(6);
        linked.append(7);
        linked.append(8);
        linked.append(9);
        linked.display();
        linked.reorder();
        linked.display();
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
class Linked1{
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
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println();
    }
    void getMiddle(){
        Node mid_data = middledata();
        System.out.println(mid_data.data);
        while(mid_data!=null){
            System.out.println(mid_data.data);
            mid_data = mid_data.next;
        }
    }
    Node middledata(){
        int count = 1;
        Node mid = head;
        while(head!=null){
            if(count%2==0){
                mid = mid.next;
            }
            head = head.next;
            count++;
        }
        return mid;
    }
    void remove(){
        Node curr = head;
        while(curr!=null){
            Node temp = curr; 
            while(temp!=null && temp.data==curr.data){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }
    void reorder(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
        //reverse
        Node prev = null;
        Node curr = slow;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //merge
        Node first = head;
        Node second = prev;
        while(second!=null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
