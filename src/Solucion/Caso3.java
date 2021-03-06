package Solucion;

import Solucion.model.Alumno;
import java.util.*;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Forma 1
		Alumno objAl1 = new Alumno();
		objAl1.setNombre("Joe");
		objAl1.setApellido("Castillo");
		objAl1.setGenero("M");
		objAl1.setEdad(25);
		
		//Forma 2
		
		Alumno objAl2 = new Alumno("Rosa", "Flores", "F", 17 );
		
		//Forma 3
		Alumno objAl3= null;
		
		String nom = "", ape = "", gen = "";
		int ed=0;
		
		System.out.println("REGISTRO DE DATOS");
		System.out.println("-----------------");
		System.out.print("Nombre.........: ");
		nom = sc.nextLine();
		System.out.print("Apellido.......: ");
		ape = sc.nextLine();
		System.out.print("Genero..[M|F]..: ");
		gen = sc.nextLine();
		System.out.print("Edad..[14-60]..: ");
		ed = sc.nextInt();
		
		objAl3 = new Alumno(nom, ape, gen, ed);
		
		ArrayList<Alumno> arrAlumno = new ArrayList<Alumno>();
		
		arrAlumno.add(objAl1);
		arrAlumno.add(objAl2);
		arrAlumno.add(objAl3);
		
		System.out.println("Datos registrados");
		System.out.println("-----------------");
		
		String patron = "%-4s %-20s %-10s %-15s";
		System.out.println(String.format(patron, "N", "Nombre y Apellidos", "G?nero", "Estado"));
		System.out.println(String.format(patron, "-", "------------------", "------", "------"));
		
		for (int x = 0; x < arrAlumno.size(); x++) {
			System.out.println(String.format(patron, (x+1), arrAlumno.get(x).NombreCompleto(), arrAlumno.get(x).MostrarGenero(), arrAlumno.get(x).MostrarEstado()));
		}

	}

}
