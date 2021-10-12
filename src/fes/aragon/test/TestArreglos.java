package fes.aragon.test;

import fes.aragon.estaticas.arreglo.Arreglo;
import fes.aragon.excep.IndiceFueraDeRango;

public class TestArreglos {
	public static void main(String[] args) throws IndiceFueraDeRango {
		
		Arreglo<Integer> arr = new Arreglo<>(5);
		arr.insertar(5);
		arr.insertar(4);
		arr.insertar(3);
		arr.insertar(2);
		arr.insertar(1);
		
		arr.imprimirElementos();
		System.out.println("****************");
		System.out.println(arr.localiza(3));
		System.out.println("****************");
		System.out.println(arr.recupera(3));
		System.out.println("****************");
		arr.imprimirElementos();
		System.out.println("****************");
		System.out.println(arr.siguiente(3));
		System.out.println("****************");
		System.out.println(arr.anterior(5));
	}
}
