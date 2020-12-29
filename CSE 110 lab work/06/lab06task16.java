import java.util.Scanner;
public class lab06task16
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
        if(columncount==1 || columncount==linecount || linecount==line)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}