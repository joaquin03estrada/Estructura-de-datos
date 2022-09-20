package DDS;

public class IntToString 
{
	public static void main(String[] args) 
	{
		int n=4,cadena;
		String caden="10",gn="";
		cadena=Integer.parseInt(caden);
		String nuevo=intstring(n,gn);
		System.out.println(nuevo);
	}

	public static String intstring (int n,String gn)
	{
		gn=Integer.toString(n);
		return gn;
	}
}
