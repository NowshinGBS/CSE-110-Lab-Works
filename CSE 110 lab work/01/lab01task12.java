import java.util.Scanner;
public class lab01task12
{
  public static void main (String [] args)
  {
    int c =1;
    int sum=0;
    
    while(c<=10)
    {
      Scanner fr = new Scanner(System.in);
      System.out.println("Please enter a number");
      int num = fr.nextInt();
    if (num%2==0)
    {
      sum = sum + num;
    }
    else
    {
    }
    c++;
    }
    System.out.println("So, the sum is " + sum);
  }
}