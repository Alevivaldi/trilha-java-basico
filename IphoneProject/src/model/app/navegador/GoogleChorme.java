package model.app.navegador;

public class GoogleChorme implements NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo Pagina");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova Aba");
	}

	@Override
	public void removerAba() {
		System.out.println("Removendo aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

}
