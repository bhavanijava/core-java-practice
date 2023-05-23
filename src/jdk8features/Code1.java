package jdk8features;

@FunctionalInterface
public interface Code1 {
	void m();
	
}
class Code2 implements Code1{
	public void m() {
		for(int i=1;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
				System.out.println(i+"-"+j+"="+(i-j));
				System.out.println(i+"+"+j+"="+(i+j));

			}
			System.out.println(" ");
		}
	}
}
