package strategy;

public abstract class Carro {

	protected String numeroChassi;
	protected String modelo;
	protected Double consumo;
	
	public Carro(String chassi, String modelo) {
		this.numeroChassi = chassi;
		this.modelo = modelo;
	}
	
	public Carro(String chassi, String modelo, Double consumo) {
		this(chassi, modelo);
		this.consumo = consumo;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getConsumo() {
		return consumo;
	}

	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Carro [numeroChassi=" + numeroChassi + ", modelo=" + modelo + ", consumo=" + consumo + "]";
	}
	
	public abstract void calcularConsumo();
	
}
