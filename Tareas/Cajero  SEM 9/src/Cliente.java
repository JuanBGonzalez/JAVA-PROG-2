import java.util.Scanner;

public class Cliente {
	float Banco=5000;
	Scanner key = new Scanner(System.in);
	private float Monto=500,reti,depo;
	private int factu=32432;
	private int ele, pin=0000, v=0;;
 public void IniciarSesion(){
	System.out.println("Inserte su tarjeta\nDigite su Pin");
	while(pin!=1234&&v!=3){
		pin = key.nextInt();
	  if(pin==1234){
		  System.out.println("Accedio Correctamente");
	  }else{
	  v++;
	 System.out.println("pin invalido");
	 }
	  if(v==3){
		  System.out.println("ERROR SU PIN A SIDO RESTRINGIDO POR 3 DIAS, PUEDE PASAR POR EL BANCO A RECLAMAR\nHASTA LUEGO");
		  System.exit(-1); 
	  }
	  }
        }
	
public void Transaccion(){
	System.out.println("\n1.Retiro\n2.Deposito\n3.Factura de monto\n4.Salir");
	ele = key.nextInt();
	switch(ele){
	case 1:{
		System.out.println("\n\tEscogio Retiro\nDigite Monto que desea retirar");
		reti = key.nextFloat();
		if(reti<Monto){
			Monto=Monto-reti;
			Banco=Banco-reti;
			System.out.println("\nFactura:"+factu+"\nRetirastes:"+reti+" \nTotalEntuBanco:"+Monto+"\nHasta luego vuelva pronto");
		}
		else{
			System.out.println("Estas sacando un monto que no pooses\nMontoDisponible:"+Monto+"\nHasta luego vuelva pronto");
		}}break;
		case 2:{
			System.out.println("Deposito\nDigite el monto que desea depositar");
			depo = key.nextFloat();
				Monto=Monto+depo;Banco=Banco+depo;factu++;
				System.out.println("\nFactura:"+factu+"\nDepositastes:"+depo+" \nTotalEntuBanco:"+Monto+"\nHasta luego vuelva pronto");
		}break;
		case 3:{
				System.out.println(" \nTotalEntuBanco:"+Monto+"\nHasta luego vuelva pronto");
			
	}
	break;
	}
}
}
