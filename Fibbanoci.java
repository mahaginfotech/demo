import java.util.*;
public class Fibbanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n=0,n1=1,nn=0;
		System.out.print(n+" "+n1+" ");
		for(int i=2;i<num;i++)
		{		
		int sum=n+n1;
		System.out.print(sum+" ");
		n=n1;
		n1=sum;
		}
	}

}
