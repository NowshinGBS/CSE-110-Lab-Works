import java.util.Scanner;
public class lab05task02
{
  public static void main (String[] args)
  {
    int sum=0;
    int c;
    for(c=1; c<=5;c++)
    {
      Scanner fr = new Scanner(System.in);
      int num = fr.nextInt();
      sum = sum + num;
    }
    int Average = sum/5;
    {
      System.out.println("Average : " +Average);
    }
  }
}