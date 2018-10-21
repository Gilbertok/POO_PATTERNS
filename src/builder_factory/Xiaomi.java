package builder_factory;

public class Xiaomi extends Celular implements ICelular {
	
	public Xiaomi(String modelo) {
		super(modelo);
	}

	@Override
	public String getMarca() {
		return "Xiaomi";
	}

	@Override
	public String toString() {
		return "Xiaomi [getModelo()=" + getModelo() + ", getSerie()=" + getSerie() + ", getValor()=" + getValor() + "]";
	}
	
}
