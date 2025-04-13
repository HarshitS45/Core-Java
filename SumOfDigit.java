package com.cdac.acts;
import java.util.Scanner;
public class SumOfDigit{
	public static int sumUsingLoop(int num){
		int sum=0;
		while(num>0){
			sum+=num%10;
			num=num/10;
		}
		return sum;
	}
	
	public static int sumUsingRecursion(int num,int sum){
		if(num==0)
			return sum;
		sum+=num%10;
		return sumUsingRecursion(num/10,sum);
	}
	
	public static void menu(){
		boolean done=true;
		while(done){
			System.out.println("Enter the four digit number:");
			int number = input.nextInt();
			System.out.println("Select the option :\n1.Using Loop \n2.Using Recursion\n3.Exit");
			System.out.print("Enter the choice:");
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			int res =0;
			switch(choice){
				case 1:{
					res=sumUsingLoop(number);
					System.out.println("Result = "+res);
					break;
				}
				case 2:{
					res=sumUsingRecursion(number,0);
					System.out.println("Result = "+res);
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
	
	public static void main(String args[]){
		menu();
		return;
	}
}