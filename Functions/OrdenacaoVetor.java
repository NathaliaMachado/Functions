
public class OrdenacaoVetor 
{
	public static void main(String[] args)
	{
		
		int[] vetor = {3, 9, 5, 7, 2, 10, 1, 13, 25, 19};
		int aux = 0;
		
		for (int i = 0; i < vetor.length; i++)
		{
			for (int j = 0; j < vetor.length; j++)
			{
				if (vetor[i] < vetor[j])
				{
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
		
		for (int k = 0; k < vetor.length; k++)
		{
			System.out.println(vetor[k]);
		}
		
	}

}
