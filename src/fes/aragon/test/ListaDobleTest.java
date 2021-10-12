package fes.aragon.test;

import fes.aragon.dinamicas.listaDoble.ListaDoble;

import fes.aragon.excep.IndiceFueraDeRango;

public class ListaDobleTest {

	public static void main(String[] args) throws IndiceFueraDeRango {
		ListaDoble<Integer> l = new ListaDoble<>();
		l.agregarEnCabeza(5);
		l.agregarEnCabeza(4);
		l.agregarEnCabeza(5);
		l.agregarEnCabeza(2);
		l.agregarEnCabeza(1);
		l.agregarEnCola(6);
		l.agregarEnCola(7);
		
		l.asignar(5, 0, true);
		l.imprimirElementos();
		
	

	}

}
