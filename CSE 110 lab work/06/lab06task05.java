import java.util.Scanner;
public class lab06task05
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    System.out.println("Please enter a number");
    int line;
    line = fr.nextInt();
    int linecount;
    for(linecount=1; linecount<=line; linecount++)
    {
      int columncount;
      for(columncount=1; columncount<=linecount; columncount++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}