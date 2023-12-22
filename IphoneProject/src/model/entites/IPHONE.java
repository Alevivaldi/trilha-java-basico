package model.entites;

import model.app.midia.ReprodutorMusical;
import model.app.navegador.NavegadorInternet;
import model.app.telefone.AparelhoTelefonico;

public class IPHONE {
	private Integer numero;
	private String nome;
	private ReprodutorMusical reprodutor;
	private AparelhoTelefonico telefone;
	private NavegadorInternet navegador;
	
	public IPHONE() {
		
	}
	public IPHONE(Integer numero, String nome, ReprodutorMusical reprodutor, AparelhoTelefonico telefone,NavegadorInternet navegador) {


		this.numero = numero;
		this.nome = nome;
		this.reprodutor = reprodutor;
		this.telefone = telefone;
		this.navegador = navegador;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ReprodutorMusical getReprodutor() {
		return reprodutor;
	}

	public void setReprodutor(ReprodutorMusical reprodutor) {
		this.reprodutor = reprodutor;
	}

	public AparelhoTelefonico getTelefone() {
		return telefone;
	}

	public void setTelefone(AparelhoTelefonico telefone) {
		this.telefone = telefone;
	}

	public NavegadorInternet getNavegador() {
		return navegador;
	}

	public void setNavegador(NavegadorInternet navegador) {
		this.navegador = navegador;
	}
	
	
}
