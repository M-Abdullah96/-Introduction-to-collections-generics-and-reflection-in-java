package homework01;

import java.util.ArrayList;
import java.util.List;

public class Library <T extends Algorithm> {
    private List<T> list;
    public Library(){
        this.list=new ArrayList<>();
    }
    public void addItem(T algorithm){
        this.list.add(algorithm);
    }
    public T getLast(){
        if (this.list.size()<=0)
                return null;
        return this.list.remove(this.list.size()-1);

    }
}
