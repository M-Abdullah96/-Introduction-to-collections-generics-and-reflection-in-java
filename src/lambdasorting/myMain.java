package lambdasorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class myMain {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person(22,"Abdullah"));
        people.add(new Person(24,"shahbaz"));
        people.add(new Person(44,"salman"));
        people.add(new Person(55,"ahmed"));
        people.add(new Person(19,"attaullah"));
        people.add(new Person(26,"ali"));

        //Lambda expression
        //Collections.sort(people, Comparator.comparing(Person::getAge).reversed());

        //we can compare on the base of multiple parameters in the custom object's case
        Collections.sort(people, Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());

        for(Person person: people){
            System.out.println(person);
        }
    }
}
