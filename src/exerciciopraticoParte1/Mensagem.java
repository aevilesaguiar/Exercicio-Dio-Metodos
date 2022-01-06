package exerciciopraticoParte1;
public class Mensagem {
	
	
	public static void obterMensagem(int hora) {

		switch (hora) {
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
				mensagemBoaTarde();
				break;
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 0:
		case 1:
		case 2:
		case 3:
				mensagemBoaNoite();
				break;
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
				mensagemBomDia();
				break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + hora);
		}
		
		
		
}
	public static void mensagemBomDia() {
		System.out.println("Bom dia");

	}
	public static void mensagemBoaTarde() {
		System.out.println("Boa Tarde");

	}
	
	public static void mensagemBoaNoite() {
		System.out.println("Boa Noite");

	}
}