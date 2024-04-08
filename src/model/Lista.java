package model;
import model.No;

public class Lista<T> {
	private No<T> inicio = null;
	
	public void append(T elemento) {
		No<T> buffer = new No<T>(elemento);
		if (this.inicio == null) {
			this.inicio = buffer;
		} else {
			this.last().setProximo(buffer);
		}
	}
	public No<T> get (int index) throws IllegalArgumentException {
		int i = 0;
		if (this.inicio == null) {
			throw new IllegalArgumentException("Nao existe item na lista.");
		}
		No<T> buffer = this.inicio;
		for (i = 0; i < index; i++) {
			if (buffer.getProximo() == null) {
				break;
			}
			buffer = buffer.getProximo();
		}
		if (i < index) {
			throw new IllegalArgumentException("O indice informado nao existe.");
		}
		return buffer;
	}
	public int index(T elemento) throws IllegalArgumentException {
		if (this.inicio == null) {
			throw new IllegalArgumentException("Nao existe item na lista.");
		}
		int index = 0;
		if (this.inicio.getValor() == elemento) {
			return index;
		}
		No<T> buffer = this.inicio;
		do {
			if (buffer.getValor() == elemento) {
				return index;
			}
			buffer = buffer.getProximo();
			index++;
		} while (buffer != null);
		throw new IllegalArgumentException("Item nao encontrado.");
	}
	public void insert (int index, T elemento) throws IllegalArgumentException {
		if (index ==0) {
			No<T> buffer_novo = new No<>(elemento);
			if (this.inicio != null) {
				No<T> buffer_inicio = this.inicio;
				buffer_novo.setProximo(buffer_inicio);
				this.inicio = buffer_novo;
			} else {
				this.inicio = buffer_novo;
			}
		} else {
			this.insert( this.get( --index), elemento ); 
		}
	}
}
