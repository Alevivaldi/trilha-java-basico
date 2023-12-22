package model.app.telefone;

public class Telefone implements AparelhoTelefonico {

	@Override
	public void fazerLigacao(int numero) {
		
		System.out.println("Fazendo Ligação ");
	}

	@Override
	public void atenderLigacao() {
		
		System.out.println("Atendendo Ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		
		System.out.println("Iniciando Correios de Voz");
		
	}

	@Override
	public void receberSMS() {
		
		System.out.println("Recebendo SMS");
		
	}

}
