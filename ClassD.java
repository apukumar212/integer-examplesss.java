package com.task1;

public class ClassD
{
 void meth1()
 {
	 System.out.println(10);
	 System.out.println(64);
	 System.out.println("END");
 }
 int meth2(int a,int b,int c)
 {
	 System.out.println(a);
	 ClassD bobj=new ClassD();
	 String s=bobj.meth5(100,"JAVA IS AWESOME");
	 System.out.println(s);
	 return a-b;
 }
 String meth3(String s,int b,int d)
 {
	 System.out.println(b+d);
	 return s;
 }
 int meth4(int c,int k)
 {
 ClassD bobj=new ClassD();
 int result=bobj.meth2(50, 50, 50);
 System.out.println(result);
 return k+10;
 }
 String meth5(int a,String L)
 {
	 System.out.println(a+a);
	  ClassD bobj=new ClassD();
	  String s=bobj.meth3("Hi", 15, 10);
	  System.out.println(s);
	  return L;
 }
 public static void main(String[] args) 
 {
ClassD bobj=new ClassD();
System.out.println("START");
int result=bobj.meth4(20, 10);
System.out.println(result);
bobj.meth1();
}
}