import java.io.*;
import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();

if(num%2==0)
{
System.out.println("the number is even");
}
if(num%2!=0)
{System.out.println("The number is odd");
}
}
}


