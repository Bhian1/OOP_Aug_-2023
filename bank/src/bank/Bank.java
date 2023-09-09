/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author User
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
        BankAccount myAccount = new BankAccount("123456789", 1000.00, "Bhian Cyrus", "bhian@cyrus.com", "09111111111");

        System.out.println("Initial Account Information:");
        displayAccountInfo(myAccount);

        myAccount.deposit(500.00);
 
        myAccount.withdraw(200.00);

        myAccount.withdraw(1000.00);

        System.out.println("\nUpdated Account Information:");
        displayAccountInfo(myAccount);
    }

    public static void displayAccountInfo(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Customer Name: " + account.getCustomerName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone Number: " + account.getPhoneNumber());
        System.out.println("Account Balance: " + account.getAccountBalance());
    }
}


