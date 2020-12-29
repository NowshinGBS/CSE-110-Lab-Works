import java.util.Scanner;
public class classwork01b
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    System.out.println("Please enter a number");
    int num = fr.nextInt();
    int max= num;
    int mini = num;
    for(int c=2; c<=5; c++)
    {
      System.out.println("Enter a nummber");
       int num1 = fr.nextInt();
      if(num1>max)
      {
        max=num1;
      }
      else
      {
        if(num1<mini)
        {
        mini = num1;
        }
      }
    }
    System.out.println(+max);
    System.out.println(+mini);
  }
}