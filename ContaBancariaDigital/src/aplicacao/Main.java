package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Conta;
import model.entites.pf.ClientePF;
import model.entites.pf.ContaCorrente;
import model.entites.pf.ContaPoupanca;

public class Main {


	public static void main(String[] args)   {
		Locale.setDefault(Locale.US);
		Scanner terminal = new Scanner(System.in);
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");


		Conta contaPoupanca = new ContaPoupanca();
		Conta contaCorrente = new ContaCorrente();
		
		System.out.println("Digite nome do cliente  ");
		String nome = terminal.nextLine();
		
		System.out.println("Digite o CPF somento numeros  ");
		String cpf = terminal.nextLine();



		Date dataNascimento = null;
		try{
			System.out.println("Digite A data de Nascimento no formato exemplo 11/11/1900  ");
			dataNascimento = formatoData.parse(terminal.nextLine());
		} catch     (ParseException e){
			System.out.println("Dados Incorretos, Digite novamente  ");
			System.out.print("Digite A data de Nascimento no formato exemplo 11/11/1900   ");
			try {
				dataNascimento = formatoData.parse(terminal.nextLine());
			} catch (ParseException e1) {

				e1.printStackTrace();

			}

		}
		ClientePF cliente = new ClientePF(nome, cpf, dataNascimento);
		System.out.print(cliente.toString());
		
		Integer opcao1 = 0 ;
		do {
			
			System.out.println("\nAgencia "+contaPoupanca.getAgencia());
			
			System.out.println("Numero Conta poupança "+contaPoupanca.getNumero());
			System.out.println("Numero Conta Corrente "+contaCorrente.getNumero());
			System.out.println("Cliente "+cliente.getNome());
			System.out.println("\n1 - Verificar Saldo\n2 - Deposito\n3 - Saque\n4 - Emprestimo\n0 - Sair");
			
			opcao1 = terminal.nextInt();
			switch (opcao1) {
			case 1:
				System.out.println("Digite 1 para ver saldo conta corrente ou 2 para ver saldo conta poupanca");
				int saldo = terminal.nextInt();
				if(saldo == 1) {
					System.out.println("Saldo Conta Corrente Atualizado é "+ contaCorrente.getSaldo());
				}
				else if(saldo == 2) {
					System.out.println("Saldo Conta Poupanca Atualizado é "+ contaPoupanca.getSaldo());
				}
				else {
					System.out.println("Opcao invalida");
				}
				break;
			case 2:
				System.out.println("Digite 1 para depositar na conta corrente ou 2 para depositar na conta poupanca");
				int deposito = terminal.nextInt();
				if(deposito == 1) {
					System.out.print("Digite um valor do Deposito para conta corrente");
					double valorDeposito = terminal.nextDouble();
					contaCorrente.deposito(valorDeposito);
					System.out.println("Saldo Conta Corrente Atualizado é "+ contaCorrente.getSaldo());
				}
				else if(deposito == 2) {
					System.out.print("Digite um valor do Deposito para conta poupanca");
					double valorDeposito = terminal.nextDouble();
					contaPoupanca.deposito(valorDeposito);
					System.out.println("Saldo Atualizado é "+ contaPoupanca.getSaldo());
				}
				else {
					System.out.println("Opcao invalida");
				}

				break;
			case 3:
				System.out.println("Digite 1 para saque na conta corrente ou 2 para saque na conta poupanca");
				int saque = terminal.nextInt();
				if(saque == 1) {
					System.out.print("Digite o valor do Saque na conta corrente ");
					double valorSaque = terminal.nextDouble();
					contaCorrente.saque(valorSaque);
					System.out.println("Saldo Conta Corrente Atualizado é "+ contaCorrente.getSaldo());
				}
				else if(saque == 2) {
					System.out.print("Digite o valor do Saque na conta poupanca ");
					double valorSaque = terminal.nextDouble();
					contaPoupanca.saque(valorSaque);
					System.out.println("Saldo Atualizado é "+ contaPoupanca.getSaldo());
				}
				else {
					System.out.println("Opcao invalida");
				}
				break;
			case 4:
				System.out.println("Digite 1 para emprestimo na conta corrente ou 2 para emprestimo na conta poupanca");
				int emprestimo = terminal.nextInt();
				if(emprestimo == 1) {
					System.out.print("Digite o valor do emprestimo na conta corrente ");
					double valorEmprestimo = terminal.nextDouble();
					contaCorrente.emprestimo(valorEmprestimo);
					System.out.println("Saldo Conta Corrente Atualizado é "+ contaCorrente.getSaldo());
				}
				else if(emprestimo == 2) {
					System.out.print("Digite o valor do emprestimo na conta poupanca ");
					double valorEmprestimo = terminal.nextDouble();
					contaPoupanca.emprestimo(valorEmprestimo);
					System.out.println("Saldo Atualizado é "+ contaPoupanca.getSaldo());
				}
				else {
					System.out.println("Opcao invalida");
				}
				break;
			
				
			case 0:
				break;
			default:
				System.out.print("opcao Invalida ");
				break;
			}
		}while(opcao1 != 0) ;










		terminal.close();
	}

}
