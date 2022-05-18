package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollections {
    public static void main(String[] args) {

    List<Integer> list= Collections.synchronizedList(new ArrayList<>());

    Thread thread1=new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i=0;i<1000;i++){
                list.add(2);
            }
        }
    });

    Thread thread2=new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i=0;i<1000;i++){
                list.add(2);
            }
        }
    });
    thread1.start();
    thread2.start();



        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("size of the array is: "+list.size());
    }
}

