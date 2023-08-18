package PackageB;

class Static_Example1 {
	static int x = 50;

	static void display() {
		System.out.println("hi");
	}
}

public class Static_Example
{
	public static void main(String[] args) {
		Static_Example1 a= new Static_Example1();
		a.display();
		System.out.println(a.x);
		
		//wasting memory
		Static_Example1 a1= new Static_Example1();
		a1.display();
		System.out.println(a1.x);
		
		//can be accessed directly without creating obj after making var & method static
		Static_Example1.display();
		System.out.println(Static_Example1.x);
	}
}
