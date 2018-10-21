package builder_factory;

public class Samsung extends Celular implements ICelular {
	
	public Samsung(String modelo) {
		super(modelo);
	}

	@Override
	public String getMarca() {
		return "Samsung";
	}

	@Override
	public String toString() {
		return "Samsung [getModelo()=" + getModelo() + ", getSerie()=" + getSerie() + ", getValor()=" + getValor()
				+ "]";
	}
	
	

}
