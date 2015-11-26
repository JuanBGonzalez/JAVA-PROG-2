/**
 * 
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
/**
 * @author JuanB 
 *
 *//*Usted fue contratado por la startup ABC como programador. 
Ellos le solicitan que programe la primera fase de un módulo que represente una lista de supermercados.
 El programa debe presentar un menú donde pueda elegir, por lo poco, si quiero agregar, eliminar y ver
  los elementos 
 de mi lista de supermercado. Se pueden manejar hasta 3 listas de supermercado. ABC está 
 interesada en funciones,
  manejo de excepciones y módulos. Este código debe servir para posteriores proyectos.
*/

public class ABC{
	private int remo, count=0;
	private char opca='s', opce='s';
	private String addin;
	
	public ABC(){
		for(int x=0;x<6;x++){
		System.out.println("\nDigite producto"+x);
		addin = key.next();
	   	lp.add(new MyList(count,addin));
	   	count++;
		}
	}
	List<MyList> lp = new ArrayList<MyList>();
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("\nHaga su lista basica para comenzar de 6 articulos");
		ABC abc =  new ABC();
		abc.menu();
    	int opc = 0;
    	try{
    	   while(opc<5){
    	System.out.println("\nDigite una opcion\n1.Agregar producto\n2.Eliminar produccto\n3.Ver lista\n4.Salir");
    	opc = key.nextInt();
    	switch(opc){
    	case 1:{
    		 abc.Agregar();   
    	}break;
    	case 2:{
    		abc.Eliminar();}
    	case 3:{
    		abc.menu();
    	}break;
    	case 4:{
    		System.out.println("\nHasta luego\nVuelva  pronto");
    		System.exit(-1);
    	}break;
    	case 5:{
    		
    	}
    	 }
    	}
       }catch(Exception e){
    	   System.out.println("ERROR49384:Hey amigo que xux estas haciendo eso no es valido \ncon el menu,tienes problemas?\nDigite un numero del 1-5 problema:"+e.getMessage());
       }finally{
    	System.out.println("ERROR2984:Digito no valido\nEsperamos su regreso");
    	}
	}
	public void menu(){
    	Iterator<MyList> it = lp.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    	}
    	
	}
	public void Agregar(){
		while (opca!='n'){
		System.out.println("\nDigite el articulo que desea agregar");
		addin = key.next();
	    lp.add(new MyList(count,addin));
	   	count++;
		System.out.println("\nDesea Agregar mas productor? s/n");
	    opca = key.next().charAt(0);
		}
	}
	
   public void Eliminar(){
		while (opce!='n'){
		System.out.println("\nDigite el numero del producto que desea eliminar");
		remo = key.nextInt();
		lp.remove(remo);
		System.out.println("\nDesea eliminar mas productos? s/n");
		opce = key.next().charAt(0);
   }
}
   
}