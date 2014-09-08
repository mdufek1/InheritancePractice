/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritancepractice;
import java.text.DecimalFormat;
import myinterface.*;
/**
 *
 * @author Mike
 */
public class InterfaceInheritancePractice {
    public static void main(String[] args) {
        DecimalFormat money = new DecimalFormat("0.00");
        
        HourlyEmployee nick = new HourlyEmployee("Nick",20,456,10.00);
        SalariedEmployee aly = new SalariedEmployee("Aly", 19,123, 86512.21);
        SalaryPlusCommissionEmployee matt = new SalaryPlusCommissionEmployee("Matt", 25,648, 60456.79, 14.50);
        
        nick.setHoursWorked(40);
        System.out.println(nick.getName()+"(Employee number - "+nick.getEmployeeNo()+") made $"+money.format(nick.getPay())+" this week");
        
        System.out.println(aly.getName()+"(Employee number - "+aly.getEmployeeNo()+") makes $"+money.format(aly.getPay())+" per year.");
        
        matt.setSales(14);
        System.out.println(matt.getName()+"(Employee number - "+matt.getEmployeeNo()+") made $"+money.format(matt.getPay())+
                " this year, including the commission from "+matt.getSales()+" sales at $"+money.format(matt.getCommission())+" per sale");
    }
}
