import java.util.Scanner;
public class lab08Task09AlsoMyInvention
{
  public static void main (String [] args)
  {
    Scanner fr= new Scanner(System.in);
    int [] a = new int [10];
    for(int c=0; c<=a.length-1; c++)
    {
      System.out.println("Type");
      a[c]=fr.nextInt();
    }
    int location=0;
    for(int i=0; i<=a.length-1; i++)
    {
      if(i%2==0)
      {
        System.out.print(a[i]+",");
      }
      else
      {
      }
    }
   for(int j=0; j<=a.length-1; j++)
    {
      if(j%2!=0)
      {
        System.out.print(a[j]+",");
      }
      else
      {
      }
    } 
  }
}
