/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myabstract;



/**
 *
 * @author Mike
 */
public class SalariedEmployee extends Employee {
    
    public SalariedEmployee(String name, int age, int employeeNo, double pay) {
        this.name = name;
        this.age = age;
        this.employeeNo = employeeNo;
        this.pay = pay;
    }
    
    @Override
    public double getPay() {
        return pay;
    }



    
}
