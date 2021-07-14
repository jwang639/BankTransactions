package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*************************");
        System.out.println("1, Show Account Balance");
        System.out.println("2, Deposit Money");
        System.out.println("3, Withdraw Money");
        System.out.println("*************************");
        System.out.println("Please enter the number above or '0' to exit the program...");
        bankAccount Jiahao= new bankAccount("Jiahao");
        Scanner scanner= new Scanner(System.in);
        while(true) {
            if (scanner.hasNextLine()) {
                int i = scanner.nextInt();
                if (i == 1) {
                    Jiahao.customerInfo();
                } else if (i == 2) {
                    System.out.println("Please enter the amount...");
                    int deposit = scanner.nextInt();
                    Jiahao.deposit(deposit);

                } else if (i == 3) {
                    System.out.println("Please enter the amount...");
                    int withdraw = scanner.nextInt();
                    Jiahao.withdraw(withdraw);

                } else if (i == 0) {
                    break;
                }
                else{
                    System.out.println("Error, please enter the number from the menu");
                }
            }
            //scanner.hasNextLine();
        }
    }
}
