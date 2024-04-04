package feladat02;

public class ItalRaktarApp {

	public static void main(String[] args) {
		Ital[] italok = new Ital[] {
			new Ital("Ásványvíz", "Naturaqua", 5),
			new UditoItal("Cola", "Coca-Cola", 2, false),
			new AlkoholosItal("Vodka", "Absolut", 1, 40)
		};
		
		for (Ital ital : italok) {
			System.out.println(ital.toString());
			try {
				System.out.println("  - Literben: " + ital.konvert("liter"));
				System.out.println("  - Centiliterben: " + ital.konvert("centi"));
			} catch (IllegalArgumentException e) {
				System.err.println("  - Hiba: " + e.getMessage());
			}
		}
	}
}
