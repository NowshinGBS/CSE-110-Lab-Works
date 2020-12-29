import java.util.Scanner;
public class lab05task02
{
  public static void main (String[] args)
  {
    Scanner fr=new Scanner(System.in);
    int num;
    int sum;
    sum=0;
    int c=0;
    while(c<5)
    {
      num=fr.nextInt();
      sum=sum+num;
      c++;
    }
    {
      System.out.println("avrage is "+sum/5);
    }
  }
}