package com.cdac.acts;
import java.util.Scanner;

public class Calculator{
	public static int add(int val1 ,int val2){
		return val1+val2;
	}
	
	public static int sub(int val1 ,int val2){
		return val1-val2;
	}
	
	public static int mul(int val1 ,int val2){
		return val1*val2;
	}
	
	public static int div(int val1 ,int val2){
		return val1/val2;
	}
	
	public static void menu(int value1,int value2){
		Scanner input = new Scanner(System.in);
		boolean done=true;
		while(done){
			System.out.println("Select the opertion :\n1.Addition \n2.Substraction\n3.Multiplication\n4.Division\n5.Exit");
			System.out.println("Enter the choice:");
			int choice = input.nextInt();
			int res =0;
			switch(choice){
				case 1:{
					res=Calculator.add(value1,value2);
					System.out.println("Result= "+res);
					break;
				}
				case 2:{
					res=Calculator.sub(value1,value2);
					System.out.println("Result= "+res);
					break;
				}
				case 3:{
					res=Calculator.mul(value1,value2);
					System.out.println("Result= "+res);
					break;
				}
				case 4:{
					res=Calculator.div(value1,value2);
					System.out.println("Result= "+res);
					break;
				}
				case 5:{
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
		input.close();
		return ;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st value :");
		int val1 = input.nextInt();
		System.out.println("Enter the 2nd value :");
		int val2 = input.nextInt();
		menu(val1,val2);
		return;
	}
		
}