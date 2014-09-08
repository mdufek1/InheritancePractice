/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

/**
 *
 * @author Mike
 */
public class HourlyEmployee extends Employee {
    private double hoursWorked;
    public HourlyEmployee(String name, int age, double pay) {
        super(name, age, pay);
    }
    
    public void calculatePay(String name, double hoursWorked, double pay){
        System.out.println(name+" earned: $"+money.format(hoursWorked*pay)+" this week.");
    }
        
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
}
