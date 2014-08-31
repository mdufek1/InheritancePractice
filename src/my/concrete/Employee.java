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
public class Employee {
    public String name;
    public int age;
    public double payRate;
    public double hoursWorked;
    
    public Employee(String name, int age, double payRate) {
        this.name = name;
        this.age = age;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    public void CalculatePay(double hoursWorked, double payRate){
        System.out.println(hoursWorked*payRate);
    }
    
    
    
}
