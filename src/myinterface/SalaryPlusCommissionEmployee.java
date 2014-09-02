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
    public int sales;
    public double commission;
    
    public SalaryPlusCommissionEmployee(String name, int age, int employeeNo, double pay, double commission) {
        super(name, age, employeeNo, pay);
        this.commission = commission;
    }
    
    @Override
    public String getName() {
       return name; 
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
       this.age = age;
    }

    @Override
    public void setPay(double pay) {
       this.pay = pay;
    }

    @Override
    public double getPay() {
        return pay+(sales*commission);
    }
    
    @Override
    public int getEmployeeNo() {
        return employeeNo;
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
