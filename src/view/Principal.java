package view;

import java.io.IOException;

import controller.SteamController;

public class Principal {

	public static void main(String[] args) {

		String path = "E:\\fatec\\3� semestre\\SO\\2605aula\\arquivoExer";
		String nome = "SteamCharts.csv";
		SteamController cont = new SteamController(path, nome);
		try {
			cont.leitor();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

}
