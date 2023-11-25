package lk.ijse.linkedlist;

public class Linked {

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }
    }

    private Node head;

    public void insertAtBegining(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAtEnding(int data) {
        if(head == null){
            insertAtBegining(data);
            return;
        }

        Node n = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = n;
    }


    public void transvers(){
        System.out.print("[");
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }

        System.out.println("\b\b]");
    }

    public void insertAtPoint(int point, int data) {
        Node temp = head;
        Node node = new Node(data);

        for(int i = 0; i <= point-1; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtBegining(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }

        head = head.next;
    }

    public void deleteAtEnding(){
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deleteAtPoint(int point){
        Node temp = head;

        for(int i = 0; i < point; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }


    public int size(){
        int c = 0;

        Node temp = head;

        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
    }

    public void clear(){
        head = null;
    }

    public int getFirstIndex(int index){

        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.data;

    }

}
