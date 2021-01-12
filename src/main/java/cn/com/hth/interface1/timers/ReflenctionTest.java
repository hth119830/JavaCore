package cn.com.hth.interface1.timers;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/7 23:16
 */
public class ReflenctionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String a = "cn.com.hth.interface1.timers.TalkingClock$TimePrinter";
        Class<?> aClass = Class.forName(a);
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println(declaredMethods[i].getName());
        }


    }
}
