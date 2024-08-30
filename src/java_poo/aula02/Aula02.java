package java_poo.aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC CRISTAL";
		c1.cor = "AZUL";
		//c1.ponta = 0.5f;
		c1.carga = 80;
		//c1.tampada = false;
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		
		
		
//		c1.cor = "Azul";
//		c1.ponta = 1.0f;
//		c1.tampar();
//		c1.status();
//		c1.rabiscar();
//		
//		Caneta c2 = new Caneta();
//		c2.modelo = "Hostnet";
//		c2.cor = "Preta";
//		c2.destampar();
//		c2.status();
//		c2.rabiscar();

	}

}
