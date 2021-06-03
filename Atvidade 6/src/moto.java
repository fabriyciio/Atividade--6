

public class moto {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int delta = 5;
	
	moto (int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += getDelta();
			
		}
	}
	
	 void freiar() {
		if(velocidadeAtual >=5) {
			velocidadeAtual -= 5;
			
		}else {
			velocidadeAtual =0;
		}
		
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	@Override
	public String toString() {
		return "Velocidade Atual � => " + velocidadeAtual + "Km/h";
	}
	

}



