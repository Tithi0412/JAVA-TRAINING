package PackageB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExample {
public static void main(String[] args) {
	exceptionExample.m1();
	
}
static void m1()
{exceptionExample.m2();
System.out.println("program not terminated m1 class");
}
static void m2()
{exceptionExample.m3();
System.out.println("m2 class");

}
static void m3()
{
	try{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter A val");
	int a=sc.nextInt();
	System.out.println("enter B val");
	int b=sc.nextInt();
	
	int res=a+b;
		System.out.println(res);
	}
	catch(InputMismatchException im){
		System.out.println("plz enter num only");
	}
}}

