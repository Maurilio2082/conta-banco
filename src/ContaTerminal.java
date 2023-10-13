import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroConta;
		String agencia, nomeCliente;
		double saldo;

		System.out.println("Por favor, digite seu Nome e Sobrenome !");
		nomeCliente = entrada.nextLine();
		System.out.println("Por favor, digite o número da Agência !");
		agencia = entrada.nextLine();
		System.out.println("Por favor, digite o número da Conta !");
		numeroConta = entrada.nextInt();
		System.out.println("Por favor, digite o saldo da conta !");
		saldo = entrada.nextDouble();

		System.out.printf(
				"Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque",
				nomeCliente, agencia, numeroConta, saldo);

		entrada.close();
	}
}