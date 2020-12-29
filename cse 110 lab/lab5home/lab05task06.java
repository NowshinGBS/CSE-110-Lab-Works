import java.util.Scanner;
public class lab05task06
{
  public static void main(String[] args)
  {
    Scanner fr=new Scanner(System.in);
    int num;
    int sum;
    sum=0;
    int c=0;
    while(c<20)
    {
      num=fr.nextInt();
      sum=sum+num;
      c++;
    }
    {
      System.out.println(sum/20);
    }
  }
}