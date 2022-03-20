import java.util.Scanner;

/**
 * 
 * @authors Orlay.molina, Yarley.mejia
 * @version 1.0
 *
 */

public class MainUltimo {

	/*
	 * Main
	 * 
	 * Integra las funciones del archivo UltimeFunctions
	 * 
	 */
	
	public static void main(String[] args) {
		UltimeFunctions j = new UltimeFunctions();
		Scanner leerDato = new Scanner(System.in);
		String jugador1 = "X";
		String jugador2 = "O";
		j.archivoFunciones();
		j.mostrarMenu();
		if (j.elegirCaracter() == true) {
			System.out.print("\nCaracter para jugador 1: ");
			jugador1 = leerDato.nextLine();
			System.out.print("Caracter para jugador 2: ");
			jugador2 = leerDato.nextLine();
		}
		j.inicio();
		j.realizarJugada(jugador1, jugador2);
		System.out.println("\n      ------- Juego TERMINADO ------");


	}

}
