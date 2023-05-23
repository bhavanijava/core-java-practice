package java8features;

public class Lambda1_20_TablesClass {

	public static void main(String[] args) 
	{
		Lambda1_20_TablesInterface obj=()->{
			
											for(int i=1;i<=20;i++)
											{
												for(int j=1;j<=10;j++)
												{
													System.out.println(i+"*"+j+"="+(i*j));
												}
												System.out.println();
											}

		};
		obj.tables();
	}

}
