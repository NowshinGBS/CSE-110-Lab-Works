import java.util.Scanner;
public class lab07task02
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    int a[] = new int [10];
    int c;
    for(c=0; c<=a.length-1; c++)
    {
      System.out.println("Please enter a number");
      a[c] = fr.nextInt();
    }
    System.out.println("Please enter a number between 0-9");
    int d=fr.nextInt();
    System.out.println(a[d]);                   
  }
}
