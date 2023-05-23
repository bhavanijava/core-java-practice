package strings;

public class DisplayOnlySymbolsFromGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','@','1','2','3'};
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 char ch=arr[i];
			 if(!((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')))
				 System.out.println("symbol="+ch);
		 }
	}

}
