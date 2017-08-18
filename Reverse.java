import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int rev=0,r;
    while(num!=0)
    {
    	r=num%10;
    	rev=rev*10+r;
    	num=num/10;
    }
	
	System.out.print(rev);
	}
}
