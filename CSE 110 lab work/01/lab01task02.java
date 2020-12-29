import java.util.Scanner;
public class lab01task02
{
  public static void main (String [] args)
  {
    Scanner fr =new Scanner(System.in);
    System.out.println("please enter a number");
    int num1 = fr.nextInt();
    System.out.println("Please enter another number");
    int num2 = fr.nextInt();
    
    System.out.println("Sum : "+(num1+num2));
    System.out.println("Product : "+(num1*num2));
    System.out.println("Difference : "+(num1-num2));
    
  }
}