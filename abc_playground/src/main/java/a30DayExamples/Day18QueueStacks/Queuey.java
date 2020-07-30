package a30DayExamples.Day18QueueStacks;

import java.util.LinkedList;

public class Queuey {
    LinkedList queue;

    //Making queue instance
    public Queuey(){
        queue  = new LinkedList();
    }
    //checking if our que is empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    //what is size of our queue
    public int size(){
        return queue.size();
    }
    //enqueuing an item
    public void enqueue(int n){
        queue.addLast(n);
    }
    //dequeuing an item
    public int dequeue(){
        return (int) queue.remove(0);
    }
    //peek at the first item
    public int peek (){
        return (int) queue.get(0);
    }

    public static void main(String[] args) {
        Queuey numQueue = new Queuey();
        numQueue.enqueue(5);
        numQueue.enqueue(7);
        numQueue.enqueue(6);
        System.out.println("First out: "+numQueue.dequeue());
        System.out.println("Peek att First item: "+numQueue.peek());
        System.out.println("Second out: "+ numQueue.dequeue());
        System.out.println("Third out: "+ numQueue.dequeue());
    }

}
