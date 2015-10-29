import java.util.Scanner;

/*1. A un trabajador le pagan segun sus horas y una tarifa de pago por horas. Si la cantidad de horas trabajadas es mayor a 40 horas,
 *  la tarifa se incrementa en un 50% para las horas extras. Usted debe calcular el salario para 5 trabajadores, obteniendo su nombre 
 *  y tarifa por teclado. Finalmente debe mostrar un reporte en pantalla que indique el nombre y el salario neto para cada uno de los trabajadores.
*
 * 
 */
public class PrincipalPaga {
	private int[] horas = new int[6];
	private String[] name = new String[6];
	private double[] sal = new double[6];
	private double aum;

	public PrincipalPaga(){
		aum=0;
		Keyboard = new Scanner (System.in);
		for(int a=1;a<6;a++){
		System.out.println("Digite el nombre del trabajador "+a);
		name[a] = Keyboard.next();
		System.out.println("Digite el salario para el trabajador: "+ name[a]);
		sal[a]= Keyboard.nextDouble();
		System.out.println("Digite las horas de trabajo del trabajador: "+ name[a]);
		horas[a]= Keyboard.nextInt();
		}
	}
	
	public void setDataPagos(){
		for(int a=1;a<=5;a++){
		   if(horas[a]>40){
			   aum=sal[a]*0.50;
			   sal[a]=sal[a]+aum;
		   }
		}
	}
	
	public void Tabla(){
		System.out.println("\nREPORTE DE SALARIOS VS TRABAJADORES");
		System.out.println("\tTrabajadores"+"\tSalario Neto");
		for(int b=1;b<=5;b++){
			System.out.println("\t\t"+name[b]+"\t"+sal[b]);
		}
	}
	private static Scanner Keyboard;
	public static void main(String[] args) {
		PrincipalPaga ob = new PrincipalPaga();
		ob.setDataPagos();
		ob.Tabla();
	}

}
