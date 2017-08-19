import java.util.Scanner;
public class Checknumofchr {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		int count=0,count1=0,count2=0;
		for(int i=0;i<s.length();i++)
		{
			if(c[i]>='A' && c[i]<='Z'|| c[i]>='a' && c[i]<'z')
			{
				count++;
			}
			else if(c[i]>='0' && c[i]<='9')
			{
				count1++;
			}
			else 
				count2++;
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
			
	}

}
