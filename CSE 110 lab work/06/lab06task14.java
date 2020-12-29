import java.util.Scanner;
public class lab06task14
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    System.out.println("Please enter a line number");
    int line;
    line = fr.nextInt();
    System.out.println("Please enter a column number");
    int column;
    column = fr.nextInt();
    for(int linecount=1; linecount<=line; linecount++)
    {
      for(int columncount=1; columncount<=column; columncount++)
      {
        if(linecount==1 || columncount==1 || columncount==column || linecount==line )
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