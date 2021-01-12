package cn.com.hth.extends1.test;

import cn.com.hth.extends1.dto.Employee;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/6 22:24
 */
public class ArraysTest {
    public static void main(String[] args) {
        Employee[] a = new Employee[100];
        a = Arrays.copyOf(a,2*a.length);
        System.out.println(a.length);
        Employee[] objects =(Employee[]) goodCopyOf(a, 300);
        System.out.println(objects.length);
    }

    public static Object[] badCopyOf(Object[] a,int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return newArray;
    }

    public static Object goodCopyOf(Object a,int newLength){
        // 判断是否是数组。
        Class cs = a.getClass();
        if(!cs.isArray()){
            return null;
        }
        //非数组类型不能通过 getComponentType 获取class对象
        Class componentType = cs.getComponentType();
        // 调用反射 Arrays 获取 类型
        int length = Array.getLength(a);
        Object o = Array.newInstance(componentType, newLength);
        System.arraycopy(a,0,o,0,Math.min(length,newLength));
        return o;
    }

}
