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
    public double commission;
    
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
   
    public void CalculatePay(SalaryPlusCommissionEmployee employee){
        System.out.println(employee.name+" makes, $"+(employee.pay+(employee.commission*employee.sales))+" a year, if they make "+employee.sales+" sales a year");
    }
    
    
}
