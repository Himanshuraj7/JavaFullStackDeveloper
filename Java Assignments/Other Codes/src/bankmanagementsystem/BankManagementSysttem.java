package bankmanagementsystem;

import java.util.*;
//import org.junit.Test;
//import static org.junit.Assert.*;

abstract class Account {
    Person accHolder; 
    Integer accNum; 
    Integer balance; 
    String accountType;

    //declare a static hashmap variable with name "accounts" with key as Integer and value which can store both objects of type SavingsAccount and CurrentAccount 
    static HashMap<Integer,Account> accounts=new HashMap<Integer,Account>();
    
    public abstract void setAccountDetails(Person accHolder, Integer accNum, Integer balance);
    public abstract void setBalance(Integer balance);
    public abstract Integer getBalance(); public abstract String debit(Integer amount);
    public abstract String credit(Integer amount); 
    
    public static String createSavingsAccount(Person accHolder, Integer accNum, Integer balance){ 
        //write code to create a savings account object every 
        //time this method is called and add the account number as key and 
        //object as value to a HashMap of type <Integer,Account> 
        Account savingsAccountObject = new SavingsAccount();
        accounts.put(accNum,savingsAccountObject);
        
        //use setAccountDetails method in SavingsAccount class to set the values
        //if the balance while creating an account is >=1000 then return 
        //"Savings Account SuccessFully Created!" or return "Validation Failed!" 
        
        //if validation fails then set all the fields and SavingsAccount object to null 
        savingsAccountObject.setAccountDetails(accHolder,accNum,balance);
        if(balance>=1000){
            return "Savings Account SuccessFully Created!";
        }
        else
        {
            
            accNum=null;
            accHolder=null;
            balance=null;
            savingsAccountObject=null;
            return "Validation Failed!";
        }
        
    } 
        
    public static String createCurrentAccount(Person accHolder, Integer accNum, Integer balance){ 
        //write code to create a current account object every time this method is
        //called and add the account number as key and object as value to the 
        //Accounts.account variable 
        Account currentAccountObject=new CurrentAccount();
        //use setAccountDetails method in CurrentAccount class to set the values 
        //if the balance while creating an account is >=10000 then return "Current Account SuccessFully Created!" or return "Validation Failed!"
        //if validation fails then set all the fields and SavingsAccount object to null 
        if(balance>=10000)
        {
            return "Current Account SuccessFully Created!";
        }
        else
        {
            accNum=null;
            accHolder=null;
            balance=null;
            currentAccountObject=null;
            return "Validation Failed!";
        }
    } 
} 

class SavingsAccount extends Account { 
    public void setAccountDetails(Person accHolder, Integer accNum, Integer balance){
        //write code here to set the accHolder(account holder),accNum(account number),
        //balance and accountType fields
        this.accHolder=accHolder;
        this.balance=balance;
        this.accNum=accNum;
    } 
    
    public String toString()
    {
        return("Name : "+accounts.get(accNum).accHolder.name+" Age : "+accounts.get(accNum).accHolder.age+" City : "+accounts.get(accNum).accHolder.city+" Account Number : "+accNum+" Balance : "+accounts.get(accNum).balance+" Account Type : Savings");
    }
    //write a toString() method to to generate account details when the hashmap's "accounts.get(accNum)" method is used to print all the user details in the below format 
    //"Name : Arjun Age : 21 City : Bangalore Account Number : 12345
    //Balance : 1000 Account Type : Savings" (without quotes) 
    //write setter and getter methods to set and get balance with return type Integer 
    
    public void setBalance(Integer balance)
    {
        this.balance=balance;
    }
    
    public Integer getBalance()
    {
        return balance;
    }
    
