package mode.entidades.conta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mode.servicos.Pagavel;

public class Conta implements Pagavel{
	
	private Date dataPagamento;
	private Date dataVencimento;
	private Double valor;
	
	private  List<Conta> listaConta = new ArrayList<>();


	public Conta(Date dataPagamento, Date dataVencimento, Double valor) {
		super();
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}


	public Date getDataPagamento() {
		return dataPagamento;
	}




	public Date getDataVencimento() {
		return dataVencimento;
	}




	public Double getValor() {
		return valor;
	}




	public  List<Conta> getListaConta() {
		return listaConta;
	}


	public void adicionarLista(Conta listas) {
		listaConta.add(listas);
	}
	
	@Override
	public Double total(double valor) {
		return null;
		
	}




	@Override
	public  String toString() {
		return "Lista de Contas \n" + listaConta;
	}





	




	
	
	
}
