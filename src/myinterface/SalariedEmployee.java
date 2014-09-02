/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

/**
 *
 * @author Mike
 */
public class SalariedEmployee implements Employee{
    public String name;
    public int age;
    public double pay;
    public int employeeNo;
    
    public SalariedEmployee(String name, int age, int employeeNo, double pay) {
        this.name = name;
        this.age = age;
        this.employeeNo = employeeNo;
        this.pay = pay;
    }
    
    @Override
    public String getName() {
       return name; 
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
       this.age = age;
    }

    @Override
    public void setPay(double pay) {
       this.pay = pay;
    }

    @Override
    public double getPay() {
        return pay;
    }
    
    @Override
    public int getEmployeeNo() {
        return employeeNo;
    }
}
