import java.util.Scanner;
public class lab05task10
{
  public static void main (String[] args)
  {
    int sum=0;
    int c;
    for(c=1; c<=600;c++)
    {
      if(c%9==0)
      {
        if(c%7==0)
        {
//         System.out.print(c+ ","); 
       sum = sum + c;
        } 
        else
        {
        }
      }
      else
      {
      }
    }
    System.out.print(sum);
  }
}