// import java.util.ArrayList;
// import java.util.List;

// public class LinkedLis {
//     public static void main(String[] args) {
//         List<Integer> res = new ArrayList<>();
//         Linked1 linkedlist1 = new Linked1();
//         linkedlist1.append(1);
//         linkedlist1.append(1);
//         linkedlist1.append(2);
//         linkedlist1.display();
//         linkedlist1.remove();
//         linkedlist1.display();
//         // Linked2 linkedlist2 = new Linked2();
//         // linkedlist2.append(1);
//         // linkedlist2.append(3);
//         // linkedlist2.append(4);
//         // linkedlist2.display();
//         // sortlinked(linkedlist1, linkedlist2);
//     }
// }
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
// class Linked1{
//     Node head;
//     void append(int data){
//         Node newnode = new Node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         Node lastnode = head;
//         while(lastnode.next!=null){
//             lastnode = lastnode.next;
//         }
//         lastnode.next = newnode;
//     }
//     void display(){
//         Node current = head;
//         while(current!=null){
//             System.out.println(current.data);
//             current=current.next;
//         }
//     }
//     void getMiddle(){
//         Node mid_data = middledata();
//         System.out.println(mid_data.data);
//         while(mid_data!=null){
//             System.out.println(mid_data.data);
//             mid_data = mid_data.next;
//         }
//     }
//     Node middledata(){
//         int count = 1;
//         Node mid = head;
//         while(head!=null){
//             if(count%2==0){
//                 mid = mid.next;
//             }
//             head = head.next;
//             count++;
//         }
//         return mid;
//     }
//     void remove(){
//         Node curr = head;
//         while(curr!=null){
//             Node temp = curr; 
//             while(temp!=null && temp.data==curr.data){
//                 temp = temp.next;
//             }
//             curr.next = temp;
//             curr = curr.next;
//         }
//     }
// }
// class Linked2{
//     Node head;
//     void append(int data){
//         Node newnode = new Node(data);
//         if(head == null){
//             head = newnode;
//             return;
//         }
//         Node lastnode = head;
//         while(lastnode.next!=null){
//             lastnode = lastnode.next;
//         }
//         lastnode.next = newnode;
//     }
//     void display(){
//         Node current = head;
//         while(current!=null){
//             System.out.println(current.data);
//             current=current.next;
//         }
//     }
//     void getMiddle(){
//         Node mid_data = middledata();
//         System.out.println(mid_data.data);
//         while(mid_data!=null){
//             System.out.println(mid_data.data);
//             mid_data = mid_data.next;
//         }
//     }
//     Node middledata(){
//         int count = 1;
//         Node mid = head;
//         while(head!=null){
//             if(count%2==0){
//                 mid = mid.next;
//             }
//             head = head.next;
//             count++;
//         }
//         return mid;
//     }
// }

