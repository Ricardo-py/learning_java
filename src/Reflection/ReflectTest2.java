package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 获取构造方法
 */
public class ReflectTest2 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Person.class;

        //这个是所有的公共constructor
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }

        //得到无参构造
        Constructor c1 = clazz.getConstructor();
        Object o1 = c1.newInstance();

        //得到有参构造
        Constructor c2 = clazz.getConstructor(int.class, int.class, String.class);
        Object o2 = c2.newInstance(1,1,"你好啊");

        //得到私有构造
        Constructor c3 = clazz.getDeclaredConstructor(int.class);

        //暴力反射
        c3.setAccessible(true);
        Object o3 = c3.newInstance(1);


    }
}
