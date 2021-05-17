
package inherit;
import java.util.*;
public class BankingSystem {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		Bank b=new Bank();//Instantiate or creation of object of bank class
int choice;
System.out.println();
System.out.println("enter customer details");
b.customerdetails();
System.out.println("****************");
System.out.println("press '1' to create bank account");
System.out.println("press '2' to deposit");
System.out.println("press '3' to withdraw");
System.out.println("press '4' to check balance");
System.out.println("press '5' to take loan");
System.out.println(" exit the system");
System.out.println("\n");
do {
	System.out.println("enter choice ");
	choice =sc.nextInt();
	System.out.println();
	switch(choice) {
	
	case 1: //deposit amount                                 
		b.deposit();
		System.out.println("*********************");
		break;
	case 2://withdraw amount
		b.withdraw();
		System.out.println("***************************");
		break;
	case 3://check current bank balance
		long temp=0L;
		System.out.println("check current balance");
		System.out.println("enter account number again for verification ");
		temp=sc.nextLong();
		if(temp==b.accntno)
			b.checkbalance();
		else 
		System.out.println("wrong account number.enter correct account number");
		break;
	case 4://option for taking loan
		String accntype;
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter your choice for account type");
		accntype=sc1.next();
		b.loan();
		System.out.println("*************************");
		break;
		default:
			System.out.println("invalid choice.enter correct details to avail the service");
	}
}
while(choice<5);
		System.out.println("THANK YOU CUSTOMER");//end of choice making
}
}


//CREATION OF BANK CLASS

class Bank{
	String name;
	String address;
	int amount;
	 protected long accntno;
double balance;
double depositbalance;
double withdrawbalance;
	Bank()//Constructor of class Bank
	{
		System.out.println("welcom customer how may I help you");
		
	}
	void customerdetails()//input the customer details
	{
		
	Scanner sc=new Scanner(System.in);
		System.out.println("the name of the customer is ");
		name=sc.next();
		System.out.println("the address of the customer ");
		address=sc.next();
		System.out.println("the current balance ");
		balance=sc.nextDouble();
		System.out.println("the account number ");
		accntno=sc.nextLong();
		
	}
	void deposit()//deposit money
	{
		System.out.println("enter the amount you want to deposit in the bank ");
		
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		depositbalance=balance+amount;
		System.out.println("the balance after amount is  deposited in the bank is "+depositbalance);
		
	}
	void withdraw()//withdraw money
	{
		System.out.println("enter the amount you want withdraw from the bank ");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		if(balance>=amount)
		{
			withdrawbalance=balance-amount;
		System.out.println(" the amount withdrawl from the bank "+withdrawbalance);
		
		
	}
		else {
			System.out.println("wrong transaction");
	
	}}
	void checkbalance() //current balance
	{
	
		System.out.println("the current balance is "+balance);
		
	}
	void loan() //loan taking options availability 
	{
		System.out.println("details for taking loan \n");
		System.out.println("for savings account the rate of interest is 6%");
		System.out.println("for current account the rate of interest is 8% \n");
		System.out.println("the nominee for saving account as per government schedul is 'father' only");
		System.out.println("the nominee for current account as per government is 'anyone'");
	}
}
	