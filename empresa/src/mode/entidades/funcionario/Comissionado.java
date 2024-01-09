package mode.entidades.funcionario;

public class Comissionado extends Empregado{

	public Comissionado(String nome, String CPF) {
		super(nome, CPF);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double total(double valor) {
		
		return super.total(valor)*0.06;
	}

}
