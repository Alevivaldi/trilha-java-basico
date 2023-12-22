package model.entites.pj;

import model.entites.Cliente;

public class ClientePJ extends Cliente {
	
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	

	public ClientePJ(String nome, String cNPJ) {
		super(nome);
		CNPJ = cNPJ;
	}
	

}
