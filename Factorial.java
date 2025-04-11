package com.cdac.acts;
import java.util.Scanner;

public class Factorial{
	public static int calFactorial(int num){
		if (num==0 || num==1)
			return 1;
		return num*calFactorial(num-1);
	}
	
	public void printFactorial(int num){
		for(int i=1;i<=num;i++){
			System.out.print(calFactorial(i)+" ");
		}
		return;
	}
	
	public static void main(String args[]){
		System.out.print("Enter the number : ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		Factorial f = new Factorial();
		f.printFactorial(num);
		return;
	}
}