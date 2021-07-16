package com.company;

import java.util.ArrayList;
import java.util.List;

public class bankAccountDaoImpl implements bankAccountDao{

    List<bankAccount> Bank;


    public bankAccountDaoImpl() {
        bankAccount account1= new bankAccount(1, "account1");
        bankAccount account2= new bankAccount(2, "account2");
        Bank.add(account1);
        Bank.add(account2);
    }

    @Override
    public void addAccount(bankAccount bankAccount) {
        this.Bank.add(bankAccount);
    }

    @Override
    public void updateEmail(bankAccount bankAccount, String Email) {
        this.Bank.get(bankAccount.getAccountNumber()).setEmail(Email);
        System.out.println("Your email is updated");
    }

    @Override
    public void updateName(bankAccount bankAccount, String Name) {
        this.Bank.get(bankAccount.getAccountNumber()).setCustomerName(Name);
        System.out.println("Your name is updated");
    }

    @Override
    public void updatePhone(bankAccount bankAccount, int Phone) {
        this.Bank.get(bankAccount.getAccountNumber()).setPhoneNumber(Phone);
        System.out.println("Your phone number is updated");
    }

    @Override
    public void deleteAccount(bankAccount bankAccount) {
        this.Bank.remove(bankAccount.getAccountNumber());
        System.out.println("Your account is deleted");
    }

    @Override
    public void deposit(int AccountNumber, int amount) {
        this.Bank.get(AccountNumber).deposit(amount);
    }

    @Override
    public List<bankAccount> getAllAccounts() {
        return Bank;
    }

    @Override
    public bankAccount getAccount(int AccountNumber) {
        return Bank.get(AccountNumber);
    }

    @Override
    public void accountBalance(int AccountNumber) {
        System.out.println("Your account's balance: "+ Bank.get(AccountNumber).getBalance());
    }
}
