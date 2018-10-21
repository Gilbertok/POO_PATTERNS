package builder_factory;

public class Testador {

	public static void main(String[] args) {
		
		FabricaCelular fabrica = new FabricaCelular();
		LojaCelular loja = new LojaCelular(fabrica);
		ICelular novo = loja.comprar("motorola");
		
		System.out.println(novo.getMarca());
	}
}
