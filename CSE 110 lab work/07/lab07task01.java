import java.util.Scanner;
public class lab07task01
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int a[] = new int [10];
    int sum=0;
    int c;
    for(c=0; c<=a.length-1; c++)
    {
      System.out.println("PLease enter a number");
      a[c] = fr.nextInt();
      sum = sum + a[c];
    }
    System.out.print(sum+" ,");
    for(int d=a.length-1; d>=0; d--)
    {
      if(d==0)
      {
      System.out.print(a[d]+".");
      }
      else
      {
      System.out.print(a[d]+" ,");
      }
    }
  }
}