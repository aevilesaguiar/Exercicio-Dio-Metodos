package sobrecarga;

public class Area {
	
	public static void area(double lado) {
			double area = lado*lado;
			System.out.println("área do Quadrado: "+area);
	}

	public static void area(double base, double altura) {
		double area = base*altura/2;
		System.out.println("área do Triangulo: "+area);
	}
	public static void area(double baseMaior, double baseMenor, double altura) {
		double area = ((baseMaior+baseMenor)/2)*altura;
		System.out.println("área do Trapézio: "+area);
	}

}
