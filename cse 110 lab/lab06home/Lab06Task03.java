import java.util.Scanner;
public class Lab06Task03
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int linecount=1;

while(linecount<=num1)
{
  int count=1;
while(count<=num2)
  {
  System.out.print("*");
    count++;
  }
  System.out.println();
  linecount++;
}
}
}