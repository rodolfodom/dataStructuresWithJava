package fes.aragon.dinamicas.listaDoble;


import fes.aragon.excep.IndiceFueraDeRango;

public class ListaDoble<E> {
	NodoDoble<E> cabeza, cola;
	int longitud;

	

	public ListaDoble() {
		this.longitud = 0;
	}
	
	

	public NodoDoble<E> getCabeza() {
		return cabeza;
	}



	public void setCabeza(NodoDoble<E> cabeza) {
		this.cabeza = cabeza;
	}



	public NodoDoble<E> getCola() {
		return cola;
	}



	public void setCola(NodoDoble<E> cola) {
		this.cola = cola;
	}



	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}



	/**
	 * Método que retorna la cantidad de elementos que contiene la lista
	 * 
	 * @return Cantidad de elementos que contiene la lista
	 */

	public int getLongitud() {
		return longitud;
	}

	/**
	 * Método que retorna un valor verdadero si la lista no contiene elementos, en
	 * caso contrario retorna falso
	 * 
	 * @return true si la lista no contiene elementos; false si la lista contiene al
	 *         menos un elemento
	 */

	public boolean esVacía() {
		if (cabeza == null) {
			return true;
		}
		return false;
	}

	/**
	 * Inserta un valor al inicio de la lista
	 * 
	 * @param dato valor que se desea insertar
	 */

	public void agregarEnCabeza(E dato) {
		NodoDoble<E> nuevoNodo = new NodoDoble<>(dato);
		if (cabeza == null) {
			cabeza = cola = nuevoNodo;
		} else {
			nuevoNodo.setSiguiente(cabeza);
			cabeza = nuevoNodo;
		}
		longitud++;
	}

	/**
	 * Método que inserta un elemento al final de la lista
	 * 
	 * @param dato
	 */

	public void agregarEnCola(E dato) {
		NodoDoble<E> nuevoNodo = new NodoDoble<>(dato);
		if (cabeza == null) {
			cabeza = cola = nuevoNodo;
		} else {
			cola.setSiguiente(nuevoNodo);
			nuevoNodo.setAnterior(cola);
			cola = nuevoNodo;
		}
		longitud++;
	}

	/**
	 * Método que elimina el primer valor de la lista
	 */

	public void eliminarEnCabeza() {
		if (cabeza != null) {
			NodoDoble<E> siguiente = cabeza.getSiguiente();
			siguiente.setAnterior(null);
			cabeza = siguiente;
			longitud--;
		}
	}

	/**
	 * Método que elimina el último valor de la lista
	 */

	public void eliminarEnCola() {
		if (cabeza != null) {
			NodoDoble<E> anterior = cola.getAnterior();
			anterior.setSiguiente(null);
			cola = anterior;
		}
	}

	/**
	 * Método que imprime todos los elementos de la lista
	 */

	public void imprimirElementos() {
		for (NodoDoble<E> el = cabeza; el != null; el = el.getSiguiente()) {
			System.out.println(el.getDato());
		}
	}

	/**
	 * Método que retorna el nodo que se encuentra en una pocisión dada
	 * 
	 * @param i Índice del nodo que se desea recuperar
	 * @return Retorna el nodo en la posición i
	 * @throws IndiceFueraDeRango Excepción que se activa cuando el parametro i
	 *                            excede la cantidad de elementos en la lista
	 */

	public NodoDoble<E> obtenerNodo(int i) throws IndiceFueraDeRango {
		if (i < 0 | i >= longitud) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		} else {
			NodoDoble<E> val = cabeza;
			for (int j = 0; j < i; val = val.getSiguiente(), j++);
			return val;
		}

	}

	/**
	 * Método que busca un valor dentro de la lista
	 * 
	 * @param x Valor que se desea buscar
	 * @return Si el valor se encuentra en la lista retorna el índice en el que se
	 *         encuentra, de lo contrario retorna -1
	 */

	public int estaEnLista(E x) {
		int contador = 0;
		for (NodoDoble<E> nodo = cabeza; nodo != null; nodo = nodo.getSiguiente(), contador++) {
			if (nodo.getDato() == x) {
				return contador;
			}
		}

		return -1;
	}

	/**
	 * Método que elimina el elemento en un índice dado.
	 * 
	 * @param i índice del elemento que se desea eliminar.
	 * @return retorna true si elimina el elemento, de lo contrario retorna false.
	 */

	public boolean eliminarEnIndice(int i) {
		if (i < 0 | i >= longitud) {
			return false;
		} else if (i == 0) {
			this.eliminarEnCabeza();

		} else if (i == longitud - 1) {
			this.eliminarEnCola();

		} else {
			NodoDoble<E> nodo = cabeza;
			for (int j = 0; j < i; nodo = nodo.getSiguiente(), j++);
			NodoDoble<E> anterior = nodo.getAnterior();
			NodoDoble<E> siguiente = nodo.getSiguiente();
			anterior.setSiguiente(siguiente);
			siguiente.setAnterior(anterior);
			longitud--;
		}
		return true;

	}

	/**
	 * Método que inserta un elemento en un índice dado.
	 * 
	 * @param dato Dato que se desea insertar.
	 * @param i    Posición en la que se desea insertar el valor.
	 * @throws IndiceFueraDeRango Excepción que es lanzada cuando el índice excede
	 *                            la cantidad de elementos.
	 */

	public void insertarEnIndice(E dato, int i) throws IndiceFueraDeRango {
		if (i < 0 | i >= longitud) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		} else if (i == 0) {
			this.agregarEnCabeza(dato);

		} else {
			NodoDoble<E> nodo = cabeza,
					nuevoNodo = new NodoDoble<>(dato);

			for (int j = 0; j < i; nodo = nodo.getSiguiente(), j++);
			NodoDoble<E> anterior = nodo.getAnterior(); 
			nuevoNodo.setAnterior(anterior);
			nuevoNodo.setSiguiente(nodo);
			longitud++;
		}
	}

	/**
	 * Método que cambia el valor en una posición dada de la lista.
	 * 
	 * @param dato Dato que se desea establecer.
	 * @param i    posición en la que se cambiará el dato.
	 * @throws IndiceFueraDeRango Excepción que es lanzada cuando el índice excede
	 *                            la cantidad de elementos.
	 */

	public void asignar(E dato, int i) throws IndiceFueraDeRango {
		if (i < 0 | i >= longitud) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		NodoDoble<E> nodo = cabeza;
		for (int j = 0; j < i; nodo = nodo.getSiguiente(), j++)
			;
		nodo.setDato(dato);
	}

	/**
	 * Método que cambia los valores que coincidan con el dato dado por un nuevo
	 * dato
	 * 
	 * @param dato       Dato que contienen los elementos que se desean modificar
	 * @param nuevo_dato Dato que se establecerá
	 * @param multiple   true si se desea cambiar todos los elementos que coincidan
	 *                   o false para cambiar solo la primera coincidencia.
	 */

	public void asignar(E dato, E nuevo_dato, boolean multiple) {
		for (NodoDoble<E> nodo = cabeza; nodo != null; nodo = nodo.getSiguiente()) {
			if (nodo.getDato() == dato) {
				nodo.setDato(nuevo_dato);
				if (!multiple) {
					break;
				}
			}
		}
	}
}
