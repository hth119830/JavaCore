package cn.com.hth.extends1.test;

import cn.com.hth.extends1.dto.Employee;
import cn.com.hth.extends1.dto.Manager;

import java.lang.reflect.*;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/5 23:10
 */
public class Reflacts {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
//        Employee e = new Employee("Employee", 50000.0, 1983, 12, 23);
//
//        Class<? extends Employee> cl = e.getClass();
//        System.out.printf("返回类的名字 %s",cl.getName());
//        // 返回public 类的域，参数。
//        Field[] fields = cl.getFields();
//        // 全部
//        cl.getDeclaredFields();
//
//        // 返回public 类的方法信息
//        Method[] methods = cl.getMethods();
//        cl.getDeclaredMethods();
//
//        // 返回public 类的构造参数
//        Constructor<?>[] canonicalName = cl.getConstructors();
//        cl.getDeclaredConstructors();


//        Class s = Employee.class;

        Employee e = new Employee("ss", 50000.0, 1983, 12, 23);
        Class<? extends Employee> cs = e.getClass();

//        Class sd = Class.forName("");


//        Field name = aClass.getDeclaredField("name");
//        // 使用 modifiers 返回类的修饰符，整形
//        System.out.println(name.getModifiers());
//        // 使用 对修饰符进行判断
//        System.out.println(Modifier.isPrivate(name.getModifiers()));
//        // 打印 修饰符
//        System.out.println(Modifier.toString(name.getModifiers()));


        Field name = cs.getDeclaredField("name");
        name.setAccessible(true);
        String a = "";
//        String o = (String) name.get(new Employee());
        Object o = name.get(e);
        System.out.println(o);

//        String name1 = cs.getName();
        tet();


    }

    public static   void  tet() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//
        Class s = Employee.class;

        Employee e = new Employee("Emplossyee", 50000.0, 1983, 12, 23);
        Class<? extends Employee> aClass = e.getClass();

//        Class sd = Class.forName("");

        Method name = aClass.getDeclaredMethod("getName");
        name.setAccessible(true);
        String invoke = (String)name.invoke(e, null);
        System.out.println(invoke);
        System.out.println(name.getModifiers());
//
    }


}

