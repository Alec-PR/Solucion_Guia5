package Solucion;

import java.util.*;
import Solucion.model.Alumno;
import java.io.*;

public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FileWriter archivo = null;
		PrintWriter pw = null;
		
		try {
			
		} catch(Exception e1) {
			e1.printStackTrace();
		} finally {
			// Cierre del archivo
			try {
				archivo = new FileWriter("info.txt", true);
				pw = new PrintWriter(archivo);
				
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
				
				Alumno objAlumno = new Alumno(nom, ape, gen, ed);
				
				pw.println("-----------------");
				pw.println("Datos registrados");
				pw.println("-----------------");
				pw.println("Nombre y Apellido......: " +objAlumno.NombreCompleto());
				pw.println("Genero.................: " +objAlumno.MostrarGenero());
				
				System.out.println("El archivo fue creado correctamente....");
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
