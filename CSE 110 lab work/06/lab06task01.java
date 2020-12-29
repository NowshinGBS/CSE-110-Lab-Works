import java.util.Scanner;
public class lab06task01
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int num;
    num = fr.nextInt();
    for(int c=1; c<=num; c++)
    {
      System.out.print(c);
    }
  }
}