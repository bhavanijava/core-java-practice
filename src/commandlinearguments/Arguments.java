package commandlinearguments;



public class Arguments {

	public static void main(String[] args) 
	{
		int len=args.length;
		System.out.println(len);
		// output : 0
		
		
		for(int i=0;i<=args.length-1;i++)
		{
			System.out.println(args[i]);
		}
		
	}

}
