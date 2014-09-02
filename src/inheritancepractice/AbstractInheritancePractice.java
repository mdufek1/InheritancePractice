/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;
import java.text.DecimalFormat;
import myabstract.*;
/**
 *
 * @author Mike
 */
public class AbstractInheritancePractice {
    
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("0.00");
    
        HourlyEmployee ricky = new HourlyEmployee("Ricky",34,589,11.20);
        SalariedEmployee randy = new SalariedEmployee("Randy", 33,781, 80281.54);
        SalaryPlusCommissionEmployee robert = new SalaryPlusCommissionEmployee("Robert",36,485, 55477.79, 12.13);
        
        ricky.setHoursWorked(40);
        System.out.println(ricky.getName()+"(Employee number - "+ricky.getEmployeeNo()+") made $"+money.format(ricky.getPay())+" this week");
        
        System.out.println(randy.getName()+"(Employee number - "+randy.getEmployeeNo()+") makes $"+money.format(randy.getPay())+" per year.");
        
        robert.setSales(12);
        System.out.println(robert.getName()+"(Employee number - "+robert.getEmployeeNo()+") made $"+money.format(robert.getPay())+
                " this year, including the commission from "+robert.getSales()+" sales at $"+money.format(robert.getCommission())+" per sale");
    }    
    
}
