package oop.account;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cuocsongit
 */
public class SavingAccountDemo {
    public static void main(String [] args) {
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);
        SavingAccount.modifyInterestRate((double)4/100);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("First account is  " + saver1.getAccount() + " $");
        System.out.println("Second account is  " + saver2.getAccount() + " $");
        
        SavingAccount.modifyInterestRate((double)5/100);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("First account is  " + saver1.getAccount() + " $");
        System.out.println("Second account is  " + saver2.getAccount() + " $");
    }
}
