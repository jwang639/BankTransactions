package com.company;

public class bankAccount {
    private int AccountNumber= 123456789;
    private double Balance= 50.0;
    private String CustomerName= "Jiahao";
    private String Email= "jwang9528@gmail.com";
    private int PhoneNumber= 12345678;

    public bankAccount(int accountNumber, String customerName) {
        AccountNumber = accountNumber;
        CustomerName = customerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void deposit(int amount){
        if(amount>= 5&& amount<= 10000){
            this.Balance+= amount;
            System.out.println("Deposit succeed, your account balance is: "+ this.Balance);
        }
        else{
            System.out.println("Deposit failed, amount should be larger than 5 or less than 10000");
        }
    }

    public void withdraw(int amount){
        if(this.Balance>= amount){
            this.Balance-= amount;
            System.out.println("Withdraw succeed, your account balance is: "+ this.Balance);
        }
        else {
            System.out.println("Withdraw failed, "+ this.CustomerName+ "'s account balance: "+ this.Balance);
        }
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return Email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

}
