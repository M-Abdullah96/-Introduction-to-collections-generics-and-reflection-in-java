import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lowerBoundedWildcards {
    public static <T> void copy(List<? extends T> source, List<? super T> destination){
        for(int i=0;i<source.size();i++){
            destination.add((source.get(i)));
        }
    }
    public static void showAll(List< ? super Number> list){
        for(Object obj: list)
            System.out.println(obj);
    }
    public static void main(String[] args) {
        System.out.println("hi");
        List<? super Integer> l1=new ArrayList<Integer>();
        List<? super Integer> l2=new ArrayList<Number>();
        List<? super Integer> l3=new ArrayList<Object>();

        //this is how to read items using lower bounded wildcard
        List<Serializable> list=new ArrayList<>();
        list.add("abdullah");
        list.add("ali");
        list.add("usman");
        showAll(list);

        //insert items
        List<? super Number> num=new ArrayList<>();
        num.add(3);
        num.add(3.3);
        num.add(3.3f);
        showAll(num);

        //implementing a copy function that copy data from one list to another
        List<String> source= Arrays.asList("abdullah", "abdul hadi", "ali");
        List<String> destination=new ArrayList<>();
        copy(source, destination);
        System.out.println(destination);



    }
}
