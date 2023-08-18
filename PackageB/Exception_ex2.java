package PackageB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;
//just compile will be done.prog will not run if not using try catch...
public class Exception_ex2 {
public static void main(String[] args) throws FileNotFoundException {
	m1();
}
static void m1()throws FileNotFoundException{
	m2();
	System.out.println("ji m1");
}
static void m2()throws FileNotFoundException{
	m3();
	System.out.println("ji m2");
}
static void m3()throws FileNotFoundException{
//	try{
//		File f=new File("aaamxm.text");
//	
//	FileReader fr=new FileReader(f);}
//	catch(FileNotFoundException a)
//	{System.out.println("not found");
//}
	
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a/b;
		System.out.println(res);
		
	}
	catch(ArithmeticException e)
	{System.out.println("div by 0");
	}
	catch(InputMismatchException e)
	{System.out.println("enter only num");
	}
	catch(Exception e)
	{System.out.println(e);
	}
	
}}

