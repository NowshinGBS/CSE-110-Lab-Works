import java.util.Scanner;
public class Lab06Task04
{
  public static void main (String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int num1;
    num1=sc.nextInt();
    //uporer line 2tak 1 line o likha jay like(int num1=sc.nextInt(); )
    int num2;
    num2=sc.nextInt();
    int linecount;
    linecount=1;
    while(linecount<=num1)
    {
      int count;
      count=1;
      while(count<=num2)
      {
        System.out.print(count);
        count++;
      }
      System.out.println();
      //uporer line a System.out.println(linecount); likha jabe na,
      //likle onno right output asbe na
      //but why?????
      //check it
      linecount++;
    }
  }
}