    public String debit(Integer amount){ 
        //write code here to handle debiting(withdrawal) from an account 
        //if the withdrawal amount makes the balance lesser than zero then 
        //return "Cannot deduct more than available balance!" 
        //if the withdrawal amount makes the balance lesser than minimum 
        //balance(1000) and greater than zero then return ex: "500 Rs. has 
        //been successfully debited and the balance is 500 Rs. and minimum 
        //balance is not present in account: 1234"
        //else return ex: "2000 Rs. has been successfully debited and
        //the balance is 1500 Rs. in account: 1234"
        
        if(accounts.get(accNum).balance-amount<0)
        {
            return "Cannot deduct more than available balance!" ;
        }
        else if((accounts.get(accNum).balance-amount)>=0 && (accounts.get(accNum).balance-amount)<1000)
        {
            accounts.get(accNum).balance=(accounts.get(accNum).balance-amount);
            return amount+"  Rs. has been successfully debited and the balance is "+(accounts.get(accNum).balance)+" and the minimum balance is not present in account: "+accNum;
            
        }
        else
        {
             accounts.get(accNum).balance=(accounts.get(accNum).balance-amount);
            return ""+amount+" Rs. has been successfully debited and the balance is "+(accounts.get(accNum).balance)+" Rs. in account: "+accNum;
        }
    } 
    
    public String credit(Integer amount)
    { 
        //write code here to handle crediting(deposit) to an account
        //update the balance in the hashmap variable Account.accounts 
        //return ex: "1000 Rs. has been successfully credited and the balance is 2000 Rs. in account: 1234"
        accounts.get(accNum).balance=(accounts.get(accNum).balance+amount);
        return ""+amount+" Rs. has been successfully credited and the balance is "+(accounts.get(accNum).balance)+" Rs. in account: "+accNum;
    } 
} 

class CurrentAccount extends Account{ 
    public void setAccountDetails(Person accHolder, Integer accNum, Integer balance){ 
        //write code here to set the accHolder(account holder),accNum(account number),balance and accountType fields 
        this.accHolder=accHolder;
        this.balance=balance;
        this.accNum=accNum;
        
    } 
     public String toString()
    {
        return("Name : "+accounts.get(accNum).accHolder.name+" Age : "+accounts.get(accNum).accHolder.age+" City : "+accounts.get(accNum).accHolder.city+" Account Number : "+accNum+" Balance : "+accounts.get(accNum).balance+" Account Type : Current");
    }
        
    //write a toString() method to to generate account details when the hashmap's "accounts.get(accNum)" method is used to print all the user details in the below format 
    //"Name : Arjun Age : 21 City : Bangalore Account Number : 12345 Balance : 1000 Account Type : Current" (without quotes) 
    //write setter and getter methods to set and get balance with return type Integer 
    
     public void setBalance(Integer balance)
    {
        this.balance=balance;
    }
    
    public Integer getBalance()
    {
        return balance;
    }
    
    public String debit(Integer amount){ //write code here to handle debiting(withdrawal) from an account 
        //update the balance in the hashmap variable Account.accounts
        //if the withdrawal amount makes the balance lesser than minimum balance(10000) then return ex: "500 Rs. has been successfully debited and the balance is 9500 Rs. and amount is overdrawn in account: 1234" 
        //else return ex: "2000 Rs. has been successfully debited and the balance is 13000 Rs. in account: 1234"
        if(accounts.get(accNum).balance-amount<0)
        {
            return "Cannot deduct more than available balance!" ;
        }
        else if((accounts.get(accNum).balance-amount)>=0 && (accounts.get(accNum).balance-amount)<10000)
        {
            accounts.get(accNum).balance=(accounts.get(accNum).balance-amount);
            return amount+"  Rs. has been successfully debited and the balance is "+(accounts.get(accNum).balance)+" and the minimum balance is not present in account: "+accNum;
            
        }
        else
        {
             accounts.get(accNum).balance=(accounts.get(accNum).balance-amount);
            return ""+amount+" Rs. has been successfully debited and the balance is "+(accounts.get(accNum).balance)+" Rs. in account: "+accNum;
        }
    } 
    
    public String credit(Integer amount){
        //write code here to handle crediting(deposit) to an account 
        //update the balance in the hashmap variable Account.accounts 
        //then return ex: "1000 Rs. has been successfully credited and the balance is 11000 Rs. in account: 1234"
         accounts.get(accNum).balance=(accounts.get(accNum).balance+amount);
        return ""+amount+" Rs. has been successfully credited and the balance is "+(accounts.get(accNum).balance)+" Rs. in account: "+accNum;
    } 
                
} 
            
class Person{ 
    String name;
    String city;
    int age;
    public Person(String name,String city,int age)
    {
        this.name=name;
        this.city=city;
        this.age=age;
    }
    //declare three variables for name,city and age of a person and also a parameterized constructor 
 } 



public class BankManagementSysttem {

}
