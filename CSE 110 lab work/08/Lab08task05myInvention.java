import java.util.Scanner;
public class Lab08task05myInvention
{       
  public static void main(String[]args)
  {
    Scanner fr=new Scanner (System.in);
    int []a=new int[5];
    for(int c=0;c<=a.length-1;c++)
    {
      System.out.println("type");
      a[c]=fr.nextInt();
    }
    System.out.println("Please enter another number");
    int num = fr.nextInt();
    int i;
    int g=0;
    for(i=0; i<=a.length-1; i++)
    {
      if(a[i]==num)
      {
        num=g;
      }
      else
      {
      }
    } 
    if(num==g)
      {
        System.out.println("yes");
      }
      else
      {
        System.out.println("no");
      }
  }
}