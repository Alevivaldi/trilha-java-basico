package mode.entidades.funcionario;

public class Terceirizado extends Empregado{

	public Terceirizado(String nome, String CPF) {
		super(nome, CPF);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double total(double valor) {
				
		return controle.getSalarioHora()*super.total(valor);
	}

}
