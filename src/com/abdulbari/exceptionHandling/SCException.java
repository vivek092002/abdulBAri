package com.abdulbari.exceptionHandling;

class StackOverFlow extends Exception{
    public String toString(){
        return "STACK IS FULL";
    }
}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}


class Stack {
    private int size;
    private int top = -1;
    private int stack[];

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int x) throws StackOverFlow{
        if (top == size-1){
            throw new StackOverFlow();
        }
        top++;
        stack[top] = x;
    }

    public int pop() throws StackUnderFlow{
        int x = -1;
        if (top == -1){
            throw new StackUnderFlow();
        }
        x = stack[top];
        top--;
        return x;
    }

}

public class SCException {
    public static void main(String[] args)  {
        try {
            Stack st = new Stack(5);
            st.push(12);
            st.push(15);
        } catch (StackOverFlow e){
            System.out.println(e);
        }

    }
}
