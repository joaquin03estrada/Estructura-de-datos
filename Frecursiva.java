package DDS;

public class Frecursiva {

	public static void main(String[] args) 
	{
		int n=15;
		int n1=20;
		int num=misterio(n);
		int nume=misterio2(n1);
		System.out.println("15= "+num);
		System.out.println("20= "+nume);
		
	}
	
	public static int misterio(int n)
	{
		if(n==1||n==0)
			return n;
		
		else
			return 10*misterio(n/2)+n%2;
	}
	
	public static int misterio2(int n1)
	{
		if(n1==1||n1==0)
			return n1;
		
		else
			return 10*misterio(n1/2)+n1%2;
	}

}
