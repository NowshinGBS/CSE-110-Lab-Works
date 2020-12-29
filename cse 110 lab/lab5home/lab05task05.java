import java.util.Scanner;
public class lab05task05
{
public static void main(String[] args)
{
Scanner fr=new Scanner(System.in);
int num;
int c=0;
while(c<20)
{
num=fr.nextInt();
{
if(num%2==0)
{
System.out.println("Even number");
}
else
{
System.out.println("odd number");
}
}
c++;
}
}
}