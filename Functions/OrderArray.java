import java.util.Arrays;

public class OrderArray {
	
	
	static int pegaMaior (int[] array)
	{
		int[] a;
		int[] b;
		
		if (array.length == 1)
			return array[0];
			
		else if (array.length == 2)
		{
			if (array[0] >= array[1])
				return array[0];
			
				else
				  return array[1];			
		}
		
		if ((array.length % 2 ) == 0)
		{
			a = Arrays.copyOfRange(array, 0, array.length / 2);
			b = Arrays.copyOfRange(array, (array.length / 2) + 1, array.length);
		}
		
	    else
		{
	    	a = Arrays.copyOfRange(array, 0, (array.length -1) / 2);
			b = Arrays.copyOfRange(array, ((array.length -1) / 2) +1, array.length);
		}
		
		int ma = pegaMaior(a);
		int mb = pegaMaior(b);
		
		if(ma > mb)
		{
			return ma;
		} 
		else
		{ 
			return mb;
		}
	}
	
	public static void main(String[] args) 
	{
		
		int[] array = {2, 15, 7, 21, 19, 3, 10, 4, 8, 0, 32};
		
		System.out.println("O maior valor é: " + pegaMaior(array));
		
	}

}
