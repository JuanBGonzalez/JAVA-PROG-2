
public class Banquero extends Cliente{
	private float reti,depo;
	private int ele;
	public void Transaccionban(){
		
		System.out.println("\n1.RetirarTodo\n2.Deposito\n3.EstadoDelCajero\n4.Salir");
		ele = key.nextInt();
		switch(ele){
		case 1:{
			System.out.println("Retirar\nMonto que desea retirar:");
			reti = key.nextFloat();
			if(reti<Banco){
				Banco=Banco-reti;
				System.out.println("\nCajeroRetirastes:"+reti+" \nTotalEntuBanco:"+Banco+"\nHasta luego vuelva pronto");
			}
			else{
				System.out.println("Estas sacando un monto que no tiene el banco\nMontoDisponible:"+Banco+"\nHasta luego vuelva pronto");
			}}break;
			case 2:{
				System.out.println("Deposito\nMonto que deposito:");
				depo = key.nextFloat();
					Banco=Banco+depo;
					System.out.println("\nDepositastesAlCajeto:"+depo+" \nTotalEntuBanco:"+Banco+"\nHasta luego vuelva pronto");
			}break;
			case 3:{
					System.out.println(" \nBanco:"+Banco+"\nHasta luego vuelva pronto");
				
		}
		break;
		}
	}
}
