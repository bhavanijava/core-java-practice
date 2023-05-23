package strings;

public class HighestOccuranceCharacterInString {

	public static void main(String[] args) {
				String s="acvffdddaavcccggggggggg"; 

				int Max=0;
				char ch=0;
				for(int i=0;i<=s.length()-1;i++)
				{
					int count=0;
					for(int j=0 ; j<=s.length()-1;j++)
					{
						if(s.charAt(i)==s.charAt(j))
						{
							count++;
						}
						if(count>Max)
						{
							Max=count;
							ch=s.charAt(i);
						}
					}
				}
				System.out.print(  "THE most repeated alphabet is :  " +ch + "    With   " +Max);
			}
	}


