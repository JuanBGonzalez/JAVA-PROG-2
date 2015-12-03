/**
 * 
 */

import java.awt.List; 
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
/**
 * @author JuanB
 *
 */
public class Principal {
     private String buscar, newcontact, erracontact;
     private int newtel;
     
	public Principal(){
		Map<String, Integer> Lista = new HashMap<String, Integer>();
		for(int x=0; x<3 ;x++){
			try{
			//Map<Integer , String> Lista = new HashMap<Integer , String>();
			System.out.println("\nPara comenzar introduzca los primeros 3 contactos\nDigite el nombre, seguido del numero(dejando spacebar)");
			newcontact = key.next();
			newtel = key.nextInt();
			Lista.put(newcontact, newtel);
			}catch(Exception e){
				System.out.println("QUe xopaa? Introduce algo valido amigo\nPrimero numero despues nombre 3veces");
			}
			 }	
	}
	Map<Integer, String> Lista = new HashMap<Integer, String>();
	static Scanner key = new Scanner(System.in);
	public static void main(String[] args) {
		Principal pal= new Principal();
		   Map<Integer, String> Lista = new HashMap<Integer, String>();
        int opc=0;
        char op='n';
        while(opc<5){
        try{
        System.out.println("Menu:\n1.Lista de Contactos\n2.Buscar telefono\n3.Anadir Contacto\n4.Borrar Contacto\n5.Formatear");
        opc = key.nextInt();
		switch(opc){
        	case 1:{
        		pal.Lista();
        		pal.Lista2();
        		Lista.entrySet();
        	}break;
        	case 2:{
        		pal.Buscar();
        	}break;
        	case 3:{
        		pal.Anadir();
        	}break;
        	case 4:{
        		pal.eliminar();
        	}break;
        	case 5:{
        		System.out.println("Esta seguro, SEGURO SEGURO??!!? s\n");
        	    op = key.next().charAt(0);
        		if(op=='s'){
        		Lista.clear();
        		}
        	}break;
        }
	}catch(Exception e){
		System.out.println("\nFren estas haciendo todo mal vuelva a intentarlo despues");
	}finally{
		System.out.println("\nHasta Luego");
	}
      }
        }
	Iterator<Integer> impri = Lista.keySet().iterator();
	public void Lista2(){
		while(impri.hasNext()){
			Object keys = impri.next();
			Object valors = Lista.keySet().iterator();
			System.out.println(keys + " "+ valors);
		}
	}
	public void Lista(){
		HashMap<String, Integer> Lista = new HashMap<String, Integer>();
		System.out.println("Mi lista de contactos");
		for (Map.Entry<String,Integer> e: Lista.entrySet()) {
			System.out.println("["+e.getKey()+ "  " + e.getValue()+"]");
		}
	}

	public void Buscar(){
		Map<String, Integer> Lista = new HashMap<String, Integer>();
		System.out.println("\nContacto que desea buscar:");
		buscar = key.next();
		for (Entry<String,Integer> e: Lista.entrySet()) {
			if(buscar==e.getKey()){
				System.out.println(e.getKey() + " :" + e.getValue());
			}
			else{
				System.out.println("No exite este contacto");
			}
		}
	}
	public void Anadir(){
		Map<Integer, String> Lista = new HashMap<Integer, String>();
		char opc = 's';
		while(opc!='n'){
			try{
		System.out.println("\nNuevo contacto\nNombre del nuevo contacto:");
		newcontact = key.next();
		System.out.println("\nDigite Telefono o Celular");
		newtel = key.nextInt();
	    Lista.put(newtel,newcontact);
	    System.out.println("Desea anadir otro contacto? s\n ");
	    opc = key.next().charAt(0);
			}catch(Exception e){
	 System.out.println("ERROR949489:Vuelva a poner los codigos");
		}finally{ System.out.println("Terminado");
	}
   } 
  }
	public void eliminar(){
		Map<Integer, String> Lista = new HashMap<Integer, String>();
		char opce = 's';
		while(opce!='n'){
			try{
		System.out.println("\nDigite el nombre que desea borrar:");
		erracontact = key.next();
	    Lista.remove(erracontact);
	    System.out.println("Desea Borrar otro contacto? s\n");
	    opce = key.next().charAt(0);
			}catch(Exception e){
	 System.out.println("ERROR949489:Vuelva a poner los codigos");
		}finally{ System.out.println("Terminado");
	}
   } 
	}
}
