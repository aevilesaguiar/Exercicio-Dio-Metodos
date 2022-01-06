package exerciciopraticoParte1;

public class TesteMain {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		System.out.println("CALCULADORA \n");
		
		Calculadora operacao = new Calculadora();
		
		operacao.divisao(3,2);
		operacao.multiplica(5, 6);
		operacao.subtracao(6, 3);
		operacao.divisao(10, 5);
		
		System.out.println("\nMENSAGEM SAUDAÇÃO  \n");

		Mensagem saudacao=new Mensagem();
		
		saudacao.obterMensagem(5);
		saudacao.obterMensagem(13);
		saudacao.obterMensagem(19);
		
		System.out.println("\nEXERCICIO EMPRESTIMO  \n");

		Emprestimo emprestimo=new Emprestimo();
		emprestimo.calcular(100, 3);
		emprestimo.calcular(100, emprestimo.getTresParcelas());
		
	}

}
