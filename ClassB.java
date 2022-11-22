package com.task1;

public class ClassB 
{
public void meth1(int a,int b)
{
	System.out.println("meth1() called");
	System.out.println("a value:"+a);
	System.out.println("b value:"+b);
	System.out.println(a+b);
	ClassB bobj=new ClassB();
	bobj.meth2(1,2,3);
}
int meth2(int a,int b,int c)
{
	System.out.println("meth2() called");
	return 1000-(a+b+c);
}
public static void main(String[] args)
{
System.out.println("JAVA IS AWESOME");
ClassB bobj=new ClassB();
bobj.meth1(49, 50);
System.out.println("_________APU____________");
System.out.println("APU");
}

} 