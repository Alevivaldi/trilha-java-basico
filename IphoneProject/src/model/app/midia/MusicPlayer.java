package model.app.midia;

public class MusicPlayer implements ReprodutorMusical {

	@Override
	public void tocar() {
		System.out.println("Tocando Musica");
		
	}

	@Override
	public void pausar() {
		
		System.out.println("Pausando musica");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica");
		
	}

	@Override
	public void parar() {
		System.out.println("Parando Musica");
		
	}

	@Override
	public void repetir() {
		
		System.out.println("Repetindo musica");
	}

	@Override
	public void proxima() {
		System.out.println("Proxima Musica");
		
	}

}
