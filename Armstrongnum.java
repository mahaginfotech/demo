import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int pow=s.length();
		int sum=0;
		int am=Integer.parseInt(s);
		int temp=am;
		while(am>0)
		{
		int r=am%10;
		int pr=1;
		for(int i=0;i<pow;i++)
		{
			pr=pr*r;
		}
		sum=sum+pr;
		am=am/10;
	}
		System.out.print(sum);
		if(sum==temp)
		System.out.print("amstrng num");
		
		
		}}
