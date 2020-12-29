import java.util.Scanner;
public class lab07task08
{
  public static void main (String []args)
  {
    
    Scanner fr =new Scanner(System.in);
    int a []= new int [5]; 
    int c;
    for(c=0; c<=a.length-1; c++)  
    {
      System.out.println("Please enter a number");
      a[c] = fr.nextInt();
    }
    int max=a[0];
    int maxlocation =0;
    int d;
    for(d=0; d<=a.length-1; d++)
    {
      if(max<a[d])
      {
        max = a[d];
        maxlocation = d;
      }
    }
    System.out.println("largest number "+max+" was found at location "+maxlocation);
  }
}