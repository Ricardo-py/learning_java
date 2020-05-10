package Reflection;

import java.lang.reflect.Field;

/**
 * 获取成员变量
 */
public class ReflectTest3 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class clazz = Person.class;

        //通过公共的无参构造方法创建实例
        Object obj = clazz.newInstance();

        //通过Person的Class类获得所有的公共成员变量
        Field[] fields = clazz.getFields();

        for (Field s : fields)
            System.out.println(s);

        //获得name属性
        Field field = clazz.getField("name");

        //给name属性赋值为haha
        field.set(obj,"haha");

        System.out.println(obj);

        Field field2 = clazz.getDeclaredField("idcard");
        field2.setAccessible(true);

        //给idcard赋值
        field2.set(obj,"123456");
        System.out.println(obj);
    }
}
