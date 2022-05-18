package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        //Treemap use doubly linkedlist and red black tree for the implementation
        //Treemap inset the items is sorted order
        //O(log(N))
        Map<Integer,String> myTreeMap=new TreeMap<>(Comparator.reverseOrder());
         myTreeMap.put(22,"mango");
         myTreeMap.put(10,"mango");
         myTreeMap.put(11,"mango");
         myTreeMap.put(2,"mango");
         myTreeMap.put(1,"mango");
         myTreeMap.put(27,"mango");

         for(Integer it:myTreeMap.keySet()){
             System.out.println(it+" - "+myTreeMap.get(it));
         }
    }
}
