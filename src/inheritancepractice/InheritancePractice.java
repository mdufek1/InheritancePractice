/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;

import my.concrete.*;
/**
 *
 * @author Mike
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HourlyEmployee trevor = new HourlyEmployee("Trevor",27,9.30);
        SalariedEmployee lucy = new SalariedEmployee("Lucy", 45, 70581.54);
        SalaryPlusCommissionEmployee cory = new SalaryPlusCommissionEmployee("Cory", 29, 50487.79, 12.13);
        
        trevor.setHoursWorked(36);
        
        trevor.calculatePay(trevor.getHoursWorked(),trevor.getPay());
        
    }
    
}
