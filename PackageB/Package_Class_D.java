package PackageB;

import com.gg.apps.FirstApp.Package_A;
//subclass of diff pack
public class Package_Class_D extends Package_A{
void display()
{System.out.println(a);
System.out.println(c);
//b,d cant be accessed
}


}
//non subclass of diff pack
class E{ 
	void display()
	{
		Package_A a1=new Package_A();
				System.out.println(a1.a);
	}
	
	//b,c,d cant be accessed
}
//subclass of diff pack as it extends D means it extends A
class F extends  Package_Class_D{
	void display()
	{System.out.println(a);
	System.out.println(c);
	//b,d cant be accessed
}
}