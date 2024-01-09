package mode.entidades.funcionario;

import java.util.ArrayList;
import java.util.List;

import mode.servicos.Pagavel;

public class Empregado implements Pagavel {
	private  String nome;
	private  String CPF;
	
	private List<Empregado> listaEmpregado = new ArrayList<>();
	
	public Empregado(String nome, String CPF) {
		this.nome= nome;
		this.CPF = CPF;
	}
	
	
	public  String getNome() {
		return nome;
	}

	public   String getCPF() {
		return CPF;
	}


	public List<Empregado> getListaEmpregado() {
		return listaEmpregado;
	}
	public void adicionarLista(Empregado lista) {
		listaEmpregado.add(lista);
	}

	
	
	@Override
	public  String toString() {
		return "lista de Empregados = " + getListaEmpregado();
	}


	@Override
	public Double total(double valor) {
		
		return valor;
	}

	
}
