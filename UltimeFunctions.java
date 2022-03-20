import java.util.Scanner;

/*
 * @authors Orlay.molina, Yarley.mejia
 * 
 */

public class UltimeFunctions {

	Scanner leerDato = new Scanner(System.in);
	String a, b, c, d, e, f, g, h, i; // creacion de variables

	public void archivoFunciones() {
		a = b = c = d = e = f = g = h = i = "";
	}

	/*
	 *	Mostrar Menu 
	 * 
	 *  Muestra el menu del juego TRIKI al usuario
	 * 
	 */
	
	
	public void mostrarMenu() {
		System.out.println("\n        ------- Juego de TRIKI ------");
		System.out.println("\n                Instrucciones.\n");
		System.out.println(
				"Para realizar la jugada seleccione el numero " 
				+ "\ncorrespondiente a la posición que desea ocupar.");
		System.out.println("\n                -------------");
		System.out.println("                | 1 | 2 | 3 | ");
		System.out.println("                -------------");
		System.out.println("                | 4 | 5 | 6 | ");
		System.out.println("                -------------");
		System.out.println("                | 7 | 8 | 9 | ");
		System.out.println("                -------------\n");

	}
	
	/*
	 * Elegir Caracter
	 * 
	 * Le da la opcion a los jugadores que definan los caracteres con los cuales 
	 * se identificaran en el juego.
	 */

	public boolean elegirCaracter() {
		int valor = 0;
		boolean bandera = false;
		System.out.println(
				"Para iniciar el juego de TRIKI debe elegir un" + "\ncaracter para marcar el tablero, de lo contrario"
						+ "\njugara con los caracteres predefinidos de X y O.");
		System.out.print("\n¿Desea cambiar los caracteres predefinidos?");
		System.out.print("\ningrese 1 para Sí y 2 para No: ");
		valor = leerDato.nextInt();
		if (valor == 1) {
			bandera = true;
		} else if (valor == 2){
			bandera = false;
		} else {
			System.out.print("Opción invalida. El juego inciara con los caracteres predefinidos. \n");
		}
		return bandera;

	}
	
	/*
	 * Validar Jugada
	 * 
	 * Recibe la posicion digitada por el usuario y verifica
	 * si estan ocupadas en el tablero de TRIKI 
	 * 
	 */

	public boolean validarJugada(int posicion) {
		if (posicion >= 1 && posicion <= 9) {
			switch (posicion) {
			case 1:
				if (a.isEmpty())
					return true;
				break;
			case 2:
				if (b.isEmpty())
					return true;
				break;
			case 3:
				if (c.isEmpty())
					return true;
				break;
			case 4:
				if (d.isEmpty())
					return true;
				break;
			case 5:
				if (e.isEmpty())
					return true;
				break;
			case 6:
				if (f.isEmpty())
					return true;
				break;
			case 7:
				if (g.isEmpty())
					return true;
				break;
			case 8:
				if (h.isEmpty())
					return true;
				break;
			case 9:
				if (i.isEmpty())
					return true;
				break;
			}
			return false;
		}
		return false;
	}
	
	/*
	 * Inicio
	 * 
	 * Muestra el tablero antes de iniciar el juego.
	 * 
	 */

	public void inicio() {
		System.out.println("\n            El juego empieza así: ");
		dibujarTablero();
	}
	
	/*
	 * Realizar Jugada
	 * 
	 * Recibe los caracteres que identifican al jugador 1 y jugador 2,
	 * se definen el turno de cada jugador para fijar el caracter
	 * correspondiente en el tablero y llama las funciones
	 * para determinar el jugador que ha ganado el TRIKI
	 * 
	 */

