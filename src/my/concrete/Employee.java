/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.concrete;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public class Employee {
    public String name;
    public int age;
    public double pay;
    DecimalFormat money = new DecimalFormat("0.00");
    
    public Employee(String name, int age, double pay) {
        this.name = name;
        this.age = age;
        this.pay = pay;
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

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }


    
    
}
