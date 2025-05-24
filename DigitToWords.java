package com.cdac.acts;
import java.util.Scanner;

public class DigitToWords{

	public static void public static void main(String[] args) {
		System.out.println("Enter the number between 1 to 99999 : ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();
		int i = 0;
		while(value>0){
			int temp = value%10;
			temp=temp*pow(10,i);
			i++;
			value=value/10;
			System.out.println(temp);
		}
		return;	
	}
}