package strategy;

public class CarroPequeno extends Carro {
	
	
	public CarroPequeno(String chassi, String modelo) {
		super(chassi, modelo);
	}

	@Override
	public void calcularConsumo() {
		this.consumo = 12.5/1; 
	}


}
