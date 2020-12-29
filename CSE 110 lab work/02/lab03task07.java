import java.util.Scanner;
public class lab03task07
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int num = fr.nextInt();
    
    if(num>=50)
    {
      System.out.println("Pass");
    }
    else
    {
      System.out.println("You shall not pass");
    }
  }
}