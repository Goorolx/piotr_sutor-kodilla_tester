package a30DayExamples.Day18QueueStacks;

import java.util.LinkedList;
import java.util.Stack;

public class QueueS {
    LinkedList queue;

    //Making queue instance
    public QueueS(){
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
    public void enqueue(String n){
        queue.addLast(n);
    }
    //dequeuing an item
    public String dequeue(){
        return (String) queue.remove(0);
    }
    //peek at the first item
    public String peek (){
        return (String) queue.get(0);
    }

    public static void main(String[] args) {
        QueueS stringQ = new QueueS();
        stringQ.enqueue("hi");
        stringQ.enqueue("there");
        System.out.print(stringQ.dequeue() + " ");
        System.out.println(stringQ.dequeue()+".");

        Stack<String> stacky = new Stack<>();
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop()+ " ");
        System.out.println(stacky.peek() + " peek");
        System.out.println(stacky.size());
        System.out.println(stacky.pop()+ "! ");

    }

}
