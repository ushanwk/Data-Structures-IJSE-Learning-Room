package lk.ijse.queue;

public class Queue {

    private int[] elementData;
    private int front;
    private int rear;

    public Queue(final int initailCapasity){
        elementData = new int[initailCapasity];
        front = -1;
        rear = -1;
    }

    public void enQueue(int value){
        if(isFull())grow();
        if(front == -1)front = 0;
        elementData[++rear] = value;
    }

    public void printQueue(){
        System.out.print("[");

        for(int i = front; i <= rear; i++){
            System.out.print(elementData[i] + ", ");
        }

        System.out.println("\b\b]");

        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
    }

    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }else{
            front++;
        }
    }

    public int peek(){ //top
        return elementData[front];
    }

    public boolean isFull() {
        return (rear == elementData.length-1);
    }

    public boolean isEmpty(){
        return (front == -1 || front > rear);
    }

    public void grow(){

        int[] temp = elementData;
        elementData = new int[elementData.length * 2];

        for(int i = 0; i < temp.length; i++){
            elementData[i] = temp[i];
        }

    }

    public void clear(){
        front = -1;
        rear = -1;
    }

    public int size(){
        return rear-front;
    }

}
