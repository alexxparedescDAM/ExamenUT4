/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;

/**
 * 
 * @author Alejandro Paredes Carmona
 *
 */
public class CCuenta {

	/**
	 * Atributos
	 */

	// Estos atributos para encapslar se acceden a ellos de forma privada(por la
	// propia clase) y ya tienen crados los getters y los setters.
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	/**
	 * Constructores
	 */
	public CCuenta() {

	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	public void asignarNombre(String nom) {
		setNombre(nom);
	}

	public String obtenerNombre() {
		return getNombre();
	}

	public double estado() {
		return saldo;
	}

	/**
	 * @param cantidad
	 * @throws Exception
	 *             Metodos
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}

	public void operativa_cuenta(double cantidad) throws Exception {
		String nombre;
		String cuenta;
		int saldo;
		//Nuevo parametro
		float cantidad1;
	}

	/**
	 * 
	 * Getters y Setters
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
