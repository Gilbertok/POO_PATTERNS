package builder_factory;

public class Celular {
	
	private String modelo;
	private String serie;
	private Double valor;
	
	public Celular(String modelo) {
		this.setModelo(modelo);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
