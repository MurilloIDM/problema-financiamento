import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nomeCliente, porcentagemTexto;
		double salario, totalFinanciado, entrada, financiamento, parcela;
		int numeroPrestacoes, porcentagem, opcao;
		boolean flag = true;
		
		entrada = 0;
		financiamento = 0;
		parcela = 0;
		
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
		porcentagemTexto = input.next();
		System.out.print("Valor total financiado: ");
		totalFinanciado = input.nextDouble();
		
		while ((0.2 * totalFinanciado) / numeroPrestacoes > (salario * 0.30)) {
			System.out.print("Valor invalido. Tente novamente: ");
			totalFinanciado = input.nextDouble();
		}
		
		porcentagemTexto = porcentagemTexto.replace("%", "");
		porcentagem = Integer.parseInt(porcentagemTexto);
		
		while (flag) {
			
			System.out.println("\nMENU: ");
			System.out.println("1 - Mostrar o valor da entrada");
			System.out.println("2 - Mostrar o valor financiado");
			System.out.println("3 - Mostrar o valor de cada prestação");
			System.out.println("4 - Sair");
			System.out.print("Digite uma opcao: ");
			opcao = input.nextInt();
			
			switch (opcao) {
				case 1:
					entrada = totalFinanciado * (porcentagem / 100.00);
					System.out.printf("%nENTRADA = R$ %.2f%n", entrada);
					break;
				case 2:
					financiamento = totalFinanciado - entrada;
					System.out.printf("%nVALOR FINANCIADO = R$ %.2f%n", financiamento);
					break;
				case 3:
					parcela = financiamento / numeroPrestacoes;
					System.out.printf("VALOR DE CADA PRESTACAO = R$ %.2f%n", parcela);
					break;
				case 4:
					flag = false;
					break;
				default:
					System.out.println("Digite um valor válido!!!");
					break;
			}
		}
		
		System.out.println("\nFIM DO PROGRAMA!!!!");
		
		input.close();
		
	}
}
