package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取成员方法
 */
public class ReflectTest4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Person.class;
        Object o = clazz.newInstance();

        Method[] declaredMethods = clazz.getMethods();
        for (Method method : declaredMethods){
            System.out.println(method);
        }
        Method method1 = clazz.getMethod("show");
        method1.invoke(o);

        Method method2 = clazz.getMethod("show",
                int.class);
        method2.invoke(o,2);

        Method method3 = clazz.getDeclaredMethod("show",String.class);
        method3.invoke(o,"你好啊");

    }
}
