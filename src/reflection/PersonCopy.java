package reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    public String name();
}
public class PersonCopy {
    public int age;
    public String name;
    private int temp;

    private PersonCopy() {
    }

    @Override
    public String toString() {
        return "PersonCopy{}";
    }

    public PersonCopy(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @MyAnnotation(name="myannotation")
    public String getNameTemp(){
        return "temp";
    }
}
