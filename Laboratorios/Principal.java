/**
 * 
 */
import java.util.Scanner;
/**
 * @author JuanB
 *
 */
public class Principal {
	
	private static Scanner Keyboard;
	public static void main(String[] args) {
	   float compra;
	   double desc=0, tot=0;
	    
	    System.out.print("\nDigite el total de la compra del cliente:");
	    Keyboard = new Scanner (System.in);
	    compra = Keyboard.nextFloat();
	    if (compra>=500){
	    	desc= compra*0.30;	    		
	    	}
	    if (compra>=200 && compra<500){
	    	desc= compra*0.20;	    		
	    	}
	    if (compra>=100 && compra<200){
	    	desc= compra*0.10;	    		
	    	}
	    tot=compra-desc;
	    System.out.println("\nSu descuento: " + desc);
	    System.out.println("\nEl total de su compra: "+ tot);
	   
	}

}
