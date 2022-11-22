package com.task1;

public class ClassC
{
 int meth1(int a,String s)
 {
	 System.out.println(s);
	 return a*a;
 }
 int meth2(int a)
 {
	 System.out.println("HI");
	 return a+a;
 }
 public static void main(String[] args)
 {
ClassC aobj=new ClassC();
System.out.println(aobj.meth1(5, "hello")+aobj.meth2(25)+25);
}
}
