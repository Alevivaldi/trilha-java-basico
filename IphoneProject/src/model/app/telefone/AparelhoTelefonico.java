package model.app.telefone;

public interface AparelhoTelefonico {
	void fazerLigacao( int numero);
	void atenderLigacao();
	void iniciarCorreioVoz();
	void receberSMS();
}
