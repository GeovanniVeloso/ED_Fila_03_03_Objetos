package view;

import controller.EscalonadorController;
import model.Fila;
import model.Objeto;

public class Principal {

	public static void main(String[] args) {
		
		Fila<Objeto> f = new Fila<Objeto>();
		EscalonadorController ec = new EscalonadorController();
		String[] processos = { "notepad", "word", "chrome", "acrobat", "firefox" };
		Objeto obj3;

		for (int i = 0; i < 5; i++) {
			obj3 = new Objeto(processos[i], (int) (Math.random() * 101));
			f.insert(obj3);
		}

		ec.Escalonador(f);

	}

}
