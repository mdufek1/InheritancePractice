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
public class SalaryPlusCommissionEmployee extends SalariedEmployee{
    private int sales;
    private double commission;
    
    public SalaryPlusCommissionEmployee(String name, int age, int employeeNo, double pay, double commission) {
        super(name, age, employeeNo, pay);
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
    

}
