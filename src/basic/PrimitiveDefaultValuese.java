package basic;

public class PrimitiveDefaultValuese {

	public static byte b;
	static short s;
	static int i;
	static long l;
	static char ch;
	static float f;
	static double d;
	static boolean bl;	
	

	public static void main(String[] args)
	{
		PrimitiveDefaultValuese obj=new  PrimitiveDefaultValuese();

		System.out.println("display  non static value with object reference ");
		System.out.println("byte defalut value is:"+obj.b);
		System.out.println();

		System.out.println("dispaly static values with direct");
		System.out.println("byte defalut value is:"+b);
		System.out.println("short defalut value is:"+s);
		System.out.println("int defalut value is:"+i);
		System.out.println("long defalut value is:"+l);
		System.out.println("char defalut value is: blank space character"+ch);
		System.out.println("float defalut value is:"+f);
		System.out.println("double defalut value is:"+d);
		System.out.println("boolean defalut value is:"+bl);
		System.out.println();


		System.out.println("byte size is:"+Byte.SIZE/8+" bytes");
		System.out.println("short size is:"+Short.SIZE/8+" bytes");
		System.out.println("int size is:"+Integer.SIZE/8+" bytes");
		System.out.println("long size is:"+Long.SIZE/8+" bytes");
		System.out.println("char size is:"+Character.SIZE/8+" bytes");
		System.out.println("float size is:"+Float.SIZE/8+" bytes");
		System.out.println("double size is:"+Double.SIZE/8+" bytes");
		System.out.println();


		System.out.println("byte value is: "+Byte.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("short value is: "+Short.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("int value is: "+Integer.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("long value is: "+Long.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("char value is: "+Character.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("float value is: "+Float.MIN_VALUE+" "+Byte.MAX_VALUE);
		System.out.println("double value is: "+Double.MIN_VALUE+" "+Byte.MAX_VALUE);

	}

}

