package exerciciopraticoParte1;

public class Emprestimo {

	public static int getDuasParcelas() {
		return 2;

	}
	public static int getTresParcelas() {
		return 3;
	}
	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcela) {

		if(parcela == 2) {
			
			double valorFinal=valor+(valor*getTaxaDuasParcelas());
			System.out.println("Valor do emprestimo para duas parcelas: R$ "+valorFinal);
			
		}else if(parcela ==3) {
			
			double valorFinal=valor+(valor*getTaxaTresParcelas());
			System.out.println("Valor do emprestimo para três parcelas: R$ "+valorFinal);
			
		}else {
			
		}

	}

}
