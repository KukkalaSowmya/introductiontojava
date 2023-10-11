//java program of sum of n using bruteforce and Scanner class
import java.util.Scanner;
public class sumofn
{
public static void main(String args[])
  {
  int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    n=sc.nextInt();
    //forloop
    for (int i=1;i<=n;i++)
      sum=sum+i;
    System.out.println("sum of n numbers is:"+sum);
      }
}