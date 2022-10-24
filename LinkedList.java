package LinkedList;

class Node {
    int data;
    Node next;
}

class LinkedListOperations{

    Node firstNode;

    public void createLinkedList(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        //if linked list is empty
        if(firstNode == null) {
            firstNode = newNode;
            return;
        }
        Node temp = firstNode;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next=newNode;

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

    public int countLength() {
        if(firstNode == null){
            return 0;
        }
        int i = 0;
        Node temp = firstNode;
        while(temp != null){
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void delete(int data){
        if(firstNode == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = firstNode;
        if(temp.data == data) {
            firstNode = temp.next;
        }
        Node prevNode = null;
        while(temp.data != data) {
            prevNode = temp;
            temp = temp.next;
        }
        prevNode.next = temp.next;
    }

    public void find(int key){
        if(firstNode == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = firstNode;
        int i = 0;
        boolean flag = false;
        while(temp != null){
            if(temp.data == key) {
                flag = true;
                break;
            } else {
                i++;
                temp = temp.next;
            }
        }

        if(flag){
            System.out.println("Key : " + key + " is found at position - " + (i + 1));
        } else {
            System.out.println("Key is not found.");
        }
    }

    public void insertAtSpecificIndex(int i, int data) {
        int length = countLength();
        if(length == 0 || i < 0 || i > length + 1) {
            return;
        }
        Node newNode = new Node();
        newNode.data = data;
        if( i == 1) {
                newNode.next = firstNode;
                firstNode = newNode;
                return;
        }

        int pos = 0;
        Node temp = firstNode;
        Node prevNode = firstNode;
        while(temp != null) {
            if(pos == i - 1) {
                break;
            }
            prevNode = temp;
            temp = temp.next;
            pos++;
        }
        newNode.next = temp;
        prevNode.next = newNode;

    }

    public void deleteAtSpecificIndex(int i) {
        int length= countLength();
        if(length == 0) {
            System.out.println("Linked List is empty");
            return;
        } else if( i < 0) {
            System.out.println("Negative Index");
            return;
        } else if( i > length) {
            System.out.println("Index is not within the range.");
            return;
        }
        if( i == 1) {
            firstNode = firstNode.next;
            return;
        }
        Node prevNode = firstNode;
        Node temp = firstNode;
        int pos = 0;
        while(temp != null) {
            if(pos == i-1) {
                break;
            }
            prevNode = temp;
            temp = temp.next;
            pos++;
        }
        prevNode.next = temp.next;
    }
    public void insertAfterData(int data, int ele) {
        if(firstNode == null) {
            System.out.println("linked List is empty");
            return;
        }
        Node newNode = new Node();
        newNode.data = ele;
        Node temp = firstNode;
        boolean flag = false;
        while(temp != null) {
            if(temp.data == data) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Data is not present");
            return;
        }
    }

}

public class LinkedList {

    public static void main(String[] args) {

        LinkedListOperations linkedListOperations = new LinkedListOperations();
        linkedListOperations.createLinkedList(6);
        linkedListOperations.createLinkedList(9);
        linkedListOperations.createLinkedList(2);
        linkedListOperations.createLinkedList(5);
        linkedListOperations.createLinkedList(1);
        System.out.println("After creation");
        linkedListOperations.print();
        System.out.print("Count : ");
        System.out.println(linkedListOperations.countLength());
        linkedListOperations.delete(5);
        System.out.println("After deletion");
        linkedListOperations.print();
        linkedListOperations.find(7);
        linkedListOperations.insertAtSpecificIndex(1,5);
        linkedListOperations.print();
        linkedListOperations.insertAtSpecificIndex(4,8);
        System.out.println("After inserting at specific index:");
        linkedListOperations.print();
        linkedListOperations.deleteAtSpecificIndex(5);
        System.out.println("After deletion at specific index:");
        linkedListOperations.print();
        linkedListOperations.insertAfterData(5,7);
        System.out.println("After inserting after specific element:");
        linkedListOperations.print();



    }
}
