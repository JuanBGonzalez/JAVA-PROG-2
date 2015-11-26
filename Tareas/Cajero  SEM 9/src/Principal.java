/** 
 * Elabore un diagrama de clases y desarrolle un programa en Java que simule un cajero autom�tico (ATM). El cajero autom�tico debe poder realizar
 *  las siguientes acciones:
�Encender. Un operador enciende la m�quina luego del mantenimiento.
�Apagar la m�quina. Un operador apaga una m�quina para que un t�cnico le de mantenimiento.
�Iniciar una sesi�n. Se da cuando el cliente inserta una tarjeta dentro del cajero autom�tico.
�Hacer una transacci�n. Inicia dentro de una sesi�n cuando el cliente elige un tipo de transacci�n del men� de opciones.
�Retiro. Es un tipo de transacci�n donde el cliente elige la cuenta de donde retirar� y la cantidad de dinero a retirar.
�PIN inv�lido. Extensi�n que entra en funci�n cuando el usuario se equivoca al menos 3 veces al tratar de ingresar su n�mero de cuatro d�gitos, PIN.
 Se debe bloquear la cuenta por 1 d�a y notificar al banco.

Tome en consideraci�n que tenemos tres posibles actores: cliente, operador y banquero.

 */

/**
 * @author JuanB
 *
 */
import java.util.Scanner;
public class Principal{
    private int opc, cho;
	boolean opcc;
	
    public Principal(){
    	Operador op = new Operador();
         Cliente cli = new Cliente();
    	Banquero ban = new Banquero();
    	Scanner key = new Scanner(System.in);
    	System.out.println("\nInserte su tarjeta\n1.Operador\n2.Cliente\n3.Banquero");
    	int opc = key.nextInt();
    	switch(opc){
    	case 1:{
    		cli.IniciarSesion();
    	     	System.out.println("\nOPERADOR\nQue opcion desear realizar\nEncender Cajero\nApagar Cajero");
    		   cho = key.nextInt();
    		   switch(cho){
    		   case 1:{
    			   op.Encender();
    		   }
    		   case 2:{
    			   op.Apagar();
    		   }
    		}
    	   }
    		break;
    	case 2:{
    		cli.IniciarSesion();
    		cli.Transaccion();
    	}
    		break;
    	case 3:{
    		 cli.IniciarSesion();
    	     ban.Transaccionban();
    	     
    	}   
    	    break;
    	}
    	}
    	
    
	public static void main(String[] args) {
	 Principal prin = new Principal();	
	}

}
