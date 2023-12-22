package model.entites;

public abstract class Conta implements InterfaceConta {
	private static final Integer  agencia_padrao = 1;
	private static int  SEQUENCIAl = 1;
	
	private Integer numero;
	private Integer agencia;
	private Double saldo = 0.0;
	private Cliente cliente;
	
	
	public Conta() {
		
		this.agencia = agencia_padrao;
		this.numero = SEQUENCIAl++;
		
	}
	
	
	public Integer getNumero() {
		return numero;
	}


	public Integer getAgencia() {
		return agencia;
	}


	public Double getSaldo() {
		return saldo;
	}


	@Override
	public void verificarSaldo() {
		System.out.print(getSaldo());
		
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public void saque(double valor) {
		if ((saldo > 0) && ( valor <= saldo)) {
			saldo-=valor;
		}
		else {
			System.out.println("Erro ao Solicitar Saque, valor indisponivel, consultar saldo");
		}
	}

	@Override
	public void tranferencia(double valor, Conta contaDestino) {
		if ((saldo > 0) && ( valor <= saldo)) {
		this.saque(valor);
		contaDestino.deposito(valor);;
		}
		else {
			System.out.println("Erro ao transferir, valor indisponivel, consultar saldo");
		}
	}

	@Override
	public void deposito(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void emprestimo(double valor) {
		this.deposito(valor - (valor*0.01));
		
	}

}
