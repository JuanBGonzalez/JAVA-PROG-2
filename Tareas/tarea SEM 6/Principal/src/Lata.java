/*2. Crear una clase llamada Lata que maneje como atributos la altura y el diámetro, y como métodos calcular el volumen y calcular la superficie de la lata.


 
La fórmula para calcular el volumen es: PI * radio * radio * altura. La fórmula para calcular la superficie es:
 (2 * PI) * (radio * radio) + (2 * PI) * (radio * altura).
 El constructor debe inicializar los atributos a 4.8 y 2.5, respectivamente. Los valores para los objetos de tipo Lata deben ser obtenidos por teclado.
 Lo que debe hacer el programa es calcular el volumen y superficie para 3 objetos diferentes.*/ 

import java.util.Scanner;
/**
 * @author JuanB
 *
 */
public class Lata {
    private double altura, superficie, vol ,diametro , rad, pi=3.1416;  //datos 
    private static double[] v = new double[3];  //variables para arreglo de tabla de datos, pifia nama
    private static double[] s = new double[3]; //variables para arreglo de tabla de datos, pifia nama
    private int a=0, c=0, x=0; //contadores
    
    public void SETVolumen(){   
    	System.out.println("Calculando...-------VOLUMEN------Lata# "+c);
    	vol=0;	
        vol=(pi*rad*rad*altura);
    	v[c]=vol;
        c++;
 }
    public void SETSuperficie(){
    	System.out.println("Calculando...-------SUPERFICIE------Lata#"+a);
    	superficie=0;
    	superficie=((2*pi)*(rad*rad)+(2*pi)*(rad*altura));
    	s[a]=superficie;
    	a++;
    }
	public Lata(){  //mi constructor con sus valores inciales
		altura=4.8;
		diametro=2.5;
	}
	public void setdata(){
		Keyboard = new Scanner (System.in);
		System.out.println(""
				+ "Digite el radio de su lata");  
		rad = Keyboard.nextFloat();
	}
	
	public void Mostrar(){
    	System.out.println("\nLATA---SUPERFICIE---VOLUMEN");
        System.out.println(" " + x + "  " + superficie + "     " +vol);
    	x++;
	}
	public static void setdataboard(){//Una funcion para mostrar tabla de datos
		System.out.println("\n\tTABLA DE DATOS");
		System.out.println("LATA---SUPERFICIE---VOLUMEN");
		for(int h=0; h<3;h++){
	        System.out.println(" " + h + "   " + s[h] + "     " +v[h]);			
		}
	} 
	private static Scanner Keyboard;
	public static void main(String[] args) {
		Lata lat = new Lata();
		for(int a=0;a<3;a++){
		lat.setdata();
		lat.SETSuperficie();
		lat.SETVolumen();
		lat.Mostrar();
		}
	   setdataboard();
	}
	}


