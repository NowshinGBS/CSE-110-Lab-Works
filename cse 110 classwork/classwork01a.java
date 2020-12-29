import java.util.Scanner;
  public class classwork01a
  {
    public static void main (String [] args)
    {
      Scanner fr = new Scanner(System.in);
      System.out.println("Please a number");
      int num = fr.nextInt();
      int max = num;
      for(int c=1; c<=5; c++)
      {
        System.out.println("Please enter a number again");
        int num1 = fr.nextInt();
        if(num1>max)
          max=num1;
      }
      System.out.println(+max);
    }
  }