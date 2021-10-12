package fes.aragon.test;

import fes.aragon.dinamicas.listaSimple.ListaSimple;
import fes.aragon.excep.IndiceFueraDeRango;

public class listaSimpleTest {

	public static void main(String[] args) throws IndiceFueraDeRango {
		ListaSimple<Integer> list1 = new ListaSimple<>();
		list1.agregarEnCola(5);
		list1.agregarEnCola(4);
		list1.agregarEnCola(3);
		list1.agregarEnCola(2);
		list1.agregarEnCola(3);
		list1.asignar(3, 0, true);
		list1.imprimirElementos();
		
		
	}

}
