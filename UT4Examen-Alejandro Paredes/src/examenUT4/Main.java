/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package examenUT4;

public class Main {
/**
 * @author Alejandro Paredes Carmona
 * Metodo main: Ejecuta la aplicacion
 * @param args
 */
	public static void main(String[] args) {
		// Boton derecho>miCuenta>refactor>rename y ponemos otro nombre y
		// pulsamos INTRO.
		CCuenta cuenta1;
		double saldoActual;

		cuenta1 = new CCuenta("Antonio Lopez", "1000-2365-85-1230456789", 2500,
				0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuenta1.retirar(2300);
			// modificado
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

	// Boton derecho seleccionando todo el metodo; en este caso he seleccionado
	// todo el main, y despues refactor,introduce indireccion, y se le da un nombre.
	public static void MetodoMain(String[] args) {
		Main.main(args);
	}
}
