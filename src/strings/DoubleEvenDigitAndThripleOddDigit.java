package strings;

public class DoubleEvenDigitAndThripleOddDigit {

	public static void main(String[] args)
	{
//		int[] s= {'2','5','3','6','4'};
//		for(int i=0;i<=s.length-1;i++)
//		{
//			int num=1;
//			if(i%2==0)
//			{
//				num=2*Character.getNumericValue(s[i]);
//			}
//			else
//			{
//				num=3*Character.getNumericValue(s[i]);
//			}
//			System.out.println(num);
//		}
		
		int[] arr= {2,5,3,6,4};
		for(int i=0;i<=arr.length-1;i++)
		{
			int num=0;
			if(i%2==0)
			{
				num=2*arr[i];
			}
			else
			{
				num=3*arr[i];
			}
			System.out.println(num);
		}
	}

}
