import java.util.Scanner;
public class lab08Task07
{
  public static void main (String []args)
  {
    Scanner fr = new Scanner(System.in);
    int [] a = new int [5];
    for(int c=0; c<=a.length-1; c++)
    {
      System.out.println("Please enter a number");
      a[c]=fr.nextInt();
      for(int i=0; i<=c; i++)
      {
        System.out.print(a[i]+ " ");
      }
      System.out.println();
    }
  }
}