import java.util.Scanner;
public class lab01task08
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    System.out.println("Please enter a number");
    int num = fr.nextInt();
    
    if(num%2==0)
    {
      System.out.println("The number is even");
    }
    else
    {
      System.out.println("The number is odd");
    }
  }
}