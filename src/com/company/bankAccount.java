package com.company;

public class bankAccount {
    int accountNumber= 123456789;
    private double balance= 50.0;
    String customerName= "Jiahao";
    String email= "jwang9528@gmail.com";
    int phoneNumber= 12345678;

    public bankAccount(String customerName) {
        this.customerName = customerName;
    }

    public void deposit(int amount){
        this.balance+= amount;
        System.out.println("Deposit succeed, your account balance is: "+ this.balance);
    }

    public void withdraw(int amount){
        if(this.balance>= amount){
            this.balance-= amount;
            System.out.println("Withdraw succeed, your account balance is: "+ this.balance);
        }
        else {
            System.out.println("Withdraw failed, "+ this.customerName+ "'s account balance: "+ this.balance);
        }
    }

    public void customerInfo(){
        System.out.println("Customer name: "+ this.customerName);
        System.out.println("Account Number: "+ this.accountNumber);
        System.out.println("Balance: "+ this.balance);
        System.out.println("Email address: "+ this.email);
        System.out.println("Phone number: "+ this.phoneNumber);
    }

}
