package controller;
import model.Lista;
import model.No;

public class Metodos {
	public Metodos() {
		super();
	}
	
	public String teste() throws Exception {
		Lista lista = new Lista();
		lista.append(4);
		lista.append(3);
		lista.append(5);
		
		lista.remove(1);
		
		return lista.toString();
	}
}
