package com.ey.gst.dao.service;

interface I 
{
    public static final int a=10;
    public abstract void add();
    public abstract void sub();

}
interface J
{
    public static final  int b=20;
    public abstract void mul();
    public abstract void div();

}
interface K extends I,J
{
}
class Cal  implements K
{
    public void sub()
    {
        System.out.println("A + B :"+(I.a - J.b));    
    }
    public void add()
    {
        System.out.println("A + B :"+(I.a + J.b));
    }
    public void div()
    {
        System.out.println("A + B :"+(I.a / J.b));
    }
    public void mul()
    {
        System.out.println("A + B :"+(I.a * J.b));
    }
}
 
public class Demo14
{
    public static void main(String args[])
    {

        Cal c = new Cal();
        c.add();
        c.sub();
        c.mul();
        c.div();

        System.out.println("===========K interface =============");
 
        K k =c;
        k.add();
        k.sub();
        k.mul();
        k.div();
 
        System.out.println("========I interface =============");
 
        I i  =c;
        i.add();
        i.sub();
        //i.mul();
        //i.div();
 
        System.out.println("========J interface =============");
 
        J j   =c;
        //j.add();
        //j.sub();
        j.mul();
        j.div();

 
    }
}