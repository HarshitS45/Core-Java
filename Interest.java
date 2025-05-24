package com.cdac.acts;
import java.util.Scanner;
import java.lang.Math;

public class Interest{
	public static double calculateSI(double principalAmount ,double rate,double time){
		return principalAmount*rate*time/100;
	}
	
	public static double calculateCI(double principalAmount ,double rate,double time){
		return principalAmount*Math.pow(1+(rate/100),time);
	}
	
	public static void menu(){
		boolean done=true;
		while(done){
			System.out.println("Select the option :\n1.Simple Interest \n2.Compound Interest\n3.Exit");
			System.out.println("Enter the choice:");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			System.out.print("Enter the principal amount :");
			double principalAmount = input.nextInt();
			System.out.print("Enter the rate :");
			double rate = input.nextInt();
			System.out.print("Enter the time period :");
			double time = input.nextInt();
			double res =0;
			switch(choice){
				case 1:{
					res=calculateSI(principalAmount,rate,time);
					System.out.println("Simple Interest = "+res);
					break;
				}
				case 2:{
					res=calculateCI(principalAmount,rate,time);
					System.out.println("Compound Interest = "+res);
					break;
				}
				case 3:{
					System.out.println("Exit Successfully");
					done=false;
					break;
				}
				default:{
					System.out.println("Invalid Input");
					break;
				}
			}
		}
		return ;
	}
	
	public static void main(String[] args){
		menu();
		return;
	}
		
}