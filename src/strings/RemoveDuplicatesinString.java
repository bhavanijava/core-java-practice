package strings;

public class RemoveDuplicatesinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ghgghgagffvvnzgg";
		String res="";
		for(int i=0;i<=str.length()-1;i++)
		{
			
			int j;
			for(j=0;j<=str.length()-1;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					break;
					
				}	
			}
			if(j==i) {
				res=res+str.charAt(i);
			}
			
		}
		System.out.println(str);
		System.out.println(res);
		
	}
	}
		

		
		




