import java.util.Scanner;
public class lab05task09d
{
  public static void main (String[] args)
  {
    int c;
    for(c=2; c<=12;c = c+2)
    {
      if(c%4==0)
      {
        System.out.print("-"+c+","); 
      } 
      else
      {
        if(c%2==0)
          //uporer line ta na korleo cholbe coz c=c+2 agei deoa ache
        {
          System.out.print(c+","); 
        } 
        else
        {
        }
      }
    }
  }
}