import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("hello to the generics world!");
        List<String> list=new ArrayList<>();
        list.add("Abdullah");
        list.add("Abdullah");
        list.add("Abdullah");
        list.add("Abdullah");

        //traversing the string array using iterator
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //traversing the string array using for each loop
        for(String st:list){
            System.out.println(st);
        }

        ArrayList<Integer> arrayList=new ArrayList<>();
        long now=System.currentTimeMillis();
        for(int i=0;i<500000;i++){
            arrayList.add(1);
        }
        System.out.println("Time taken by arraylist: "+(System.currentTimeMillis()-now));
        LinkedList<Integer> linkedList=new LinkedList<>();
         now=System.currentTimeMillis();
        for(int i=0;i<500000;i++){
            linkedList.addLast(1);
        }
        System.out.println("Time taken by linkedlist: "+(System.currentTimeMillis()-now));
    }
}
