import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SistemaBancario sistema = new SistemaBancario();

        System.out.println("Digite seu nome ");
        sistema.setNomeCliente(sc.nextLine());

        System.out.println("Por favor, digite o número da Agência !");
        sistema.setAgencia(sc.nextLine());

        System.out.println("Por favor, digite o número da conta !");
        sistema.setNumero(sc.nextInt());

        System.out.println("Digite o valor Desejado para Deposito ");
        sistema.setSaldo(sc.nextDouble());
                       
        System.out.println("Olá "+sistema.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+
        sistema.getAgencia()+", conta "+sistema.getNumero()+" e seu saldo "+sistema.getSaldo()+" já está disponível para saque.");
        
        sc.close();
    }
}
