package hashmap;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> myMap=new HashMap<>();
        Map<Person, String> myPersonMap=new HashMap<>();

        //insertion is O(1) operation if there is no collision
        myMap.put(1,"Abdullah");
        myMap.put(4,"Maria");
        myMap.put(6,"Umer");
        myMap.put(3,"Moon");
        //removal is O(1) operation
        myMap.remove(1);

        //System.out.println(myMap.get(3));

        for(Integer it:myMap.keySet()){
            System.out.println(myMap.get(it));
        }
        //other wat to traverse the map using entry set
        for(Map.Entry<Integer,String> entry:myMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

        myPersonMap.put(new Person(22,"Abdullah"),"Employee");
        myPersonMap.put(new Person(23,"Haasha"),"Employee");
        myPersonMap.put(new Person(25,"Ahmed"),"Employee");

        for(Map.Entry<Person,String> entry:myPersonMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }



    }
}
