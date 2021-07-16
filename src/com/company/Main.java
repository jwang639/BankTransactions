package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bankAccountDao BOA= new bankAccountDaoImpl();
        for(bankAccount bankAccount: BOA.getAllAccounts()){
            System.out.println("Account Number: "+ bankAccount.getAccountNumber()+ " Account Name: "+
                    bankAccount.getCustomerName());
        }
    }
}
