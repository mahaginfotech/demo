import java.io.*;
class Oddrange
{
public static void main(String args[])
{
int i;
Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
for(i=0;i<limit;i++)

if(i%2!=0)
System.out.println(i);
}
}

