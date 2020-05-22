import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nomeCliente, porcentagem;
		double salario, totalFinanciado;
		int numeroPrestacoes;
		
		System.out.println("DIGITE OS DADOS DO FINANCIAMENTO: ");
		System.out.print("Nome do cliente: ");
		nomeCliente = input.nextLine();
		System.out.print("Salario: ");
		salario = input.nextDouble();
		
		while (salario < 0.0) {
			System.out.print("Digite uma valor para salario positivo. Tente novamente: ");
			salario = input.nextDouble();
		}
		
		System.out.print("Numero de prestacoes: ");
		numeroPrestacoes = input.nextInt();
		System.out.print("Porcentagem de entrada: ");
		porcentagem = input.next();
		System.out.print("Valor total financiado: ");
		totalFinanciado = input.nextDouble();
		
		while ((0.2 * totalFinanciado) / numeroPrestacoes > (salario * 0.30)) {
			System.out.print("Valor invalido. Tente novamente: ");
			totalFinanciado = input.nextDouble();
		}
		
		
		input.close();
		
	}
}
