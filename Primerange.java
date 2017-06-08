import java.util.Scanner;
class Primerange
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=0;i<n/2;i++)
{
if(n%i==0)
System.out.println(i);
}
}
}
