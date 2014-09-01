/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myinterface;

import java.text.DecimalFormat;

/**
 *
 * @author Mike
 */
public interface Employee {
    final static DecimalFormat money = new DecimalFormat("0.00");
    
    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);
    
    public void setPay(double pay);
    
    public abstract double getPay();

    public int getEmployeeNo();





    
    
}




