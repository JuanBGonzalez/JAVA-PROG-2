/** 
 * Elabore un diagrama de clases y desarrolle un programa en Java que simule un cajero automático (ATM). El cajero automático debe poder realizar
 *  las siguientes acciones:
•Encender. Un operador enciende la máquina luego del mantenimiento.
•Apagar la máquina. Un operador apaga una máquina para que un técnico le de mantenimiento.
•Iniciar una sesión. Se da cuando el cliente inserta una tarjeta dentro del cajero automático.
•Hacer una transacción. Inicia dentro de una sesión cuando el cliente elige un tipo de transacción del menú de opciones.
•Retiro. Es un tipo de transacción donde el cliente elige la cuenta de donde retirará y la cantidad de dinero a retirar.
•PIN inválido. Extensión que entra en función cuando el usuario se equivoca al menos 3 veces al tratar de ingresar su número de cuatro dígitos, PIN.
 Se debe bloquear la cuenta por 1 día y notificar al banco.

Tome en consideración que tenemos tres posibles actores: cliente, operador y banquero.

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
