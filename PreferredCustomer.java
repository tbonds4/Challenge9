/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

/**
 *
 * @author tbonds4
 */
public class PreferredCustomer extends Customer{
    private double purchases;
    private double discount;

    public PreferredCustomer(String name, String address, double number,
            boolean mailingList, double customerNumber, double purchases) {
        super(name, address, number, mailingList, customerNumber);
    }

    public double getPurchases() {
        return purchases;
    }

    public void setPurchases(double purchases) {
        this.purchases = purchases;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double FindDiscount(double purchases) {
        if(purchases <= 2000){
            discount = 0.1;
        }else if(purchases <= 1500){
            discount = 0.07;
        }else if(purchases <= 1000){
            discount = 0.06;
        }else if(purchases <= 500){
            discount = 0.05;
        }else{
            discount = 0;
        }
        return discount;
    }

    
}
