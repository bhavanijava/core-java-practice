package methods;

public class WithArgumentsandNoReturnValuesStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithArgumentsandNoReturnValuesStatic.isEven(4);
		WithArgumentsandNoReturnValuesStatic.isEven(13);


	}
	static void isEven(int n) {
		if(n%2==0)
		{
			System.out.println("Even "+n);
		}
		else {
			System.out.println("Not even "+n);
		}
	}
	

}
