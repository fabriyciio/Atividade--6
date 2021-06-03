

public class Bmw extends moto implements Esportivo,Luxo,Incriveis {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	@SuppressWarnings("unused")
	private boolean ativarCilindro;
	@SuppressWarnings("unused")
	private boolean desativarCilindro;
	
	Bmw(){
		this(315);
	}
	
	Bmw( int VELOCIDADE_MAXIMA){
		super(VELOCIDADE_MAXIMA);
		setDelta(15);
		
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}

	@Override
	public void ligarAr() {
		ligarAr = true;
		
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	public int getDelta() {
		if(ligarTurbo && ! ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if (!ligarTurbo && ligarAr) {
			return 20;
		}else {
			return 15;
		}
		
	}

	@Override
	public void ativarCilindro() {
		ativarCilindro = true;
	}

	@Override
	public void desativarCilindro() {
		desativarCilindro = false;
	}

}
