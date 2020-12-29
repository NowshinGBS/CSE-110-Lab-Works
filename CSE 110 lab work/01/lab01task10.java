// eta question er ans na modifie kora
//Q: user joti gula number e dik na keno tumi shudu 1st 5 ta even number e print korba. 
import java.util.Scanner;
public class lab01task10
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    System.out.println("Please Enter A Number");
    int num = fr.nextInt();
    
    int c;
    for(c=1; c<=num; c++)
    {
      if (c<=10)
      {
        if(c%2==0)
        {
          System.out.println(c);
        }
        else
        {
        }
      }
      else
      { 
      }
    }
  }
}