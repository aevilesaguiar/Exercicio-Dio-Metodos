package exerciciopraticoParte1;

public class TesteMain {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println("CALCULADORA");
		
		Calculadora operacao = new Calculadora();
		
		operacao.divisao(3,2);
		operacao.multiplica(5, 6);
		operacao.subtracao(6, 3);
		operacao.divisao(10, 5);
	}

}
