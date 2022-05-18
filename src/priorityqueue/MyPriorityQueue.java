package priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Person> myPriorityQue=new PriorityQueue<>();
        myPriorityQue.add(new Person(2,"ali"));
        myPriorityQue.add(new Person(10,"adam"));
        myPriorityQue.add(new Person(22,"evil"));
        myPriorityQue.add(new Person(32,"kecen"));

        while(!myPriorityQue.isEmpty()){
            System.out.println(myPriorityQue.poll());
        }
    }
}
