package ideyalabs;


public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r, sum = 0;
        System.out.println("Armstrong numbers from 0 to 999:");
        for(int i = 0; i <= 1000; i++)
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
                System.out.print(i+" ");
            }
            sum = 0;
        }
	}

}