	public void realizarJugada(String jugador1, String jugador2) {
		int posicion = 0;
		boolean jugadaValida;
		int contador = 1;

		do {

			System.out.print("\nSeleccione la posición para el movimiento " + contador + ": ");
			posicion = leerDato.nextInt();
			jugadaValida = validarJugada(posicion);

			if (contador == 1 || contador == 3 || contador == 5 || contador == 7 || contador == 9) {
				if (contador == 1) {
					switch (posicion) {
					case 1:
						a = jugador1;
						break;
					case 2:
						b = jugador1;
						break;
					case 3:
						c = jugador1;
						break;
					case 4:
						d = jugador1;
						break;
					case 5:
						e = jugador1;
						break;
					case 6:
						f = jugador1;
						break;
					case 7:
						g = jugador1;
						break;
					case 8:
						h = jugador1;
						break;
					case 9:
						i = jugador1;
						break;
					}

				} else if (contador == 3) {
					switch (posicion) {
					case 1:
						a = jugador1;
						break;
					case 2:
						b = jugador1;
						break;
					case 3:
						c = jugador1;
						break;
					case 4:
						d = jugador1;
						break;
					case 5:
						e = jugador1;
						break;
					case 6:
						f = jugador1;
						break;
					case 7:
						g = jugador1;
						break;
					case 8:
						h = jugador1;
						break;
					case 9:
						i = jugador1;
						break;
					}

				} else if (contador == 5) {
					switch (posicion) {
					case 1:
						a = jugador1;
						break;
					case 2:
						b = jugador1;
						break;
					case 3:
						c = jugador1;
						break;
					case 4:
						d = jugador1;
						break;
					case 5:
						e = jugador1;
						break;
					case 6:
						f = jugador1;
						break;
					case 7:
						g = jugador1;
						break;
					case 8:
						h = jugador1;
						break;
					case 9:
						i = jugador1;
						break;
					}

				} else if (contador == 7) {
					switch (posicion) {
					case 1:
						a = jugador1;
						break;
					case 2:
						b = jugador1;
						break;
					case 3:
						c = jugador1;
						break;
					case 4:
						d = jugador1;
						break;
					case 5:
						e = jugador1;
						break;
					case 6:
						f = jugador1;
						break;
					case 7:
						g = jugador1;
						break;
					case 8:
						h = jugador1;
						break;
					case 9:
						i = jugador1;
						break;
					}

				} else if (contador == 9) {
					switch (posicion) {
					case 1:
						a = jugador1;
						break;
					case 2:
						b = jugador1;
						break;
					case 3:
						c = jugador1;
						break;
					case 4:
						d = jugador1;
						break;
					case 5:
						e = jugador1;
						break;
					case 6:
						f = jugador1;
						break;
					case 7:
						g = jugador1;
						break;
					case 8:
						h = jugador1;
						break;
					case 9:
						i = jugador1;
						break;
					}

				} else {
					System.out.print(" ");
				}

			}

			if (contador == 2 || contador == 4 || contador == 6 || contador == 8) {
				if (contador == 2) {
					switch (posicion) {
					case 1:
						a = jugador2;
						break;
					case 2:
						b = jugador2;
						break;
					case 3:
						c = jugador2;
						break;
					case 4:
						d = jugador2;
						break;
					case 5:
						e = jugador2;
						break;
					case 6:
						f = jugador2;
						break;
					case 7:
						g = jugador2;
						break;
					case 8:
						h = jugador2;
						break;
					case 9:
						i = jugador2;
						break;
					}

				} else if (contador == 4) {
					switch (posicion) {
					case 1:
						a = jugador2;
						break;
					case 2:
						b = jugador2;
						break;
					case 3:
						c = jugador2;
						break;
					case 4:
						d = jugador2;
						break;
					case 5:
						e = jugador2;
						break;
					case 6:
						f = jugador2;
						break;
					case 7:
						g = jugador2;
						break;
					case 8:
						h = jugador2;
						break;
					case 9:
						i = jugador2;
						break;
					}

				} else if (contador == 6) {
					switch (posicion) {
					case 1:
						a = jugador2;
						break;
					case 2:
						b = jugador2;
						break;
					case 3:
						c = jugador2;
						break;
					case 4:
						d = jugador2;
						break;
					case 5:
						e = jugador2;
						break;
					case 6:
						f = jugador2;
						break;
					case 7:
						g = jugador2;
						break;
					case 8:
						h = jugador2;
						break;
					case 9:
						i = jugador2;
						break;
					}

				} else if (contador == 8) {
					switch (posicion) {
					case 1:
						a = jugador2;
						break;
					case 2:
						b = jugador2;
						break;
					case 3:
						c = jugador2;
						break;
					case 4:
						d = jugador2;
						break;
					case 5:
						e = jugador2;
						break;
					case 6:
						f = jugador2;
						break;
					case 7:
						g = jugador2;
						break;
					case 8:
						h = jugador2;
						break;
					case 9:
						i = jugador2;
						break;
					}

				} else {
					System.out.print(" ");
				}

			}

			dibujarTablero();
			contador++;
			
			if (coincidenciaLinea1(jugador1, jugador2) == true || coincidenciaColumna1(jugador1, jugador2) == true 
					|| coincidenciaDiagonales1(jugador1, jugador2) == true) {
				System.out.print("        Jugador 1 GANÓ el juego!!!\n");
			} else if (coincidenciaLinea2(jugador1, jugador2) == true || coincidenciaColumna2(jugador1, jugador2) == true 
					|| coincidenciaDiagonales2(jugador1, jugador2) == true) {
				System.out.print("        Jugador 2 GANÓ el juego!!!\n");
			} else if(hayGanador1(jugador1, jugador2) == false && hayGanador2(jugador1, jugador2)) { 
				System.out.print("        JUEGO TERMINA EN EMPATE!!!\n");
			} else {
				System.out.print("");
			}
			
			if (jugadaValida == false) {
				System.out.println("\nposicion es incorrecta el juego se iniciará nuevamente.");
			}

		} while (jugadaValida == true && hayGanador1(jugador1, jugador2) != true && hayGanador2(jugador1, jugador2) != true && contador <= 9);

	}
	
