package lk.ijse.stack;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Stack {
    private int[] elementData;
    private int top; //point tho the top of the stack(last element)

    public Stack(final int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }

    public void push(int data){
        if(isFull()){
           grow();
        }
        elementData[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.err.println("Stack already Empty");
            return -1;
        }
        return elementData[top--];
    }

    public int top() { //peek
        if(isEmpty()){
            System.err.println("Stack already Empty");
            return -1;
        }
        return elementData[top];
    }

    public void printStack(){

        if(isEmpty()){
            System.out.println("Empty Stack");
            return;
        }

        System.out.print("[");
        for(int i = 0; i <= top; i++){
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");

    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        return elementData.length-1 == top;
    }

    public int size(){
        return top+1;
    }

    public void clear(){
        top = -1;
    }

    public void grow(){

        int[] temp = elementData;
        elementData = new int[elementData.length * 2];

        for(int i = 0; i < temp.length; i++){
            elementData[i] = temp[i];
        }

    }

}
