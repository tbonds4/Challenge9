/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter9;

import java.util.Scanner;

/**
 *
 * @author tbonds4
 */
public class Chapter9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String name;
        String address;
        double phone;
        int list;
        boolean mail;
        double customerNumber;
        double purchases;
        
        System.out.println("What is the new Customers name?");
        name = user.nextLine();
        System.out.println("What is their address?");
        address = user.nextLine();
        System.out.println("What is their phone number?");
        phone = user.nextDouble();
        System.out.println("Assign a customer number:");
        customerNumber = user.nextDouble();
        System.out.println("Would they like to b on the mailing list?"
                + "\n0 for yes, 1 for no");
        list = user.nextInt();
        System.out.println("How much did they purchases?");
        purchases = user.nextDouble();
        
        mail = list == 0;
        
        PreferredCustomer one = new PreferredCustomer(name, address, 
                phone, mail, customerNumber, purchases);
        System.out.println(one.isMailingList());
        System.out.println(one.FindDiscount(purchases));
        System.out.print("Name: " + one.getName()+
                "\nAdress: " + one.getAddress()+
                "\nPhone Number: " + one.getNumber() +
                "\nCustomer Number: " + one.getCustomerNumber() +
                "\nOn mailing list? " + one.isMailingList() +
                "\nDiscount for purchases: " + one.FindDiscount(purchases));
        
    }
   
}
