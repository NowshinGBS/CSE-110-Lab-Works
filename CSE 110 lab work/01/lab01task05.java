import java.util.Scanner;
public class lab01task05
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    System.out.println("1st number :");
    int num1 = fr.nextInt();
    System.out.println("2nd number :");
    int num2 = fr.nextInt();
    
    if(num1 > num2)
    {
      System.out.println("first is greater");
    }
    else
    {
      System.out.println("second is greater");
    }
  }
}