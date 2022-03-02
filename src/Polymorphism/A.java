package Polymorphism;

public class A 
{
  public void m1()
  {
	  System.out.println("forward");
  }
  public void m1(int b)
  {
	  System.out.println(b);
  }
  public static void main(String[]args)
  {
	  A s=new A();
	  s.m1(21);
  }



}
