
public class ArvoreBinaria 
{
	
	private static int busca(int[] array, int x)
	{
		
		int meio;
		int inicio = 0;
		int fim = array.length -1;
		
		while (inicio <= fim) 
		{
			
			meio = (inicio+fim)/2;
			if (array[meio] == x)
				return meio;
			else if (array[meio] < x)
				inicio = meio + 1;
			else
				fim = meio - 1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		
        int array[] = {2,5,6,8,10,13};
        int indice = busca(array,10);
        System.out.println(indice);
	}

}
