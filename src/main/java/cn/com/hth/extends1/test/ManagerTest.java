package cn.com.hth.extends1.test;

import cn.com.hth.extends1.dto.Employee;
import cn.com.hth.extends1.dto.Manager;

import java.util.ArrayList;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/4 21:37
 */
public class ManagerTest {

    public static void main(String[] args) {
        Manager e ;
//        e = new Employee("Employee",50000.0,1983,12,23);
        e = new Manager("Employee",50000.0,1983,12,23);
//        Employee s = new Employee("Employee",50000.0,1983,12,23);
//        Employee[] staff = new Employee[3];
//        staff[0] = e;
//        e.setBonus(5000);
////        Manager m = staff[1];
//        Manager[] managers = new Manager[10];
//        Employee[] staffPro = managers;
//        staffPro[0] = new Employee("Employee",50000.0,1983,12,23);
//        managers[0].setBonus(10000);

        System.out.println(e instanceof
                Employee);

//        AbstractSet

//        Arrays.equals();
        int hash = 0;
//        for (:
//             ) {

//        }
        int s = 11;
        String a = "sdsd";
        System.out.printf("%d 合适的发 %s",s,a);


    }


    public void test1(){
        String a = "";
        StringBuffer sb = new StringBuffer();

        ArrayList<Employee> list = new ArrayList<>(100);
        String[] strings = new String[3];
        list.trimToSize();
//        strings
//        list.ensureCapacity(100);
//        List<String> list = new ArrayList<>();
        ArrayList<Employee> arrayList = arrayList("aa");

    }


    public ArrayList arrayList (String arrayList){
        return new ArrayList<>();
    }





}
