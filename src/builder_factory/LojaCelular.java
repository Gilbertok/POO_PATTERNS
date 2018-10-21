package builder_factory;

public class LojaCelular {
	
	private FabricaCelular fabrica;
	
	public LojaCelular(FabricaCelular fabrica) {
		this.fabrica = fabrica;
	}
	
	public ICelular comprar(String tipo) {
		return fabrica.getMarca(tipo);
	}

}
