import javax.swing.JOptionPane;

public class Fatorial 
{
	public int fatorialRecursivo(int num)
	{
		// Caso base
		if (num == 0)
			return 1;
		return num*fatorialRecursivo(num-1);
	}
    
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		Fatorial b = new Fatorial();
		n = b.fatorialRecursivo(n);
		
		JOptionPane.showMessageDialog(null, "O fatorial de é: " + n);
	}
}
