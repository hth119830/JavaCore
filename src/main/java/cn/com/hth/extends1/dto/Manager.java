package cn.com.hth.extends1.dto;

/**
 * TODO
 *
 * @author Dhcc.Hantonghao
 * @version 1.0
 * @date 2021/1/4 21:30
 */
public class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    private String s(){
        return "Manager";
    }


}
