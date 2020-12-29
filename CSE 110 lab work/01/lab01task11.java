import java.util.Scanner;
public class lab01task11
{
  public static void main (String [] args)
  {
    //int num1 = 5;
    //Scanner fr = new Scanner(System.in);
    //int num;
    int c =1;
    int sum=0;
    
    while(c<=5)
    {
      Scanner fr = new Scanner(System.in);
      System.out.println("Please enter a number");
      int num = fr.nextInt();
      sum = sum + num;
    
    c++;
    }
    int avarage = sum/5;
    {
      System.out.println(+avarage);
    }
  }
}