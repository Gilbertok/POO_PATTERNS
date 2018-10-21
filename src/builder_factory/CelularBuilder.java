package builder_factory;

public class CelularBuilder {
	
	private Celular celular;
	
	public CelularBuilder(Celular celular) {
		this.celular = celular;
	}
	
	public CelularBuilder serie(String serie) {
		this.celular.setSerie(serie);
		return this;
	}
	
	public CelularBuilder valor(Double valor) {
		this.celular.setValor(valor);
		return this;
	}
	

}
