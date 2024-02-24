package com.Nikhil.StacksQueues;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        data = new int[size];
    }

    public boolean isFull(){
        return size == data.length - 1;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int item) throws Exception{

        if (isFull()){
            throw new Exception("Queue is full.");
        }

        data[end++] = item;
        end %= data.length;
        size++;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty.");
        }

        int removed = data[front++];
        front %= data.length;
        size--;

        return removed;
    }

    public void display(){
        int i = front;
        do {
            System.out.print(data[i]+" <-- ");
            i++;
            i %= data.length;
        }while(i != end);
        System.out.println("END");
    }
}
