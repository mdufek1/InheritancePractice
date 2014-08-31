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
public class HourlyEmployee extends Employee {
   
    public double hoursWorked;

    public HourlyEmployee(String name, int age, int employeeNo, double pay) {
        this.name = name;
        this.age = age;
        this.employeeNo = employeeNo;
        this.pay = pay;
    }

    public HourlyEmployee(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
        
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getPay() {
       return (pay*hoursWorked);
    }



    
}
