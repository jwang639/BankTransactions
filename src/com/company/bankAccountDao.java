package com.company;

import java.util.List;

public interface bankAccountDao {
    public void addAccount(bankAccount bankAccount);
    public void updateEmail(bankAccount bankAccount, String Email);
    public void updateName(bankAccount bankAccount, String Name);
    public void updatePhone(bankAccount bankAccount, int Phone);
    public void deleteAccount(bankAccount bankAccount);
    public void deposit(int AccountNumber, int amount);
    public List<bankAccount> getAllAccounts();
    public bankAccount getAccount(int AccountNumber);
    public void accountBalance(int AccountNumber);
    public void displayAll();
    public void displayOne(int AccountNumber);
}
