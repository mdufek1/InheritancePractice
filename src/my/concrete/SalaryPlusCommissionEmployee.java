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
    private int sales;
    private double commission;
    
    public SalaryPlusCommissionEmployee(String name, int age, double pay, double commission) {
        super(name, age, pay);
        this.commission = commission;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
    public void calculateCommission(SalaryPlusCommissionEmployee employee){
        System.out.println(employee.getName()+" makes, $"+money.format(employee.commission*employee.sales)+" off of "+employee.sales+" commission sale(s).");
    }
    
    public void calculatePay(SalaryPlusCommissionEmployee employee){
        System.out.println(employee.getName()+" makes, $"+(money.format(employee.getPay()+(employee.commission*employee.sales)))+" a year, if they make "+employee.sales+" sales a year");
    }
    
    
}
