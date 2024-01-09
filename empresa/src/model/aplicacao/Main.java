package model.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import model.aplicacao.divisao.CadastrarConta;
import model.aplicacao.divisao.CadastroEmpregado;
import model.aplicacao.divisao.Relatorio;

public class Main {
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("unused")
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
		Scanner terminal = new Scanner(System.in);
		int opcao;
		do{
			System.out.println("\n1 - Cadastro Tipo de conta? \n2 - Cadastro Empregado?"
					+ "\n3 - Listar Contas\n4 - Listar Empregados\n5 - Relatorio de Valores Pagos\n6 - Sair");
			opcao = terminal.nextInt();

			switch (opcao) {

			case 1: 
				CadastrarConta.cadastroContaEmpresa();
				break;
			case 2:
				
				CadastroEmpregado.cadEmpregado();
				break;
				
			case 3:
				CadastrarConta.listarConta();
				break;
			case 4:
				CadastroEmpregado.listarEmpregado();
				break;
			case 5:
				Relatorio.relatorioContas();
				Relatorio.relatorioEmpregado();
				break;
				
			}
			
		}while(opcao!=6);


		terminal.close();
	}
}