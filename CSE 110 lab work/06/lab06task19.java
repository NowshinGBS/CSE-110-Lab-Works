import java.util.Scanner;
public class lab06task19
{
  public static void main (String[] args)
  {
    Scanner fr = new Scanner(System.in);
    int line;
    line = fr.nextInt();
    for(int linecount=1; linecount<=line; linecount++)
    {
      int spacecount;
      for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=1; columncount<=linecount;columncount++)
      {
        if(columncount==1 || columncount==linecount || linecount==line)
        {
          System.out.print(line+columncount-linecount);
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