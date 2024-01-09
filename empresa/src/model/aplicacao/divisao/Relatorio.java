package model.aplicacao.divisao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Relatorio {

	@SuppressWarnings("unused")
	public static void relatorioContas() {
	  SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	
	  try (BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Conta\\Titulo.txt"))){
		  String linha = null;
		  System.out.println();
		  System.out.println("Relatorio dados a Pagar conta Titulo");
		  while((linha = ac.readLine()) != null) {
			  System.out.println(ac.readLine());
		  }
	  }
	  catch(IOException e) {
		  System.err.println("Erro ao ler Arquivo ");
	  }
	  try (BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Conta\\Concessionaria.txt"))){
		  String linha = null;
		  System.out.println();
		  System.out.println("Relatorio dados a Pagar conta Concessionaria");
		  while((linha = ac.readLine()) != null) {
			  System.out.println(ac.readLine());
		  }
	  }
	  catch(IOException e) {
		  System.err.println("Erro ao ler Arquivo ");
	  }





	}

	
	public static void relatorioEmpregado() {
		try(BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Empregado\\Assalariado.txt"))){
			String linha = null;
			System.out.println();
			System.out.println("Relatório Contas a Pagar dos Empregados Assalariado ");
			while((linha = ac.readLine())!= null) {
				System.out.println(linha);
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao ler arquivo ");
			e.printStackTrace();
		}
		try(BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Empregado\\Comissionado.txt"))){
			String linha = null;
			System.out.println();
			System.out.println("Relatório Contas a Pagar dos Empregados Comissionado ");
			while((linha = ac.readLine())!= null) {
				System.out.println(linha);
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao ler arquivo ");
			e.printStackTrace();
		}
		try(BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Empregado\\Terceirizado.txt"))){
			String linha = null;
			System.out.println();
			System.out.println("Relatório Contas a Pagar dos Empregados Terceirizado ");
			while((linha = ac.readLine())!= null) {
				System.out.println(linha);
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao ler arquivo ");
			e.printStackTrace();
		}
		try(BufferedReader ac = new BufferedReader(new FileReader("d:\\java\\Empregado\\AssalariadoComissionado.txt"))){
			String linha = null;
			System.out.println();
			System.out.println("Relatório Contas a Pagar dos Empregados Assalariado/Comissionado ");
			while((linha = ac.readLine())!= null) {
				System.out.println(linha);
			}
		}
		catch(IOException e) {
			System.err.println("Erro ao ler arquivo ");
			e.printStackTrace();
		}
	}
}
