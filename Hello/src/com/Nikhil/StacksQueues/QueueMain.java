package com.Nikhil.StacksQueues;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CircularQueue queue = new CircularQueue ();

        queue.insert(4);
        queue.insert(3);
        queue.insert(7);
        queue.insert(89);
        queue.insert(23);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();

        System.out.println(queue.remove());
        queue.insert(69);
        queue.display();
    }
}
