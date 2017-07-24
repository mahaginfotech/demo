import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Playyer177 {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ss[]=s.split(" ");
		ArrayList al=new ArrayList();
		String sa = null;
		for(int i=0;i<ss.length;i++)
		{
			sa=ss[i];
			for(int l=0;l<sa.length();l++)
			{  
				al.add(sa.charAt(l));
				//System.out.print(al);
				//Collections.sort(al);
			}
			if(sa.matches("[a-zA-Z]"))
			{
			Collections.sort(al);
			//System.out.print(al);
			}
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next());
			}
System.out.print(" ");
			
			al.clear();
		}
				
		

		
		
	}
}
