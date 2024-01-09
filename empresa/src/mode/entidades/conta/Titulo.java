package mode.entidades.conta;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Titulo extends Conta {
	public Titulo(Date dataPagamento, Date dataVencimento, Double valor) {
		super(dataPagamento, dataVencimento, valor);
		// TODO Auto-generated constructor stub
	}



	SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");



	@Override
	public Double total(double valor) {
		if(getDataPagamento().compareTo(getDataVencimento()) <=0)    {
			return valor;
		}else {
			return valor+ valor*0.1;
		}


	}
}
