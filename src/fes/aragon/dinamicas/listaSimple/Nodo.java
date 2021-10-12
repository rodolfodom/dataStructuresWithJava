package fes.aragon.dinamicas.listaSimple;

public class Nodo<E> {
	private E dato;
	private Nodo<E> siguiente;
	
	
	public Nodo(E dato) {
		// TODO Auto-generated constructor stub
		this.dato = dato;
	}
	
	
	
	public E getDato() {
		return dato;
	}
	public void setDato(E dato) {
		this.dato = dato;
	}
	public Nodo<E> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}



	@Override
	public String toString() {
		return "Nodo [dato=" + dato +"]";
	}



	
	
	
	
	
}
