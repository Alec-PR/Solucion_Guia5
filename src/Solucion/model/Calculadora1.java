package Solucion.model;

public class Calculadora1 {
	
	// Atributos
	private float numero1;
	private float numero2;
	// Definir métodos Getters y Setters
	// Get: Obtener el valor del atributo
	// Set: Definir el valor para el atributo
	public float getNumero1() {
		return this.numero1;
	}
	
	public void setNumero1(float num1) {
		this.numero1=num1;
	}
	
	public float getNumero2() {
		return this.numero2;
	}
	
	public void setNumero2(float num2) {
		this.numero2=num2;
	}
	
	public Calculadora1() {
		
	}
	
	public Calculadora1(float num1, float num2) {
		this.numero1 = num1;
		this.numero2 = num2;
	}
	
	public float Suma() {
		return this.numero1 + this.numero2;
	}
	
	public float Resta() {
		return this.numero1 - this.numero2;
	}
	
	public float Producto() {
		return this.numero1 * this.numero2;
	}
	
	public float Division() {
		return this.numero1 / this.numero2;
	}
	
	public float Resto_Entero() {
		return this.numero1 % this.numero2;
	}
	
}
