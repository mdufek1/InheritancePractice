/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;
import myabstract.*;
/**
 *
 * @author Mike
 */
public class AbstractInheritancePractice {
    
    public static void main(String[] args) {
        
    
        HourlyEmployee ricky = new HourlyEmployee("Ricky",27,589,9.30);
        SalariedEmployee randy = new SalariedEmployee("Randy", 45,781, 70581.54);
        SalaryPlusCommissionEmployee robert = new SalaryPlusCommissionEmployee("Robert", 29,485, 50487.79, 12.13);
        
        ricky.setHoursWorked(40);
        System.out.println(ricky.getName()+"(Employee number - "+ricky.getEmployeeNo()+") made $"+ricky.getPay()+" this week");
        
        System.out.println(randy.getName()+"(Employee number - "+randy.getEmployeeNo()+") makes $"+randy.getPay()+" per year.");
        
        robert.setSales(12);
        System.out.println(robert.getName()+"(Employee number - "+robert.getEmployeeNo()+") made $"+robert.getPay()+
                " this year, including the commission from "+robert.getSales()+" sales at $"+robert.getCommission()+" per sale");
    }    
    
}
