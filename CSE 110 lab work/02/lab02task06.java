import java.util.Scanner;
public class lab02task06
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int num= fr.nextInt();
    
    if(num%5!=0)
    {
      if(num%2!=0)
      {
      }
      else
      {  
        System.out.println(+num); 
      }
    }
    else
    {
      System.out.println(+num); 
    }
  }
}