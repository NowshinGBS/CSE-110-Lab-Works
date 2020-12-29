import java.util.Scanner;
public class lab08task05
{
  public static void main (String [] args)
  {
    Scanner fr = new Scanner(System.in);
    // prothomei jodi [Scanner fr = new Scanner(System.in)] tahole bar bar input nite hole
    //bar bar ei line ta likhar dorkar nai 
    int a []= new int [10];
    int c;
    for(c=0; c<=a.length-1; c++)
    {  
      a[c] = fr.nextInt();
    }
//    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter another number");
    int b = fr.nextInt();
    int e=0;
    int d;
    for(d=0; d<=a.length-1 ; d++)
    {
      if(a[d]==e)
      {
        e=e+1;
      }
    }
    if(e==0)
    {
      System.out.println("No");
    }
    else
    {
      System.out.println("Yes");
    }
  }
}