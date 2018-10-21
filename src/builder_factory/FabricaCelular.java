package builder_factory;

public class FabricaCelular {
	
	public ICelular getMarca(String tipo) {
		ICelular celular = null;
		
		switch (tipo.toUpperCase()) {
		case "SAMSUNG":
			Samsung samsung = new Samsung("S9");
			new CelularBuilder(samsung).serie("9").valor(2500d);
			celular = samsung;
			System.out.println(samsung);
			break;
		case "MOTOROLA":
			Motorola motorola = new Motorola("Z3");
			new CelularBuilder(motorola).serie("3").valor(2000d);
			celular = motorola;
			System.out.println(motorola);
			break;
		case "XIAOMI":
			Xiaomi xiaomi = new Xiaomi("MI8");
			new CelularBuilder(xiaomi).serie("8").valor(2300d);
			celular = xiaomi;
			System.out.println(xiaomi);
			break;
		default:
			break;
		}
		return celular;
	}

}
