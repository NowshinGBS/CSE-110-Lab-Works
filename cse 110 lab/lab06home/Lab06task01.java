import java.util.Scanner;
public class Lab06task01
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Please enter a number");
    int num;
    num=sc.nextInt();
    int c;
    c=1;
    while(c<=num)
    {
      System.out.print(c);
      c++;
    }
  }
}