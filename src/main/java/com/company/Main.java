package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        bankAccountDao BOA= new bankAccountDaoImpl();
//        BOA.getAccount(0).setCustomerName("Jiahao");
//        BOA.getAccount(0).setPhoneNumber(123);
//        BOA.getAccount(0).deposit(500);
//        BOA.getAccount(1).setCustomerName("Wang");
//        for(bankAccount bankAccount: BOA.getAllAccounts()){
//            System.out.println("Account Number: "+ bankAccount.getAccountNumber()+ " Account Name: "+
//                    bankAccount.getCustomerName());
//        }
//        BOA.getAccount(0).getBalance();
//        BOA.getAccount(0).deposit(1);
//        BOA.updateEmail(BOA.getAccount(0), "1234#gmail.com");
//        BOA.displayAll();
//        BOA.displayOne(0);

         mysql_DAO mysql_dao= new mysql_DAO();
         bankAccount Jiahao= new bankAccount(1, "Jiahao");
         //mysql_dao.createTable();
         //mysql_dao.addAccount();

         mysql_dao.displayAll();
         //mysql_dao.ConnectToDataBase();
    }
}
