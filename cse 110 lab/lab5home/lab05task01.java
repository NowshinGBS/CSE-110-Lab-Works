import java.util.Scanner;
public class lab05task01 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num;
    int c=0;
    while(c<5)
    {
      System.out.println("Please enter a number");
      num=sc.nextInt();
      
      if (num%2==0)
      {
        System.out.println("Even number");
      }
      else
      {
        System.out.println("Odd number");
      }
      c++;
    }
  }
}