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
public class Customer extends Person {
    private boolean mailingList;
    private double customerNumber;

    public Customer(String name, String address, double number,
            boolean mailingList, double customerNumber) {
        super(name, address, number);
        this.mailingList = mailingList;
        this.customerNumber = customerNumber;

    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
        char onList;
        
    }

    public double getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
       
    }
}
