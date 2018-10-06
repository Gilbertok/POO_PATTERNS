package composicao;

public class Testador {
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa("132135489", "Ford SA");
		Marca marca = new Marca("Ford");
		marca.setEmpresa(empresa);
		Veiculo veiculo = new Veiculo("Ford Cobra GT");
		veiculo.setMarca(marca);
		
		System.out.println(veiculo.getMarca().getNomeMarca());
		System.out.println(veiculo.getMarca().getEmpresa().getNome());
	}

}
