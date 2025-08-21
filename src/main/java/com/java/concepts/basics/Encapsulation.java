package com.java.concepts.basics;

class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
        } else{
            System.out.println("Enter positive amount");
        }
    }

    public void withdraw(double amount){
        if (amount>0 && amount<balance){
            balance-=amount;
        } else{
            System.out.println("Invalid amount");
        }
    }
}
public class Encapsulation {
    public static void main(String[] args){
        BankAccount account = new BankAccount("123",1000);

        account.deposit(200);
        System.out.println(account.getBalance());

        account.withdraw(300);
        System.out.println(account.getBalance());
    }
}
