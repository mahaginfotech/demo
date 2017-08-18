import java.util.Scanner;
public class HCFnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int a,b,t,hcf,lcm;
		a=num;
		b=num2;
		while(b!=0)
		{
			t=b;
			b=a%b;
			a=t;
			
		}
		hcf=a;
		//lcm=(num*num2)/hcf;
		System.out.print(hcf+" ");
		
		

	}

}
