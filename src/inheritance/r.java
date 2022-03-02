package inheritance;

public class r extends q 
{
 public r()
 {
	 System.out.println("like");
	 System.out.println("c----constructor");
 }
  public void m4()
  {
	  System.out.println("m4-----c");
  }

  public static void main (String[]args)
  {
	  q s=new r();
	  s.m1();
  }

}
