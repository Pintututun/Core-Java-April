package com.test;

import java.util.Scanner;

class Atm {
	String pin = "1234";
	float balance ;
	Scanner st = new Scanner(System.in);
	public void pinCheck() {
		System.out.println("Enter your pin");
		String upin = st.nextLine();
		if(pin.equals(upin)) {
			menu();
		}
		else System.out.println("Invalid pin");
		
	}
	public void menu() {
		System.out.println("Enter 1 for Balance Check");
		System.out.println("Enter 2 for Deposite ");
		System.out.println("Enter 1 for WithDraw ");
		System.out.println("Enter 1 for BaExit");
	}
	public void balanceCheck() {
		
	}
	public void deposite() {
		
	}
	public void withdraw() {
		
	}
	
	
}

public class TestDemo {

	public static void main(String[] args) {
		new Atm().pinCheck();
		

	}

}
