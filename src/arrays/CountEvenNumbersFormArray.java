package arrays;

public class CountEvenNumbersFormArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,2,8,5,7};
		int count=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0)
				count++;
		}
		System.out.println(count);

	}

}                                                                                                                                                                                                                                                                                                                                                                            
