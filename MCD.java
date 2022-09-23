package DDS;

public class MCD {

	public static void main(String[] args) 
	{
		int a=50,b=120;
		int n=MaxComDiv(a,b);
		System.out.println("MCD: "+n);
		
	}
	
	public static int MaxComDiv(int a, int b)
	{
		if (b == 0) return a;
		return MaxComDiv(b,a%b);
	}

}
