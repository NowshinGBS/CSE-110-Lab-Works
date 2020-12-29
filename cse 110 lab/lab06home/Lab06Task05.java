import java.util.Scanner;
public class Lab06Task05
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int linenumber;
    linenumber=sc.nextInt();
    
    int linecount=1;
    while(linecount<=linenumber)
    {
      int colcount=1;
      while(colcount<=linecount)
      {
        System.out.print("*");
        colcount++;
      }
      int spacecount=1;
      while(spacecount<=linecount)
      {
        System.out.print(" ");
        spacecount++;
      }
      System.out.println();
      linecount++;
    }
  }
}