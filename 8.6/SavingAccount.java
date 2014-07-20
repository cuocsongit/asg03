/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop.account;

/**
 *
 * @author cuocsongit
 */
public class SavingAccount {

    /**
     * @param args the command line arguments
     */
    private static double annualInterestRate ;
    private double savingsBalance;
    
    public SavingAccount(double money) {
        if( money > 0) {
            savingsBalance = money;
        }
        else {
            System.out.println("Invalid money set to 0");
            savingsBalance = 0;
        }
    }
    
    public SavingAccount(SavingAccount balance) {
        savingsBalance = balance.savingsBalance;
    }
    
    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * annualInterestRate / 12;
    }
    
    public static void modifyInterestRate(double rate) {
        annualInterestRate = rate;
    }
    
    public double getAccount() {
        return savingsBalance;
    } 
    
}
