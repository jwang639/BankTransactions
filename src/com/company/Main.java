package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bankAccountDao BOA= new bankAccountDaoImpl();
        BOA.getAccount(0).setCustomerName("Jiahao");
        BOA.getAccount(0).setPhoneNumber(123);
        BOA.getAccount(0).deposit(500);
        BOA.getAccount(1).setCustomerName("Wang");
        for(bankAccount bankAccount: BOA.getAllAccounts()){
            System.out.println("Account Number: "+ bankAccount.getAccountNumber()+ " Account Name: "+
                    bankAccount.getCustomerName());
        }
        BOA.getAccount(0).getBalance();
        BOA.getAccount(0).deposit(1);
    }
}
