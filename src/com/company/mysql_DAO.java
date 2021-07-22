package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.List;



public class mysql_DAO implements bankAccountDao{
    final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://database-1-july21.caeak3n4rtea.us-west-1.rds.amazonaws.com:3306/BankDB";
    final String USER = "admin";
    final String PASS = "testadmin";
    final String QUERY= "SELECT AccountNumber, CustomerName, PhoneNumber FROM BankTransaction";
    Connection conn= null;

    public void createTable(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn= DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating table in given database...");
            Statement stmt= conn.createStatement();
            String sql= " CREATE TABLE BankTransaction "+
                        " ( AccountNumber INTEGER not NULL, "+
                        " CustomerName VARCHAR(255), " +
                        " PhoneNumber INTEGER not NULL, "+
                        " PRIMARY KEY (AccountNumber))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void addAccount() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn= DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Inserting record in given database...");
            Statement stmt= conn.createStatement();
            String sql= "INSERT INTO BankTransaction VALUES(1, 'Jiahao', 1234)";
            stmt.executeUpdate(sql);

            sql= "INSERT INTO BankTransaction VALUES(2, 'Wang', 5678)";
            stmt.executeUpdate(sql);

            sql= "INSERT INTO BankTransaction VALUES(3, 'Java', 91011)";
            stmt.executeUpdate(sql);

            System.out.println("Inserted record in given database...");
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }



    @Override
    public void updateEmail(bankAccount bankAccount, String Email) {

    }

    @Override
    public void updateName(bankAccount bankAccount, String Name) {

    }

    @Override
    public void updatePhone(bankAccount bankAccount, int Phone) {

    }

    @Override
    public void deleteAccount(bankAccount bankAccount) {

    }

    @Override
    public void deposit(int AccountNumber, int amount) {

    }

    @Override
    public List<bankAccount> getAllAccounts() {
        return null;
    }

    @Override
    public bankAccount getAccount(int AccountNumber) {
        return null;
    }

    @Override
    public void accountBalance(int AccountNumber) {

    }

    @Override
    public void displayAll() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt= conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            System.out.println("Displaying the record in given database...");
            while(rs.next()) {
                //Display values
                System.out.print("AccountNumber: " + rs.getInt("AccountNumber"));
                System.out.print(", Name: " + rs.getString("CustomerName"));
                System.out.println(", Phone: " + rs.getInt("PhoneNumber"));
            }
        }
        catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public void displayOne(int AccountNumber) {

    }
}
