import java.util.Scanner;
public class lab06task23
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    System.out.println("Please enter a line number");
    int line;
    line = fr.nextInt();
    int linecount;
    for(linecount=1; linecount<=line; linecount++)
    {
      int spacecount;
      for(spacecount=1; spacecount<=line-linecount; spacecount++)
      {
        System.out.print(" ");
      }
      int columncount;
      for(columncount=1; columncount<=2*linecount-1;columncount++)
      {
        if(columncount==1 || columncount==2*linecount-1)
        {
          System.out.print(columncount);
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(linecount=1; linecount<=line-1; linecount++)
    {
      for(int spacecount=1; spacecount<=linecount; spacecount++)
      {
        System.out.print(" ");
      }
      for(int columncount=1; columncount<=2*line-(2*linecount+1);columncount++)
      {
        if(columncount==1 || columncount==2*line-(2*linecount+1))
        {
          System.out.print(columncount);
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