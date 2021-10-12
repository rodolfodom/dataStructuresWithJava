package fes.aragon.estaticas.arreglo;



import fes.aragon.excep.IndiceFueraDeRango;

public class Arreglo<E> {
	private int indice = 0;
	private final Object[] l;

	public Arreglo(int numeroDeElementos) {
		this.l = new Object[numeroDeElementos];
	}

	/**
	 * Método que retorna la cantidad de valores que contiene un arreglo
	 * @return cantidad de elementos que contiene el arreglo
	 */
	
	public int getLongitud() {
		return l.length;
	}
	
	/**
	 * Método que inserta un valor en la primera posición vacía
	 * @param x valor que se desea insertar
	 * @throws IndiceFueraDeRango Cuando no hay mas lugares vacíos entro del arreglo
	 */

	public void insertar(E x) throws IndiceFueraDeRango{    
		if(indice >= l.length) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		l[indice] = x;
		indice++;
	}

	/**
	 * Método que busca un valor dentro del arreglo, si lo encuentra retornará el índice que ocupa el elemento en el arreglo pero si no retornará -1
	 * 
	 * @param x Valor que se desea buscar
	 * @return Retorna el índice si encuentra el elemento, en caso contrario retorna -1
	 */
	
	
	public int localiza(E x) {                        
		for (int i = 0; i < l.length; i++) {
			if (x == l[i]) {
				return i;
			}
		}
		return -1;
	}


	/**
	 * Método que retorna el valor que se encuentra guardado el la posición p
	 * 
	 * @param p Posición del valor que se desea obtener
	 * @return Retorna el valor que se encuentra guardado en la posición p
	 * @throws IndiceFueraDeRango Si p Es negativa o excede la cantidad de elementos en el arreglo
	 */
	
	public Object recupera(int p) throws IndiceFueraDeRango {                        
		if(p >= l.length | p < 0) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		return l[p];
	}


	/**
	 * Método que reemplaza el valor en la posición p por un null, con el fin de simular la eliminación del elemento
	 * 
	 * @param p Índice del valor que se dea eliminar
	 * @throws IndiceFueraDeRango Si p Es negativa o excede la cantidad de elementos en el arreglo
	 */
	
	public void suprime(int p) throws IndiceFueraDeRango {                            
		if(p >= l.length | p < 0) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		l[p] = null;
	}
	
	
	/**
	 * Método que retorna el valor en la posición siguiente a p
	 * 
	 * @param p Índice de refencia
	 * @return Valor en la posición siguiente a p "p + 1"
	 * @throws IndiceFueraDeRango Si p Es negativa, excede la cantidad de elementos en el arreglo o no hay un valor siguiente a la posición indicada
	 */

	public Object siguiente(int p) throws IndiceFueraDeRango {                   
		if(p >= l.length-1 | p < 0-1) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		return l[p + 1];
	}
	
	/**
	 *  Método que retorna el valor en la posición anterior a p
	 * 
	 * @param p Índice de refencia
	 * @return Valor en la posición anterior a p "p - 1"
	 * @throws IndiceFueraDeRango Si p Es negativa, excede la cantidad de elementos en el arreglo o no hay un valor anterior a la posición indicada
	 */

	public Object anterior(int p) throws IndiceFueraDeRango {                       
		if(p > l.length | p <= 0) {
			throw new IndiceFueraDeRango("Índice fuera de rango");
		}
		return l[p - 1];
	}
	
	/**
	 * Método que vuelve null todos los valores del arreglo
	 */

	public void limpiar() {
		for (int i = 0; i < l.length; i++)
			l[i] = null;
	}
	
	/**
	 * Método que retorna el primer valor del arreglo
	 * 
	 * @return Valor en el Índice 0 del arreglo
	 */
	
	public Object primero() {
		return l[0];
	}

	/**
	 * Método que imprime en consola todos los valores del arreglo
	 */
	
	public void imprimirElementos() {
		for (int i = 0; i < l.length; i++)
			System.out.println(l[i]);

	}

}
