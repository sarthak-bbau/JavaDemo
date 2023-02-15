import java.io.*;
import java.util.Scanner;
public class SwappingOfTwoNumbers{
	public static void main(String[]args){
		System.out.println("program for swapping of two numbers without using third variable");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number");
		int m=sc.nextInt();
		System.out.println("enter 2nd number");
		int n=sc.nextInt();
		
		m=m-n;
		n=m+n;
		m=n-m;
		
		System.out.println("m="+m);
		System.out.println("n="+n);
	}
}