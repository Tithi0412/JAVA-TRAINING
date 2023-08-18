package PackageB;

import java.util.Scanner;



interface MyEmployee{

 

    public abstract void pf();
}
abstract class Emp
{
    Scanner sc= new Scanner(System.in);
    int id,age;
    String name;
    double salary,pf;
    String desig;
    Emp()
    {
        System.out.println("Enter ID :");
         id=sc.nextInt();
        System.out.println("Enter name :");
         name= sc.next();
        System.out.println("Enter Age :");
        age=sc.nextInt();
    }
    void display()
    {
        System.out.println("=================");
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary :"+salary);
        System.out.println("Desig :"+desig);
        System.out.println("PF :"+pf);
    }

 

    abstract void bonus();
    abstract void hike();


}                                                    
class Clerk  extends Emp implements MyEmployee
{
    public void pf(){
        pf = salary*0.12;
    }
    Clerk()
    {    
         salary=20000;
        desig="Clerk";
    }    
    void raiseSalary()
    {
        salary=salary+10000;
    }

 

    void bonus(){
        System.out.println("yes you got a bonus of 5000");    
        salary=salary+5000;    
    }
    void hike(){
        System.out.println("yes you got a hike");    
        salary=salary+(salary*0.05);
    }
}
class Dev extends Emp implements MyEmployee
{
    public void pf(){
        pf = salary*0.12;
    }

 

    Dev()
    {
        salary=30000;
        desig="Developer";        
    }
    void raiseSalary()
    {
        salary=salary+20000;
    }

 

    void bonus(){
        System.out.println("yes you got a bonus of 15000");    
        salary=salary+15000;    
    }
    void hike(){
        System.out.println("yes you got a hike");    
        salary=salary+(salary*0.15);
    }
}
class Manager extends Emp implements MyEmployee
{
    public void pf(){
        pf = salary*0.12;
    }

    Manager()
    {
        salary=80000;
        desig="Manager";    
    }
    void raiseSalary()
    {
        salary=salary+50000;
    }

 

    void bonus(){
        System.out.println("yes you got a bonus of 25000");    
        salary=salary+10000;    
    }
    void hike(){
        System.out.println("yes you got a hike");    
        salary=salary+(salary*0.25);
    }
}
class Tester extends Emp implements MyEmployee
{
    public void pf(){
        pf = salary*0.12;
    }
    Tester(){
        salary=40000;
        desig="Tester";
    }
    void raiseSalary()
    {
        salary=salary+30000;
    }
    void bonus(){
        System.out.println("yes you got a bonus of 10000");    
        salary=salary+10000;    
    }
    void hike(){
        System.out.println("yes you got a hike");    
        salary=salary+(salary*0.1);
    }
}
public class Project {

 

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int ch = 0;
        int ch2=0;
        Clerk c = null;
        Tester t = null;
        Manager m = null;
        Dev d = null;

       do {
           System.out.println("1 - Create");
           System.out.println("2 - Display");
           System.out.println("3 - Update ");
       System.out.println("4 - Bonus");
       System.out.println("5 - Hike");
       System.out.println("6 - PF");
           System.out.println("7 - Exit");
           ch = scn.nextInt();

           if(ch==1)
           {

                   do {

                       System.out.println("1 - Clerk");
                    System.out.println("2 - Dev");
                    System.out.println("3 - Tester");
                    System.out.println("4 - Manager");
                    System.out.println("5 - Exit");
                    ch2 = scn.nextInt();


                   if(ch2==1) {
                       c=new Clerk();
                   }
                   else if(ch2==2) {
                       d= new Dev();
                   }
                   else if(ch2==3) {
                       t= new Tester();
                   }
                   else if(ch2==4) {
                       m=new Manager();
                   }


                   }while(ch2<5);
           }
           else if(ch==2) {
               do {
                      System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();


                  if(ch2==1) {
                      c.display();
                  }
                  else if(ch2==2) {
                      d.display();
                  }
                  else if(ch2==3) {
                      t.display();
                  }
                  else if(ch2==4) {
                      m.display();
                  }       
                  }while(ch2<5);

 

           }
           else if(ch==3) {
               do {
                      System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();


                  if(ch2==1) {
                      c.raiseSalary();
                      System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==2) {
                      d.raiseSalary();
                   System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==3) {
                      t.raiseSalary();
                   System.out.println("Succsfully Salary Updated .....!");
                  }
                  else if(ch2==4) {
                      m.raiseSalary();
                   System.out.println("Succsfully Salary Updated .....!");
                  }       
                  }while(ch2<5);

 

           }
       else if(ch==4) {
               do {
                      System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();


                  if(ch2==1) {
                      c.bonus();
                      System.out.println("Salary Updated");
                  }
                  else if(ch2==2) {
                      d.bonus();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==3) {
                      t.bonus();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==4) {
                      m.bonus();
                   System.out.println("Salary Updated");
                  }       
                  }while(ch2<5);

 

           }
       else if(ch==5) {
               do {
                      System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();


                  if(ch2==1) {
                      c.hike();
                      System.out.println("Salary Updated");
                  }
                  else if(ch2==2) {
                      d.hike();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==3) {
                      t.hike();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==4) {
                      m.hike();
                   System.out.println("Salary Updated");
                  }       
                  }while(ch2<5);

 

           }

 

       else if(ch==6) {
               do {
                      System.out.println("1 - Clerk");
                   System.out.println("2 - Dev");
                   System.out.println("3 - Tester");
                   System.out.println("4 - Manager");
                   System.out.println("5 - Exit");
                   ch2 = scn.nextInt();


                  if(ch2==1) {
                      c.pf();
                      System.out.println("Salary Updated");
                  }
                  else if(ch2==2) {
                      d.pf();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==3) {
                      t.pf();
                   System.out.println("Salary Updated");
                  }
                  else if(ch2==4) {
                      m.pf();
                   System.out.println("Salary Updated");
                  }       
                  }while(ch2<5);

 

           }
           else if(ch==7) {
               System.out.println(0);
               System.out.println("Thank you.....!");
           }
       }while(ch<7);
    }
}