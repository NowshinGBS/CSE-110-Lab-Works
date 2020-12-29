import java.util.Scanner;
public class Lab06Task02
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=1;
    while(count<=num)
    {
      System.out.print("*");
      count++;
    }
  }
}