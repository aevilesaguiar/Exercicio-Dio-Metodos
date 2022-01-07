package retornos;

public class AreaReturn {
	public static double area(double lado) {
		double area = lado*lado;
		return area;
	}
	
	public static double area(double base, double altura) {
		double area = base*altura/2;
		return area;
	}
	public static double area(double baseMaior, double baseMenor, double altura) {
		double area = ((baseMaior+baseMenor)/2)*altura;
		return area;
	}

}
