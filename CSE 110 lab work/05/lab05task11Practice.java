//ekhane vul ache
import java.util.Scanner;
public class lab05task11Practice
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
        System.out.print(c+ ",");  
        } 
        else
        {
        }
      }
      else
      {
        if(c%7==0)
        {  
        System.out.print(c+ ",");
        } 
        else
        {
          if(c%9==0)
          {
           System.out.print(c+ ",");
          }
          else
          {
          }
        }
      }
    }
  }
}