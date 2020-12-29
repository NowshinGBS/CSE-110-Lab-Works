import java.util.Scanner;
public class lab06task04
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int line;
    int column;
    line = fr.nextInt();
    column = fr.nextInt();
    for(int linecount=1; linecount<=line; linecount++)
    {
      for(int columncount=1; columncount<=column; columncount++)
      {
        System.out.print(columncount);
      }
      System.out.println();
    }
  }
}