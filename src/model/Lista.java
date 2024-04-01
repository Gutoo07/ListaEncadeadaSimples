package model;
import model.No;

public class Lista<T> {
	private No<T> inicio = null;
	
	public void append(T elemento) {
		No<T> buffer = new.No<T>(elemento);
		if (this.inicio == null) {
			this.inicio = buffer;
		} else {
			this.last().setProximo(buffer);
		}
	}
}
