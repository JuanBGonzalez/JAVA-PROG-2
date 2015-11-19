/**2.La rúbrica de laboratorios de este curso se calcula en base a cinco laboratorios calificados.
 *  De los cinco laboratorios se elimina la menor nota y se efectúa un promedio de las notas restantes. 
 *  Su programa debe captar las calificaciones de los laboratorios por teclado, imprimir en pantalla la calificación eliminada 
 *  e imprimir en pantalla el promedio de la rúbrica de laboratorios para 3 estudiantes.
 * 
 */

/**
 * @author JuanB
 *
 */
import java.util.Scanner;

public class Laboratorios {
	private String[] estudiantes = new String[4];
	private double[] nota = new double[6];
	private double menor=999;
	private double[] promedio = new double[4];
	private double tot = 0;
	
	public Laboratorios(){ 
		Scanner K = new Scanner(System.in);//CONTRUCTOR DE LA CLASE LABORATORIOS
	  for(int est=0;est<3;est++){
		  menor=999;
		System.out.println("\nDigite el nombre del estudiante#"+est);
		estudiantes[est] = K.next();
		for(int n=0;n<5;n++){
			System.out.println("\nDigite la nota#"+n);
			nota[n]=K.nextDouble();
			if(nota[n] <= menor){  
				   menor = nota[n]; 
				        }  
			tot=nota[n]+tot;  //SUMADOR
			}
		tot=tot-menor;
		promedio[est]=tot/4;       
		tot=0;
		}
	  }
		
		
	
	public void tabla(){                //Funcion de clase laboratorios
		System.out.println("Estudiantes\tNota Final");
		for(int n=0; n<3;n++){
			System.out.println(estudiantes[n]+"\t"+promedio[n]);
		}
	}

	private static Scanner K;
	public static void main(String[] args) {
		Laboratorios ob = new Laboratorios();
        ob.tabla();
	}

}
