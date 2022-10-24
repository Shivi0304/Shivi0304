package LinkedList;


import java.lang.instrument.Instrumentation;
import java.util.ArrayList;
import java.util.List;

class LinkedListOp {

    Node firstNode;
    Node lastNode;

    public void createLinkedList(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        //if linked list is empty
        if (firstNode == null) {
            firstNode = newNode;
            return;
        }
        Node temp = firstNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        lastNode = newNode;

    }

    public void createCycle(int data) {
        if(firstNode == null) {
            return;
        }
        Node temp = firstNode;
        while(temp != null) {
            if(temp.data == data) {
                break;
            }
            temp = temp.next;
        }
        lastNode.next = temp;
    }


    public boolean checkCycle() {

        if(firstNode == null) {
            System.out.println("Empty Linked List");
            return false;
        }

        Node fast = firstNode;
        Node slow = firstNode;
        fast = fast.next.next;

        boolean cycleExists = false;
        while(fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                cycleExists = true;
                break;
            }
        }
        if(cycleExists){
            System.out.println("Cycle exists");
            return cycleExists;
        }
        return cycleExists;

    }

    public void removeCycle(){
        Node temp = firstNode;
        List<Node> list = new ArrayList<>();
        while(list.contains(temp.next) == false){

            list.add(temp);
            temp = temp.next;

        }
        temp.next = null;
    }

    public void print(){
        if(firstNode==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = firstNode;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class DetermineCycleInLinkedList {

    public static void main(String[] args) {
        LinkedListOp linkedListOp = new LinkedListOp();
        linkedListOp.createLinkedList(6);
        linkedListOp.createLinkedList(9);
        linkedListOp.createLinkedList(2);
        linkedListOp.createLinkedList(5);
        linkedListOp.createLinkedList(1);
        linkedListOp.createLinkedList(4);
        linkedListOp.createLinkedList(3);
        linkedListOp.createLinkedList(16);
        linkedListOp.createLinkedList(11);
        linkedListOp.createCycle(2);
        if(linkedListOp.checkCycle()) {
            linkedListOp.removeCycle();
        }

        linkedListOp.print();


    }
}
