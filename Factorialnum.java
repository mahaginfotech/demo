import java.util.Scanner;
public class Factorialnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		while(num>0)
		{
		fact=fact*num;
		num--;
		}
		System.out.print(fact);
		
		

	}

}
