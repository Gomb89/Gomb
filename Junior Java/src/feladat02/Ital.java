package feladat02;

public class Ital {
	
	private String megnevezes;
	private String gyarto;
	private double urtartalom;
	
	public Ital(String megnevezes, String gyarto, double urtartalom) {
		this.megnevezes = megnevezes;
		this.gyarto = gyarto;
		this.urtartalom = urtartalom;
	}
	
	public double konvert(String mertekegyseg) {
		switch (mertekegyseg) {
			case "liter":
				return urtartalom / 10.0;
			case "centi":
				return urtartalom * 10;
			default:
				throw new IllegalArgumentException("nem értelmezett mértékegység");
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s: %f dl", gyarto, megnevezes, urtartalom);
	}
}
