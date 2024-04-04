package feladat02;

public class UditoItal extends Ital {
	
	private boolean cukormentes;
	
	public UditoItal(String megnevezes, String gyarto, double urtartalom, boolean cukormentes) {
		super(megnevezes, gyarto, urtartalom);
		this.cukormentes = cukormentes;
	}
	
	@Override
	public String toString() {
		return super.toString() + (cukormentes ? " - Cukormentes" : " - Cukros");
	}
}