	/*
	 * Funciones de coincidencia
	 * 
	 * Se valida las posiciones en linea, columnas y diagonales tanto
	 * para jugador 1 como jugador 2
	 * 
	 */

	public boolean coincidenciaLinea1(String jugador1, String jugador2) {
		if (a == jugador1 && b == jugador1 && c == jugador1 || d == jugador1 && e == jugador1 && f == jugador1
				|| g == jugador1 && h == jugador1 && i == jugador1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean coincidenciaColumna1(String jugador1, String jugador2) {
		if (a == jugador1 && d == jugador1 && g == jugador1 || b == jugador1 && e == jugador1 && h == jugador1
				|| c == jugador1 && f == jugador1 && i == jugador1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean coincidenciaDiagonales1(String jugador1, String jugador2) {
		if (a == jugador1 && e == jugador1 && i == jugador1 || c == jugador1 && e == jugador1 && g == jugador1) {
			return true;
		} else {
			return false;
		}

	}

	public boolean hayGanador1(String jugador1, String jugador2) {
		if (coincidenciaLinea1(jugador1, jugador2))
			return true;
		if (coincidenciaColumna1(jugador1, jugador2))
			return true;
		if (coincidenciaDiagonales1(jugador1, jugador2))
			return true;
		return false;
	}

	public boolean coincidenciaLinea2(String jugador1, String jugador2) {
		if (a == jugador2 && b == jugador2 && c == jugador2 || d == jugador2 && e == jugador2 && f == jugador2
				|| g == jugador2 && h == jugador2 && i == jugador2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean coincidenciaColumna2(String jugador1, String jugador2) {
		if (a == jugador2 && d == jugador2 && g == jugador2 || b == jugador2 && e == jugador2 && h == jugador2
				|| c == jugador2 && f == jugador2 && i == jugador2) {
			return true;
		} else {
			return false;
		}
	}

	public boolean coincidenciaDiagonales2(String jugador1, String jugador2) {
		if (a == jugador2 && e == jugador2 && i == jugador2 || c == jugador2 && e == jugador2 && g == jugador2) {
			return true;
		} else {
			return false;
		}

	}

	public boolean hayGanador2(String jugador1, String jugador2) {
		if (coincidenciaLinea2(jugador1, jugador2))
			return true;
		if (coincidenciaColumna2(jugador1, jugador2))
			return true;
		if (coincidenciaDiagonales2(jugador1, jugador2))
			return true;
		return false;
	}
	
	/*
	 * Dibujar Tablero
	 * 
	 * Muestra tras cada movimiento realizado el estado actual del TRIKI
	 * 
	 */

	public void dibujarTablero() {
		System.out.println("\n               -----TRIKI-----\n");
		System.out.println("                -------------");
		System.out.println("                | " + a + " | " + b + " | " + c + " | ");
		System.out.println("                -------------");
		System.out.println("                | " + d + " | " + e + " | " + f + " | ");
		System.out.println("                -------------");
		System.out.println("                | " + g + " | " + h + " | " + i + " | ");
		System.out.println("                -------------\n");

	}

}
