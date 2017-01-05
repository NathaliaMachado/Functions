import java.util.Arrays;

public class ConcatOrder 
{
	static int[] order(int[] c){
		Arrays.sort(c);
		return c;
	}

	public static void main(String[] args)
	{
		int[] a = {15, 3, 7, 12};
		int[] b = {5, 10, 2};
		int[] c = new int[a.length+b.length];
		
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, 4, b.length);
		
		System.out.println(Arrays.toString(order(c)));

	}

}
