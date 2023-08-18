package PackageB;
//final class car
class Car
{
	final int speed=200;
	int model=2020;
	final void gear()
	{System.out.println("5 gears");
	}
}

class Bmw extends Car
{
	//cant inherit final class or method or vars or reassign values
	// void gear()
//	{System.out.println("8 gears");final method cant be overridden
//	
//	}
}
public class Final_Keyword {
public static void main(String[] args) {
	Car c=new Car();
	System.out.println("speed"+c.speed);
	Bmw b=new Bmw();
	b.gear();
	System.out.println(b.model);
	//cant inherit final class
	
}
}
