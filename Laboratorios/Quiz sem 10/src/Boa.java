/**5
 * 
 */

/**
 * @author JuanB*/
 import java.util.Scanner;
 
public class Boa{
	static int peso=1;
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
	  Boa x = new Boa();
  	     while(peso>0){
  	   	  System.out.println("\nTienes que crear la boa primero amigo\nMenu\n1.Crear BOA\n2.Alimentar\n3Jugar\n4.Dormir\n5.Salir");
  	  	  System.out.println("Digite una opcion");
  	  	  int opc = key.nextInt();
  	  switch(opc){
  		  case 1:{
  			  x.Crear();
  			  break;
  		  }
  		  case 2:{
				 x.Alimentar();
				 break;
				}
  		  case 3:{
				x.Jugar();
				break;
				}
  		  case 4:{
			   x.Dormir();
			   break;
				}
  		  case 5:{
  	       System.out.println("Se murio tu boa");
	    	    x.Salir();
	    	    break;
            }
		    }
  	  }
  	  
}
public void Crear(){
	peso=peso+5;
System.out.println("Se creo la boa");
}
public void Alimentar(){
	System.out.println("ALIMENTAR  +5");
	peso=peso+5;
}
public void Jugar(){
	System.out.println("JUGAR  -3");
	peso=peso-3;
}
public void Dormir(){
	System.out.println("DORMIR  +1");
	peso=peso+1;
}
public void Salir(){
 System.out.println("CHAO");
 System.exit(-1);
}
}

