package com.programs;
import java.util.Random;
import java.util.Scanner;

class User_Details{
	String name;
	int age;
	long mob;
	int acc_no;
	long balance;
	Scanner sc = new Scanner(System.in);
	void get_details() {  
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Age: ");  
        age = sc.nextInt(); 
        System.out.print("Enter Mobile Number: ");  
        mob = sc.nextLong(); 
        System.out.print("Enter Balance: ");  
        balance = sc.nextLong();  
        Random rand = new Random();
        acc_no = rand.nextInt(25); 
	}
	
	public void show_details() {
		System.out.println("Account Number : " + acc_no + "\nName : " + name + "\nAge : " + age + ",\nPhone number is : " + mob + "\nBalance : " + balance);
		System.out.println();
	}
	
    public boolean search(int ac_num) {  
        if (ac_num == acc_no) {  
            show_details();  
            return (true);  
        }  
        return (false);  
    }

    public void deposit() {  
        int amt;  
        System.out.println("Enter the amount to deposit : ");  
        amt = sc.nextInt();  
        balance = balance + amt;  
    }  
    
    public void withdrawal() {  
        int amt;  
        System.out.println("Enter the amount to withdraw : ");  
        amt = sc.nextInt();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal : " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    
    public void balance() {
    	System.out.println(balance);
    }
}  

class Loan_eligible{
	int amt;
	void loan_eli(int amt) {
		if(amt >= 50000) {
			System.out.println("Yes! Your are eligible...");
		}
		else {
			System.out.println("Sorry...Not Eligible!");
		}
	}
}

class Apply_loan extends Loan_eligible{
	public float amnt, loan_amt;
	void loan_eli(int amnt) {
		if(amnt>100000) {
			loan_amt = 500000.00f;
		}
		else if(amnt>=50000 && amnt<=100000) {
			loan_amt = 300000.00f;
		}
		else {
			loan_amt = 100000.00f;
		}
		System.out.println("Eligible for Loan Amount of $" + loan_amt);
	}
}

class Emi extends Apply_loan{
	void ci(){
		float p , r ,  t,  si; 
		System.out.println("Loan Amount = $" + loan_amt);
        p = loan_amt;  r = 12; t = 2;  
        si  = (p*r*t) / 100;   
        System.out.println("Simple Interest is : $" + si);
	}
}

public class bank_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Number of customers ");  
        int n = sc.nextInt();  
        User_Details C[] = new User_Details[n];  
        for (int i = 0; i < C.length; i++) {  
            C[i] = new User_Details();  
            C[i].get_details();  
        }  
		int choice;
		do {
			System.out.println("\nEnter Your Choice...");
			System.out.println("1.User Details:\n2.Account Balance:\n3.Withdrawel:\n4.Loan Eligibility Check:\n5.Apply for Personal Loan:\n6.Display EMI Sheet:\n7.Deposit Amount:\n8.Exit");;
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				for(int i = 0 ; i < C.length ; i++) {
				C[i].show_details();
				}
				break;
			case 2:
				System.out.println("Enter Account Number : ");
				int acc = sc.nextInt();
				for(int i = 0 ; i < n ; i++) {
					if(C[i].search(acc)) {
						C[i].balance();
					}
				}
				break;
			case 3:
				System.out.print("Enter Account No : ");  
                int ac_no = sc.nextInt();  
                boolean found = false;  
                for (int i = 0; i < C.length; i++) {  
                    found = C[i].search(ac_no);  
                    if (found) {  
                        C[i].withdrawal();  
                        break;  
                    }  
                }  
                if (!found) {  
                    System.out.println("Search failed! Account doesn't exist..!!");  
                }  
				break;
			case 4:
				Loan_eligible l = new Loan_eligible();
				System.out.println("Enter your Salary : ");
				int sal = sc.nextInt();
				l.loan_eli(sal);
				break;
			case 5:
				Apply_loan a = new Apply_loan();
				System.out.println("Enter your Salary : ");
				int sal1 = sc.nextInt();
				a.loan_eli(sal1);
				break;
			case 6:
				Emi e = new Emi();
				e.ci();
				break;
			case 7:
				 System.out.print("Enter Account no. : ");  
                 int acc_no = sc.nextInt();  
                 found = false;  
                 for (int i = 0; i < C.length; i++) {  
                     found = C[i].search(acc_no);  
                     if (found) {  
                         C[i].deposit();  
                         break;  
                     }  
                 }  
                 if (!found) {  
                     System.out.println("Search failed! Account doesn't exist..!!");  
                 }  
                 break;  
				
			}
		}while(choice<=7);

	}

}
