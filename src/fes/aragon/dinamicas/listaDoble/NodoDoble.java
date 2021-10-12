package fes.aragon.dinamicas.listaDoble;

public class NodoDoble<E> {
	private E dato;
	private NodoDoble<E> siguiente, anterior;
	
	public NodoDoble(E dato) {
		this.dato = dato;
	}

	public E getDato() {
		return dato;
	}

	public void setDato(E dato) {
		this.dato = dato;
	}

	public NodoDoble<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<E> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<E> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<E> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return "NodoDoble [dato=" + dato + "]";
	}
	
	
	
	

}
