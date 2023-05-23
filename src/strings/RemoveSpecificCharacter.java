package strings;

public class RemoveSpecificCharacter {

	public static void main(String[] args)
	{
		String s="sath'$aTech!h/It@So&lu*tions";
        String s1 = "";
        s1=s.replaceAll("[^a-zA-Z0-9]", "");  
        System.out.println(s1);
	}

}
