import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int orginl,rev;
orignl=n;
while(n!=0)
{
rev=rev%10;
rev=rev*10+(n%10);
n=n/10;
}
if (originl==rev)
{
System.out.println("given number is palindrome");
}

}
}

