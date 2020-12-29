import java.util.Scanner;
public class lab01task13
{
  public static void main (String [] args)
  {
    int c =1; 
    while(c<=5)
    {
      Scanner fr = new Scanner(System.in);
      System.out.println("Please enter a number");
      int num = fr.nextInt();
      
      if (num%2==0)
      {
        System.out.println("The number is even");
      }
      else
      {
        System.out.println("The number is odd");
      }
      c++;
    }
  }
}