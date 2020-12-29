import java.util.Scanner;
public class lab05task01
{
  public static void main (String[] args)
  {
    int c;
    for(c=1; c<=5;c++)
    {
      Scanner fr = new Scanner(System.in);
      int num =fr.nextInt();
      if(num%2==0)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
  }
}