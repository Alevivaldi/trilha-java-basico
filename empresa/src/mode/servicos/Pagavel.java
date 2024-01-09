package mode.servicos;

import mode.entidades.ControlePagamento;

public interface Pagavel {
	ControlePagamento controle = new ControlePagamento();
	  Double total(double valor);
	  
}
