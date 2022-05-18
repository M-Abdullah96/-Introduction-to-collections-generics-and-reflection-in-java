package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collections {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(66);
        list.add(-22);
        list.add(67);
        list.add(52);

        Collections.reverse(list);

        for (Integer i: list){
            System.out.println(i);
        }

        System.out.println();
        //minimum item in the array
        System.out.println(Collections.min(list));

        System.out.println();
        //maximum item in the list
        System.out.println(Collections.max(list));

        //we can rotate the value of a list
       // Collections.rotate(list,1);

        //we can replace the items in the list
        Collections.replaceAll(list,4,99);

        // we can use Collections.unmodifiableList() to get a list that cannot be modify.
        //can not add or remove item from the list


        //shuffling the items of a list
        Collections.shuffle(list);
        for (Integer i: list){
            System.out.print(i+"  ");
        }
    }
}
