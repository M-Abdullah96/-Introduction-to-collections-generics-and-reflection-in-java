package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    //bounded type parameter
    public static <T extends shape >void drawAll(List<T> list){
        for(T sh: list){
            sh.draw();
       }
    }
    //wild card
    public static void print(List<?> list){
        for(Object o: list) {
            System.out.println(o.toString());
        }
    }
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4);
        Integer i=15;
        print(list);
        List<Rectangle>  rectangles=new ArrayList<>();
        rectangles.add(new Rectangle());
        drawAll(rectangles);
    }
}
