package cn.com.hth.interface1.dto;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/7 21:47
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.hireDay = calendar.getTime();
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;

    }

    private String s(){
        return "Employee";
    }




    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.getSalary());
    }
}
