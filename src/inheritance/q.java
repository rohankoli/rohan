package inheritance;

public class q extends p 
{
    public q()
    {
    	
    System.out.println("B-----const");
    }
  
  public void m1()
{
    super.m1();
    System.out.println("m3-----B");
}
    public void m2() 
 {
    	
  System.out.println("m2-----B");	 
 }






}