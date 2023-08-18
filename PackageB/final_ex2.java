package PackageB;


class Emp
{
	int id=100;
	String n="aru";
	final int sal=900;
	final void display() {
		
	}
}


final class Clerk extends Emp
{
	//void display()//cant override
}
final class Dev extends Emp
{
	
}
public class final_ex2 {
public static void main(String[] args) {
	Clerk c=new Clerk();
	System.out.println(c.id);
	System.out.println(c.n);
	System.out.println(c.sal);
	//c.sal=800;
	
	Dev d=new Dev();
	System.out.println(d.id);
	System.out.println(d.n);
	System.out.println(d.sal);
}
}
