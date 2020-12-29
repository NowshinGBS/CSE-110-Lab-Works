import java.util.Scanner;
public class lab02task01{
  public static void main (String [] args){
    Scanner fr = new Scanner(System.in);
    int num= fr.nextInt();
    
    if(num>10){
      if(num%2==0){
        System.out.println("An even number greater than 10");
      }
      else{
        System.out.println("An odd number greater than 10");
      }
    }
    else{
      if(num%2==0){
        System.out.println("An even number not greater than 10");
      }
      else{
        System.out.println("An odd number not greater than 10");
      }
    }
  }
}