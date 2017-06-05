import java.util.Scanner;
class Digits
{
public static void main(String args[])
{
int c=0;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter the number");
while(n!=0)
{
n=n/10;
c++
}
System.out.println(c);
