package strategy;

public class CarroMedio extends Carro {
	
	public CarroMedio(String chassi, String modelo) {
		super(chassi, modelo);
	}

	@Override
	public void calcularConsumo() {
		this.consumo = 9.5/1; 
	}
	

}
