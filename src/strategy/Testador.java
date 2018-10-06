package strategy;

public class Testador {
	
	public static void main(String[] args) {
		 
		Carro carroPequeno = new CarroPequeno("2313131", "Ford Ka");
		Carro carroMedio = new CarroMedio("549123", "Ford Focus");
		
		CalculadorDeConsumo calc = new CalculadorDeConsumo();
		calc.calcularSalario(carroPequeno);
		calc.calcularSalario(carroMedio);
		
		System.out.println(carroPequeno);
		System.out.println(carroMedio);
		
	}

}
