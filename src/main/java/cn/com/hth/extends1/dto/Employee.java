package cn.com.hth.extends1.dto;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/4 21:26
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    public Double ss;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(hireDay, employee.hireDay);
    }

    @Override
    public int hashCode() {
//        int s = 7*Objects.hashCode(name)+11*new
//        super.getClass();
//        Class<?> superclass = getClass().getSuperclass();
        return Objects.hash(name, salary, hireDay);
    }
}
