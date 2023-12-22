package model.entites;

public interface InterfaceConta {
	void verificarSaldo();
	void saque(double valor);
	void tranferencia(double valor, Conta contaDestino);
	void deposito(double valor);
	void emprestimo(double valor);
	
}
