import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nomeCliente;
		double salario;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO: ");
		System.out.print("Nome do cliente: ");
		nomeCliente = input.nextLine();
		System.out.print("Salario: ");
		salario = input.nextDouble();
		
		while (salario < 0.0) {
			System.out.print("Salario: ");
			salario = input.nextDouble();
		}
		
		
		input.close();
		
	}
}
