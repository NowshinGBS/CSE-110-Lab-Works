import java.util.Scanner;
public class classwork05
{
  public static void main (String [] args)
  {
    int sum = 0;
    for(int c=0; c<=600; c++)
    {
      if(c%7==0)
      {
        System.out.print(c+",");
        sum = sum + c;
      }
      else{
        if(c%9==0)
        {
          System.out.print(c+",");
          sum = sum + c;
        } 
      }
    }
    System.out.println(+sum);
  }
}