package model.aplicacao.divisao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import mode.entidades.conta.Concessionaria;
import mode.entidades.conta.Conta;
import mode.entidades.conta.Titulo;

public class CadastrarConta {
	static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner terminal = new Scanner(System.in);
	

	
	public static void cadastroContaEmpresa()  {
		Date dataVenc=null;
		Date dataPag=null;
		Double valor = 0.0;
		try {
			System.out.println("Qual a Data de Vencimento? ");
			dataVenc= formatoData.parse(terminal.next());
			System.out.println("Qual a Data de Pagamento? ");
			dataPag= formatoData.parse(terminal.next());
			System.out.println("Qual valor das despesas?");
			valor = terminal.nextDouble();
		}
		catch(ParseException e1) {
			try{
				System.out.println("Data no formato Inválido, Digite novamente no formato "

					+ "dd/MM/yyyy");
				System.out.println("Qual a Data de Vencimento? ");
				dataVenc= formatoData.parse(terminal.next());
				System.out.println("Qual a Data de Pagamento? ");
				dataPag= formatoData.parse(terminal.next());
				System.out.println("Qual valor das despesas?");
				valor = terminal.nextDouble();
			}
			catch(ParseException e2) {
				System.err.println("Data no formato Inválido, Repita Operação ");
				cadastroContaEmpresa();
			}
		}
		tipoConta(dataVenc,dataPag,valor);
		

	}
	public static void tipoConta(Date dataVenc,Date dataPag,Double valor) {
		System.out.println("\n1 - Conta Concessionaria? \n2 - Titulo? ");
		Integer opcao = null;
		try{
			opcao = terminal.nextInt();
		}catch(InputMismatchException f) {
			System.err.println("Dados Inválidos ");
		}
		if (opcao == 1) {
			Conta conta= new Concessionaria(dataPag, dataVenc, valor);
			try(BufferedWriter aC =new BufferedWriter(new FileWriter("d:\\java\\Conta\\Concessionaria.txt",true))){
				String linha="";

				while(linha.isEmpty()){
					linha = dataPag.toString();
					aC.write(linha);
					aC.write(System.lineSeparator());

					linha = dataVenc.toString();
					aC.write(linha);
					aC.write(System.lineSeparator());

					linha = valor.toString();
					aC.write(linha);
					aC.write(System.lineSeparator());


				}
			}catch(IOException e) {
				System.err.println("Erro ao Criar Arquivo");
			}
			System.out.println("Conta tipo Concessionaria");
			System.out.println("O valor Total a Pagar é  " +conta.total(valor));
			conta.adicionarLista(conta);
		}
		else if (opcao == 2){
			Conta conta = new Titulo(dataPag, dataVenc, valor);
			Double valor1 = conta.total(valor);
			try(BufferedWriter ac = new BufferedWriter(new FileWriter("d:\\java\\Conta\\Titulo.txt",true))){
				String linha="";
				while(linha.isEmpty()) {
					linha = dataPag.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = dataVenc.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = valor1.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
				}
			}catch(IOException t) {
				System.err.println("Erro ao Criar Arquivo");

			}
			System.out.println("Conta tipo Titulo");
			System.out.println("O valor Total a Pagar é  " +conta.total(valor));
			conta.adicionarLista(conta);
		}

	}

	public static void listarConta() {
		String linha="";
		try(BufferedReader ac = new BufferedReader(new FileReader(("d:\\java\\Conta\\Concessionaria.txt")))){
			System.out.println("Contas Concessionarias ");
			System.out.println("-----------------------------------");
			while(( linha =ac.readLine()) != null) {

				System.out.println(linha);
			}

			System.out.println("-----------------------------------");


		}catch(IOException e) {
			System.err.println("Erro ao ler arquivo");
		}
		try(BufferedReader ac = new BufferedReader(new FileReader(("d:\\java\\Conta\\Titulo.txt")))){
			System.out.println("Contas Titulo ");
			System.out.println("-----------------------------------");
			
			while((linha= ac.readLine()) != null) {

				System.out.println(linha);
				
			}

			System.out.println("-----------------------------------");


		}catch(IOException e) {
			System.err.println("Erro ao ler arquivo");
		}
	}
}


