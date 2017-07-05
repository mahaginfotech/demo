import java.util.*;
public class UniqIndex {
	
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=sc.nextInt();
   }
	arrayWithIndex(a);
}

public static void arrayWithIndex(int[] a) {
	for(int i=0;i<a.length;i++)
	{
		if(a[i]==i)
		{
			System.out.println(a[i]+" equal to its Index:"+i);
		} 
	}
	
}

}

    
