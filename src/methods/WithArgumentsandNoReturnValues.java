package methods;

public class WithArgumentsandNoReturnValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithArgumentsandNoReturnValues obj=new WithArgumentsandNoReturnValues();
		obj.isEven(4);
		obj.isEven(8);
	}
	void isEven(int n) {
		if(n%2==0)
		{
			System.out.println("Even "+n);
		}
		else {
			System.out.println("Not even "+n);
		}
	}

}
