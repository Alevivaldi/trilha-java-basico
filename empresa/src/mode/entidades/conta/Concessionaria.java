package mode.entidades.conta;

import java.util.Date;

public class Concessionaria extends Conta
{

	

	public Concessionaria(Date dataPagamento, Date dataVencimento, Double valor) {
		super(dataPagamento, dataVencimento, valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double total(double valor) {
		// TODO Auto-generated method stub
		return valor;
	}
	
}
