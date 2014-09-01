/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public abstract class Employee {
    public String name;
    public int age;
    public double pay;
    public int employeeNo;
    DecimalFormat money = new DecimalFormat("0.00");
    
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
    
    public void setPay(double pay) {
        this.pay = pay;
    }
    
    public abstract double getPay();

    public int getEmployeeNo() {
        return employeeNo;
    }





    
    
}


