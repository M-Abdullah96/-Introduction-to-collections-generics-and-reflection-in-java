package sortingcollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("abdullah");
        list.add("ali");
        list.add("salman");
        list.add("haasha");
        list.add("umer");

        Collections.sort(list, Collections.reverseOrder());

        for(String str:list){
            System.out.println(str);
        }
    }
}
