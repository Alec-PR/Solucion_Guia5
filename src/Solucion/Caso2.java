package Solucion;

import Solucion.model.Calculadora2;
import java.util.*;

public class Caso2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		float n1=0, n2=0;
		
		System.out.println("LECTURA DE NÚMEROS");
		System.out.println("------------------");
		System.out.print("Número 1: ");
		n1 =sc.nextFloat();
		System.out.print("Número 2: ");
		n2 =sc.nextFloat();
		
		Calculadora2 objCalc = new Calculadora2(n1, n2);
		
		System.out.println("\n R E S U L T A D O S");
		System.out.println("----------------------");
		System.out.println("1.- Suma.................: " + objCalc.Calcular(1));
		System.out.println("2.- Resta................: " + objCalc.Calcular(2));
		System.out.println("3.- Producto.............: " + objCalc.Calcular(3));
		System.out.println("4.- División.............: " + objCalc.Calcular(4));
		System.out.println("5.- Resto entero.........: " + objCalc.Calcular(5));
		System.out.println("6.- Promedio.............: " + objCalc.Calcular(6));
		System.out.println("7.- Suma de cuadrados....: " + objCalc.Calcular(7));
		System.out.println("8.- Diferencia porcentual: " + objCalc.Calcular(8));
	}
}
