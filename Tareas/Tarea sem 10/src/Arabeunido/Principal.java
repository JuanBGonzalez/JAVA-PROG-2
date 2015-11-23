package Arabeunido;
/* 
 * Usted fue contratado por el Deportivo �rabe Unido para que desarrolle la primera fase de un proyecto en Java donde se simule todas las  
 *  actividades a ejecutarse antes, durante y luego de un partido de f�tbol. 

Este proyecto constar� del paquete arabeunido, que est� conformado por una interfaz (Integrante), una clase abstracta (Equipo) y 
tres clases concretas (Jugador, Entrenador, Masajista):
* Todo futbolista, entrenador y masajista conforman un equipo, y �ste a su vez se asocian a un integrante.
* Todo integrante debe concentrarse, viajar, entrenar y jugar partidos. 
* Todo equipo est� formado por una identificaci�n, su nombre, sus apellidos y la edad.
* El jugador maneja una dorsal y una posici�n; adem�s, debe responder a entrevistas.
* El entrenador tiene una identifaci�n �nica ante la federaci�n y puede planificar una jugada. 
* El masajista maneja a�os de experiencia y dar� masajes cuando sea necesario; adem�s, puede tener o no una credencial.

Para validar que el diagrama de clases para este proyecto est� bien dise�ado, el punto de contacto en el Deportivo �rabe Unido le 
solicita simular lo siguiente en la clase Principal:
* Haga que el equipo tenga 15 jugadores, 1 entrenador y 2 masajistas. Puede inventar los datos personales.
* Antes del partido: el entrenador planifica jugadas para entrenar, los jugadores entrenan, el masajista da un masaje sobre 3 jugadores, 
* todos se concentran en el partido.
* Durante el partido: juegan 11 jugadores, el entrenador planifica jugadas.
* La probabilidad de meter goles es de un 10%. Usted debe inventar la regla para generar dicha probabilidad. Le recomiendo usar la clase Random.
* La probabilidad de que le metan un gol al portero es de 5%. Usted debe inventar la regla para generar dicha probabilidad. Le recomiendo usar
la clase Random.
* Luego del partido: dar�n entrevista los jugadores que metieron el gol, al portero y al entrenador; los masajistas dar�n masajes a todos los jugadores.
* Si el equipo perdi�, el portero dar� comentarios negativos. De lo contrario, el portero dar� comentarios positivos.
* Los masajistas con mayor experiencia y con credencial atender�n m�s jugadores que los que no tienen credencial.

 */

/**
 * 
 *
 */

import java.util.Random;
public class Principal{
	private int f, g;
public Principal(){
	Jugador j = new Jugador();
	Entrenador c = new Entrenador();
	Masajista m = new Masajista();
	c.Planificar();
	for(int n=0 ; n<3 ; n++){
	m.masajear();
	   }
	j.concentrarse();
	j.jugarpartidos();
	System.out.println("\n\nSucesos del partido");
	Random r = new Random();
	for(int n=0; n<4; n++){
	int randomInt = r.nextInt(100);
	if(randomInt < 10){
		 g++;
		System.out.println("\nGOL "+g+" - "+f);
	}
	else if (randomInt < 5 );{
	     f++;
	    System.out.println("\nNos metieron gol "+g+" - "+f);  
	}
	}
	j.Entrevistas();
	if(g>f){
	    j.BuenaOP();
	    m.masajear();
	}
	else{
		j.MalaOP();
		m.masajear();
	}
	}

		
	public static void main (String[] args) {
         Principal p = new Principal();
	}
}