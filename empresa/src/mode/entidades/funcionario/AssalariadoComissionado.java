package mode.entidades.funcionario;

public class AssalariadoComissionado extends Comissionado {

	public AssalariadoComissionado(String nome, String CPF) {
		super(nome, CPF);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double total(double valor) {
		
		return controle.getSalarioBase()+ super.total(valor)*0.06;
	}

}
