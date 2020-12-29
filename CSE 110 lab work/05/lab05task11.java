import java.util.Scanner;
public class lab05task11
{
  public static void main (String [] args)
  {
    int sum=0;
    int c;
    for(c=0; c<=600; c++)
    {
      if(c%7==0)
      {
        // System.out.println(c);
        sum = sum+c;
      } 
      else
      {
        if(c%9==0)
        {
          //System.out.println(c);
          sum = sum+c;
        }
        else
        {
        }
      }
    }
    System.out.println(sum);
  }
}