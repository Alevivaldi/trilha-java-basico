public class SistemaBancario {
    private int numero = 0;
    private String NomeCliente = null;
    private String agencia = null;
    private double saldo = 0.0;
      


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }
}
