package com.ymsli.firstmachinetest.question2;

public class AccountController {

	public static void main(String[] args) {
		
		Date date1= new Date(02,06,1997);
		Date date2= new Date(03,05,1998);
		
		Owner akanksha = new Owner("Akanksha Tyagi",date1,"ATS486");
		Owner deepshikha = new Owner("Deepshikha ",date2,"DCY469");
		System.out.println("------------------------------------");
		
		System.out.println("Akanksha Tyagi details : "+ akanksha.toString());
		System.out.println("------------------------------------");
		
		System.out.println("Deepshikha details : "+ deepshikha.toString());
		System.out.println("------------------------------------");
		
		
		Account akanksha_account = new SavingAccount(akanksha,5000,"020306");
		Account deepshikha_account = new CurrentAccount(deepshikha,20000,"058678");
		System.out.println("------------------------------------");
		System.out.println("Before deposit the amount balance of "+akanksha_account.getOwner().getName()+" is :"+akanksha_account.getBalance());
		System.out.println("------------------------------------");
		akanksha_account.deposit(150);
		System.out.println("------------------------------------");
		System.out.println("After deposit the amount balance of "+akanksha_account.getOwner().getName()+" is :"+akanksha_account.getBalance());
		System.out.println("------------------------------------");
		
		
		System.out.println("Before withdraw the amount balance of "+deepshikha_account.getOwner().getName()+" is :"+deepshikha_account.getBalance());
		System.out.println("------------------------------------");
		deepshikha_account.deposit(150);
		System.out.println("------------------------------------");
		System.out.println("After withdraw the amount balance of "+deepshikha_account.getOwner().getName()+" is :"+deepshikha_account.getBalance());
		System.out.println("------------------------------------");
		
	}
}
