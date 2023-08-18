package com.gg.apps.FirstApp;

public class Package_A {
public int a=100;
private int b=200;
protected int c=200;
int d=400;//default

}
class B extends Package_A
{
	void display()
	{System.out.println(a);
	//b cant be accessed
	System.out.println(c);
	System.out.println(d);
	}
}
class C
{void display()
	{Package_A a1=new Package_A();
	System.out.println(a1.a);
	//b cant be accessed
	System.out.println(a1.c);
	System.out.println(a1.d);
	}
}