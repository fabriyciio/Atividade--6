

public class Teste {
	
public static void main(String[] args) {
		
		moto c1 = new moto(15);
		
		System.out.println("----Honda-----");
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		
		Bmw c2 = new Bmw(400);
		c2.ligarTurbo();
		c2.ligarAr();
		c2.ativarCilindro();
		 
		System.out.println();
		System.out.println("-----BMW-----");
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
		
		
		
	}
	
	
	
	
	
	
	
}


