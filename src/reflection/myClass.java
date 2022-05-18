package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class myClass  {
    public static void main(String[] args) throws Exception{
        Class<Person> myclass=Person.class;
        System.out.println("package name: "+myclass.getPackage());

        //getting all the fields of the class
        Field[] fields=myclass.getFields();
        //if we want to get the private field names than we should use         Field[] fields=myclass.getDeclaredFields();
        for(Field field: fields)
            System.out.println("field type: "+field.getType()+"   field name: "+field.getName());

        //getting all the methods of a class
        Method[] methods=myclass.getMethods();
        for (Method method: methods)
            System.out.println("method return types: "+method.getReturnType()+"  mehtod name: "+method.getName());

        //now getting the constructor of the class
        Constructor<Person> myClassConstructor=myclass.getConstructor();
        Person person=myClassConstructor.newInstance();
       System.out.println(person);

       //if we want to instantiate a private constructor than we have to true the accessibility
        Constructor<PersonCopy> personCopyConstructor=PersonCopy.class.getDeclaredConstructor();
        personCopyConstructor.setAccessible(true);
        PersonCopy personCopy=personCopyConstructor.newInstance();
        PersonCopy personCopy2=personCopyConstructor.newInstance();
        PersonCopy personCopy3=personCopyConstructor.newInstance();
        PersonCopy personCopy4=personCopyConstructor.newInstance();
        //by using singleton pattern means by making constructor private  we can instantiate only one class
        //but by reflection we can instantiate as many instance as we want
        //solution to this problem is Joshua Bloch's solution using ENUM
        System.out.println(personCopy);
        System.out.println(personCopy2);
        System.out.println(personCopy3);
        System.out.println(personCopy4);
        System.out.println();

        //now getting all the interfaces that a class have implemented
        Class[] interfaces=myclass.getInterfaces();
        for (Class clas: interfaces)
            System.out.println(clas.getName());


        //getting annotated methods
        Method[] methods1=PersonCopy.class.getMethods();
        for(Method m: methods1)
            if(m.isAnnotationPresent(MyAnnotation.class))
                System.out.println(m.getName());


    }
}
