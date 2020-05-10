package Reflection;

public class ReflectTest {


    //三种获取Class对象的方式
    public static void main(String[] args){

        Person p1 = new Person();

        Class cc = p1.getClass();

        System.out.println(cc);

        Class c2 = Person.class;
        System.out.println(c2);

        Class c3 = null;
        try {
            c3 = Class.forName("Reflection.Person");
            System.out.println(c3);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(cc == c2);
        System.out.println(cc == c3);
    }
}
