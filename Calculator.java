package Ece1;
import java.util.Scanner;
public class Calculator {
	public static void add(int a,int b) {
		int add = a+b;
		System.out.println("add = "+add);
		
	}
	public static void sub(int a,int b) {
		int sub = a-b;
		System.out.println("sub = "+sub);
		
	}
	public static void mul(int a,int b) {
		int mul = a*b;
		System.out.println("mul = "+mul);
		
	}
	public static void div(int a,int b) {
		int div = a/b;
		System.out.println("add = "+div);
		
	}
	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);          // Using While Conditions...
		int flag = 1;
		while(flag==1) {
		System.out.println("Enter 2 Num for Operations ");
		System.out.println("Enter 1st Number : ");
		int a = s.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = s.nextInt();
		System.out.println("Enter ur Op : +,-,*,/ ");
		char op =s.next().charAt(0);
		switch(op) {
		case '+':{
			add(a,b);
			break;
		}
		case '-':{
			sub(a,b);
			break;
		}
		case '*':{
			mul(a,b);
			break;
		}
		case '/':{
			div(a,b);
			break;
		}
		default :{
			System.out.println("Invalid Operation Input ");
			break;
			}
		}
		System.out.println("Enter value to perform \n 1.Operation\n 2.End Operation\n ");
		System.out.println("Enter your Choice : ");
		flag = s.nextInt();
		}
		System.out.println("Thank you");
	}
}
