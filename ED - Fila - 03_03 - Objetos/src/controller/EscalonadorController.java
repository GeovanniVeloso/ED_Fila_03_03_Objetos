package controller;

import model.Fila;
import model.Objeto;

public class EscalonadorController {

	Objeto obj;
	
	public EscalonadorController() {
		super();
	}
	
	public void Escalonador(Fila<Objeto> fila) {
		int qnd;
		String obj2;
		if(!fila.isEmpty()) {
			while(!fila.isEmpty()) {
				try {
					obj = fila.remove();
				} catch (Exception e) {
					System.err.println(e);
				}
				
				qnd = obj.getQndRetornos();
				if(qnd>1) {
					qnd -= 1;
					obj.setQndRetornos(qnd);
					fila.insert(obj);
					obj2 = obj.getNome();
					System.out.println("O processo "+obj2+".exe foi executado.");
				}else {
					qnd -= 1;
					obj2 = obj.getNome();
					System.out.println("O processo "+obj2+".exe foi executado e eliminado da lista de processos.");
				}
			}
		}
	}

}
