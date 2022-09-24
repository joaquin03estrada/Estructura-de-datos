package DDS;

public class BinarioRecursivo {

	public static void main(String[] args) 
	{
		String b="1111";
		int n=misterio(b);
		System.out.println("1111= "+n);
	}
	public static int misterio(String b)
	{
	return Integer.parseInt(b,2); 
	}
}
