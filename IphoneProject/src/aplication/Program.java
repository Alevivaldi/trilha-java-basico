package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.app.midia.MusicPlayer;
import model.app.navegador.GoogleChorme;
import model.app.telefone.Telefone;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner terminal = new Scanner(System.in);
		
		MusicPlayer player = new MusicPlayer();
		player.tocar();
		player.pausar();
		player.selecionarMusica();
		player.parar();
		player.repetir();
		player.proxima();
		
		GoogleChorme navegador = new GoogleChorme(); 
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.removerAba();
		navegador.atualizarPagina();
	
		Telefone telefone = new Telefone();
		telefone.fazerLigacao(0);
		telefone.atenderLigacao();
		telefone.iniciarCorreioVoz();
		telefone.receberSMS();
		
		
		
		terminal.close();
	}

}
