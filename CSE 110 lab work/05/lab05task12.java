import java.util.Scanner;
public class lab05task12
{
  public static void main (String [] args)
  {
    int sum =0; 
    int c;
    for(c=0; c<=600; c++)
    {
      if(c%7==0)
      {
        if(c%9==0)
        {
        }
        else
        {
          // System.out.print(c+", ");
          sum = sum + c;
        }
      }
      else
      {
        if(c%9==0)
        {
          //  System.out.print(c+" ,");
          sum = sum + c;
        }
        else
        {
        }
      }
    }
    System.out.print(sum);
  }
}