package homework01;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Library<Algorithm> library=new Library<>();

        library.addItem(new SearchingAlgorithm());
        library.addItem(new SortingAlgorithm());
        library.addItem(new GraphAlgorithm());

        Algorithm item=library.getLast();
        while(item!=null){
            item.execute();
            item=library.getLast();
        }

    }
}
