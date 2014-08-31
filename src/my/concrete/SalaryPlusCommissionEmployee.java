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
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    public int sales;
    public int commission;
    
    public SalaryPlusCommissionEmployee(String name, int age, double payRate) {
        super(name, age, payRate);
    }
   
    public void CalculatePay(double pay, double commission, int sales){
        System.out.println(pay+(commission*sales));
    }
    
    
}
