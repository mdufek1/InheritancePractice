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
public class SalariedEmployee extends Employee {
    
    public SalariedEmployee(String name, int age, double pay) {
        super(name, age, pay);
    }
    
    public void payCheck(SalariedEmployee employee){
        System.out.println(employee.name+" makes, "+employee.pay+" per year.");
    }
    
}
