package Reflection;

public class Person {

    public String name = "richard";
    private String idcard = "14253456";

    public String toString(){
        return "name:" + name + " idcard:" + idcard;
    }

    public Person(){
        System.out.println("Person类无参数构造");
    }

    public Person(int a, int b, String s){
        System.out.println("Person类有参数构造:a" + a + "b:" + b + "s:" + s);
    }

    private Person(int a){
        System.out.println("Person类有参数的私有构造a：" + a);
    }

    public void show(){
        System.out.println("show 空参数");
    }

    public void show(int a){
        System.out.println("show a:" + a);
    }

    public void show(String s){
        System.out.println("show s:" + s);
    }
}
