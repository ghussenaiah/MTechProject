
public class SumTest {

	
	public static int sum(int[] s)
	
	{
		int total=0;
		for(int i=0;i<s.length;i++)
		{
			total =total+s[i];
		}
		
		return total;
	}
public static int mul(int[] m)
	
	{
		int mul=1;
		for(int j=0;j<m.length;j++)
		{
			mul =mul*m[j];
		}
		
		return mul;
	}
}
