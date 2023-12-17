package desafioControleFluxo;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws InputMismatchException {
		Locale.setDefault(Locale.US);
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		try {
			int n1 = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int n2 = terminal.nextInt();


			contar(n1,n2);
		}catch(InputMismatchException c) {
			System.out.print("Dados Invalidos ");
		}catch(ParametrosInvalidosException exception){

		}



		terminal.close();

	}
	static void contar( int n1, int n2)throws ParametrosInvalidosException {

		if( n2 > n1) {
			int contador = n2 -n1;
			for( int k = 0 ; k < contador ; k++) {
				System.out.println("imprimir o "+ (k+1)+" numero");

			}			
		}
		else {
			throw new ParametrosInvalidosException();
		}

	}
}
