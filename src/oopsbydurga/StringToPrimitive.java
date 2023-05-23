package oopsbydurga;

public class StringToPrimitive {

	public static void main(String[] args) 
	{
		String str = "true";
		try {
			boolean bool = Boolean.parseBoolean(str);
			System.out.println(bool);
		} catch (NumberFormatException e) {
		    System.out.println("Error: " + e.getMessage());
		}

	}

}
