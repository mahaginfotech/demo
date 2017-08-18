import java.util.*;
public class MultiplcationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
		 int n=1, ans=0;
		 int range=sc.nextInt();
		 for(int i=1;i<=range;i++)
		 {
			 ans=numb*i;
			 System.out.println(numb+" " +"*"+" "+i+" "+"="+ans);
		 }
		

	}

}
