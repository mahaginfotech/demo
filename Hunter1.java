	
		import java.util.*;
	

		public class Hunter1 {
		   public static void main(String[] args) 
		   {
		      Scanner s = new Scanner(System.in); // use the Scanner class to read from stdin
		     int n=s.nextInt();
		       int a[]=new int[n];
		       for(int i=0;i<n;i++)
		           {
		           a[i]=s.nextInt();
		       }
		       Arrays.sort(a);
		       for(int i=0;i<n;i++)
		       {
		           if(a[i]==a[(i+1)%n])
		                   System.out.println(a[i]);
		       }
		           
		   }
		

	}


