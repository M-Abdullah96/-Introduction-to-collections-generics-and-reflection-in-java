package typeinference;

import java.util.ArrayList;
import java.util.List;
//type inferance
class Person implements Comparable<Person>{
    int age;
    String name;
    Person(String nam, int ag){
        this.age=ag;
        this.name=nam;
    }
    int getAge(){
        return this.age;
    }
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public String toString() {
        return "typeinference.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class  Bucket<T>{
   private  T item;
   public void setItem(T t){
        this.item=t;
    }
   public T getItem(){
        return this.item;
    }
}

public class main {
    public static <T> void addStore(T t, List<Bucket<T>> list){
        Bucket<T> bucket=new Bucket<>();
        bucket.setItem(t);
        list.add(bucket);
        System.out.println("Item is added to the store....");
    }
    // type inference
    public static <T extends Number> double add(T num1, T num2){
        return num1.doubleValue()+num2.doubleValue();
    }
    public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
        if(num1.compareTo(num2)<0){
            return num1;
        }
        return num2;
    }
    public static void main(String[] args) {
        System.out.println("hello to the java world");
        System.out.println(calculateMin(3,1));
        System.out.println(calculateMin(new Person("Abdullah", 25), new Person("Umer", 21)));
        System.out.println(add(12.8,56.6f));
        List<Bucket<String>> list=new ArrayList<>();
        //type inference is being used here
        //compiler will tries to find the most suitable type that works will all of them
        main.<String>addStore("pepsi",list);
    }
}
