package com.atm;

import java.util.Scanner;

public class Account {
    private int  accountNumber;
    private String name;
    private double balance;
    private String password;
   Scanner sc=new Scanner(System.in);
    public Account() {
    	
    }
    public Account(int accountNumber,String name,double balance,String password){
    	this.accountNumber=accountNumber;
    	this.name=name;
    	this.balance=balance;
    	this.password=password;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public void setPassword(String password) {
    	this.password=password;
    }
    public int getAccountNumber() {
    	return this.accountNumber;
    }
    public String getName() {
    	return this.name;
    }
    public double getBalance() {
    	return this.balance;
    }
    
    public void deposit() {
    	System.out.println("Enter Password: ");
    	String passwd=sc.nextLine();
    	if(this.password.equalsIgnoreCase(passwd)) {
    		System.out.println("Enter Amount: ");
    		double amount=sc.nextDouble();
    		if(amount<=0) {
        		System.out.println("Enter Valid Amount to Deposit");
        	}
        	else {
        		balance+=amount;
        		System.out.println("Deposited to Account Number: "+getAccountNumber());
        		System.out.println("Amount Deposited Successfully");
        		System.out.println("Your Current Balance: "+getBalance());
        	}
    	}
    	else {
    		System.out.println("Incorrect Password");
    	}
    }
    
    public void withdraw() {
    	
    	System.out.println("Enter Password: ");
    	String passwd=sc.nextLine();
  
    	if(this.password.equalsIgnoreCase(passwd)) {
    		System.out.println("Enter Amount: ");
    		
    		double amount=sc.nextDouble();
    		sc.nextLine();
    		if(amount<=0) {
        		System.out.println("Enter Valid Amount to Withdraw");
        	}
        	else if(amount>balance) {
        		System.out.println("Insufficient Balance");
        	}else {
        		balance-=amount;
        		System.out.println("Amount Withdraw Successfully");
        		System.out.println("Your Current Balance: "+getBalance());
        	}
    	}
    	else {
    		System.out.println("Incorrect Password!");
    	}
    	
    }
   
    public void displayAccountInfo() {
    	System.out.println("\nAccount Number: "+getAccountNumber()+"\nName: "+getName()+"\nBalance: "+balance);
    }
}
