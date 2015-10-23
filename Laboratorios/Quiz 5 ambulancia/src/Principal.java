/**
 * 
 */

/**
 * @author JuanB
 *
 */

import java.util.Scanner;

public class Principal {
	float Dist, vel,time=0;
	public Principal(){
		System.out.println("Sistema de GPS de la caja de seguro social");
		Keyboard = new Scanner (System.in);
	  	System.out.println("Digite la Distancia que recorrera su vehiculo(Km)");
	  	Dist = Keyboard.nextFloat();
	  	System.out.println("Digite la Velocidad de su vehiculo(Km/hr");
	  	vel = Keyboard.nextFloat();
	  	time = Dist/vel;
	  	System.out.println("\nTiempo estimado de llegada(Horas):"+ time);
	}
	
	private static Scanner Keyboard;
	public static void main(String[] args) {
		String opc="n";
		while(opc!="s"||opc!="S"){
	   Principal op =new Principal();
	  System.out.println("\nDesea termine(s/n)");
	  opc = Keyboard.next(); 
     }
  }
}
