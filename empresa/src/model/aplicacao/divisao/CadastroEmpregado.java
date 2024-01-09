package model.aplicacao.divisao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

import mode.entidades.funcionario.Assalariado;
import mode.entidades.funcionario.AssalariadoComissionado;
import mode.entidades.funcionario.Comissionado;
import mode.entidades.funcionario.Empregado;
import mode.entidades.funcionario.Terceirizado;

public class CadastroEmpregado {
	SimpleDateFormat formatoData =new SimpleDateFormat("dd/MM/yyyy");
	static Scanner terminal = new Scanner(System.in);
	static Integer opcao;
	
	
	

	public static void cadEmpregado() {
		
			System.out.println("Qual o nome do Empregado ");
			
			String nome = terminal.nextLine();
			
			System.out.println("Qual o CPF do Empregado, Digite somente numeros");
			String cpf = terminal.nextLine();
			String CPF = mudarCPF(cpf);
			System.out.println("Qual A Quantidade De horas Semanais Trabalhadas? ");
			Double valor = terminal.nextDouble();
			instanciar(nome,CPF,valor);
			terminal.nextLine();
			
		}

	

	private static void instanciar(String nome, String cPF, Double valor) {
		
		try {
			System.out.println("\n1 - Empregado Assalariado\n2 - Empregado Terceirizado\n3 - Empregado Comissionado"
					+ "\n4 - Empregado Assalariado/Comissionado");
		opcao = terminal.nextInt();
		if(opcao == 1) {
			Empregado empregado  = new Assalariado(nome, cPF);
			System.out.println("Empregado Assalariado Selecionado!!!");
			System.out.println("O valor paga a este Funcionario é "+ empregado.total(valor));
			empregado.adicionarLista(empregado);
			try(BufferedWriter ac=new BufferedWriter(new FileWriter("d:\\java\\Empregado\\Assalariado.txt",true))){
				String linha="";
				while(linha.isEmpty()) {
					linha = nome.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = cPF.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = valor.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
				}
			}
			catch(IOException p1) {
				System.err.println("Erro ao Gravar dados");
			}
		}else if(opcao ==2) {
			Empregado empregado = new Terceirizado(nome, cPF);
			System.out.println("Empregado Terceirizado Selecionado!!!");
			System.out.println("O valor paga a este Funcionario é "+ empregado.total(valor));
			empregado.adicionarLista(empregado);
			try(BufferedWriter ac=new BufferedWriter(new FileWriter("d:\\java\\Empregado\\Terceirizado.txt",true))){
				String linha="";
				while(linha.isEmpty()) {
					linha = nome.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = cPF.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = valor.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
				}
			}
			catch(IOException p1) {
				System.err.println("Erro ao Gravar dados");
			}
		}else if(opcao ==3) {
			Empregado empregado = new Comissionado(nome, cPF);
			System.out.println("Empregado Comissionado Selecionado!!!");
			System.out.println("O valor paga a este Funcionario é "+ empregado.total(valor));
			empregado.adicionarLista(empregado);
			try(BufferedWriter ac=new BufferedWriter(new FileWriter("d:\\java\\Empregado\\Comissionado.txt",true))){
				String linha="";
				while(linha.isEmpty()) {
					linha = nome.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = cPF.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = valor.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
				}
			}
			catch(IOException p1) {
				System.err.println("Erro ao Gravar dados");
			}
		}else if(opcao ==4) {
			Empregado empregado = new AssalariadoComissionado (nome, cPF);
			System.out.println("Empregado Assalariado/Comissionado Selecionado!!!");
			System.out.println("O valor paga a este Funcionario é "+ empregado.total(valor));
			empregado.adicionarLista(empregado);
			try(BufferedWriter ac=new BufferedWriter(new FileWriter("d:\\java\\Empregado\\AssalariadoComissionado.txt",true))){
				String linha="";
				while(linha.isEmpty()) {
					linha = nome.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = cPF.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
					linha = valor.toString();
					ac.write(linha);
					ac.write(System.lineSeparator());
				}
			}
			catch(IOException p1) {
				System.err.println("Erro ao Gravar dados");
			}
		}
		}catch(InputMismatchException g) {
			System.out.println("Entrada Inválida, repita operacao");
			instanciar(nome,cPF,valor);
		}
	}


	
	private static String mudarCPF(String cpf)  {
		MaskFormatter mudar=null;
		try {
			
			mudar = new MaskFormatter("###.###.###-##");
			mudar.setValueContainsLiteralCharacters(false);
			return mudar.valueToString(cpf);
		}
		catch(ParseException i) {
			System.err.println("Erro ao formatar CPF");
			return cpf;
		}
		
		
	}

	
	public static void listarEmpregado() {
		String linha="";
		try(BufferedReader ac1 = new BufferedReader(new FileReader("d:\\java\\Empregado\\Assalariado.txt"))){
			System.out.println("-----------------Assalariado-----------------");
			while((linha=ac1.readLine()) !=null) {
				System.out.println(linha);
			}
		}
		catch(IOException p1) {
			System.err.println("Erro ao ler arquivo ");
			
		}
		
		try(BufferedReader ac2 = new BufferedReader(new FileReader("d:\\java\\Empregado\\Terceirizado.txt"))){
			System.out.println("-----------------Terceirizado-----------------");
			while((linha=ac2.readLine()) !=null) {
				System.out.println(linha);
			}
		}
		catch(IOException p2) {
			System.err.println("Erro ao ler arquivo ");
			
		}
		
		try(BufferedReader ac3 = new BufferedReader(new FileReader("d:\\java\\Empregado\\Comissionado.txt"))){
			System.out.println("-----------------Comissionado-----------------");
			while((linha=ac3.readLine()) !=null) {
				System.out.println(linha);
			}
		}
		catch(IOException p3) {
			System.err.println("Erro ao ler arquivo ");
			
		}
		
		try(BufferedReader ac4 = new BufferedReader(new FileReader("d:\\java\\Empregado\\AssalariadoComissionado.txt"))){
			System.out.println("-----------------AssalariadoComissionado-----------------");
			while((linha=ac4.readLine()) !=null) {
				System.out.println(linha);
			}
		}
		catch(IOException p4) {
			System.err.println("Erro ao ler arquivo ");
			
		}
	}
	
	
	
	
	
}
