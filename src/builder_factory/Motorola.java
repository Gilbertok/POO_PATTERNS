package builder_factory;

public class Motorola extends Celular implements ICelular {
	
	public Motorola(String modelo) {
		super(modelo);
	}

	@Override
	public String getMarca() {
		return "Motorola";
	}

	@Override
	public String toString() {
		return "Motorola [getModelo()=" + getModelo() + ", getSerie()=" + getSerie() + ", getValor()=" + getValor()
				+ "]";
	}
	

}
