import java.util.*;

public class LinkedList{

    private Node head;
    private Node tail;

    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void addElement(int data){

        Node node = new Node(data); // created a new node
        node.next = head;     // initially node is null and node.next = head connect with head
        head = node;           //updating head 

        if(tail == null){

            tail = head;
        }

        size++;

        System.out.println(node.next);
    }

    private class Node{
        
        private int data;
        private Node next;

        public void Node(int data){
            this.data = data;
        }

        public void Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }
}