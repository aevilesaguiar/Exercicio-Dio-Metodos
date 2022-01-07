package sobrecarga;

public class TesteArea {

	public static void main(String[] args) {

		Area area = new Area();
		area.area(10);
		area.area(10, 15);
		area.area(10, 5, 3);

	}

}
