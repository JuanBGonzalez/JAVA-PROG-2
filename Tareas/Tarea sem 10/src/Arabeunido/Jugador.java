package Arabeunido;

public class Jugador extends Equipo {
  private String[] posciciones = {"delantero","Lateral derecho","Interior Derecho","Medio Centro","Portero","Delantero","Interior Isquierdo","Medio Centro","Lateral Izquierdo"," Defensa central","Defensa central","Remplaso","Remplaso","Remplaso","Remplaso","Masajista","Masajista","Coach"};
	
	public Jugador(){
		for(int n=0; n<18;n++){
			System.out.println(ids[n]+"\t"+nombres[n]+"\t  "+Apellidos[n]+"\t"+Edad[n]+"\t"+posciciones[n]);}
		
	}
	
	public void Entrevistas(){
		System.out.println("Entrevista \nCABLE ONDA SPORTS\nPeriodista:Cuentanos acerca de tu experiencia vivida en este partido\n" +nombres[5]+":Pues pienso"
	+ " pienso que dimos lo mejor y fue un buen partido\n"+nombres[17]+" "+Apellidos[17]+" :Me parece que los muchachos dieron lo mejor");
	}
	
	public void MalaOP(){
		System.out.println("\n\nPerdimos\n"+nombres[4]+" "+Apellidos[4]+": A mi parecer fue un partiod muy injusto demasiadas faltas");
	}
	public void BuenaOP(){
		System.out.println("\n\nGanamos\n"+nombres[4]+" "+Apellidos[4]+": Buen jugado, seguiremos asi toda la temporada");
	}
	
	public void concentrarse() {
		System.out.println("Concentrandose");
	}

	
	public void Viajar() {
		System.out.println("Viajando");
	}

	
	public void Entrenar() {
		System.out.println("Entrenando");
	}

	
	public void jugarpartidos() {
		System.out.println("Hora de la verdad!");
	}

}
