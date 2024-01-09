package mode.entidades.funcionario;

public class Assalariado extends Empregado {

	public Assalariado(String nome, String CPF) {
		super(nome, CPF);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double total(double valor) {
		
		if(valor < 41) {
			return controle.getSalarioBase();
		}
		else {
			return controle.getSalarioBase()+ controle.getSalarioHora()*(valor-40);
		}
	}

}
