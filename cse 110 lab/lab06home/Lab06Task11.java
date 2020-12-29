import java.util.Scanner;
public class Lab06Task11
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int linenumber;
    linenumber=sc.nextInt();
    
    int linecount=1;
    while(linecount>=linenumber)
    {
      int spacecount=1;
      while(spacecount<=linenumber-linecount)
      {
        System.out.print(" ");
        spacecount++;
      }
      int colcount=4;
        while(colcount>=linecount)
      {
        System.out.print(colcount);
        colcount--;
      }
      System.out.println();
      linecount--;
    }
  }
}