public class Hunter4Set1{

	public static void main(String[] args) 
	{
		int n = args.length;
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i]);		
		b[i]=0;
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
			if(a[i]==a[j])
			{
				b[i]=b[i]+1;
				
			}
			
			}}
		//	for(int m=0;m<n;m++)
		//	System.out.println(b[m]);
			
			
		for(int i=0;i<n;i++)
		{
			if(b[i]<2)
			{
			System.out.println("The unique element is " +a[i]);
			}
			}
		}
}
