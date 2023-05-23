package whileloop;

public class ArmSttrongNumbersFrom1_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r, sum = 0;
        System.out.println("Armstrong numbers from 1 to 1000:");
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n != 0)
            {
                r= n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.println(i+" ");
            }
            sum = 0;
        }
	}

}
