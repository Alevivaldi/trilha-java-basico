package model.entites.pf;

import java.util.Date;

import model.entites.Cliente;

public class ClientePF extends Cliente {
	private String cpf;
	private Date dataNascimento;
	
	public ClientePF(String nome, String cpf, Date dataNascimento) {
		super(nome);
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	

	public Date getDataNascimento() {
		return dataNascimento;
	}

	@Override
	public String toString() {
		return "\nNome do Cliente  " + getNome()
				+"\nCPF = " + getCpf()
				+ "\nData de Nascimento = " + getDataNascimento() ;
				
	}

	

	

	

}
