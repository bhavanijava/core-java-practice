package arrays;

public class ContainsOnlyOddProgram {

	public static void main(String[] args)
	{
		int[] arr= {2,4,6};
		
		boolean found=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("Odd");
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Even");
		}
		
		
//		List<Integer> list = List.of(7,9,5);
//
//        boolean hasEven = false;
//        boolean hasOdd = false;
//
//        for (Integer num : list) 
//        {
//        	if (num % 2 == 0) 
//        	{
//        		hasEven = true;
//        	} else 
//        	{
//        		hasOdd = true;
//        	}
//        }
//
//        if (hasEven && hasOdd) 
//        {
//            System.out.println("The list contains both even and odd values.");
//        } else if (hasEven)
//        {
//            System.out.println("The list contains only even values.");
//        } else if (hasOdd) 
//        {
//            System.out.println("The list contains only odd values.");
//        }
//        else
//        {
//        	System.out.println("List Is Empty");
//        }
	}

}


