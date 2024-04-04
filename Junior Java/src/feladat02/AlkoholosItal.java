package feladat02;

public class AlkoholosItal extends Ital {
	
	private double alkoholtartalom;
	
	public AlkoholosItal(String megnevezes, String gyarto, double urtartalom, double alkoholtartalom) {
		super(megnevezes, gyarto, urtartalom);
		this.alkoholtartalom = alkoholtartalom;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format(" - Alkoholtartalom: %.2f%%", alkoholtartalom);
	}
}
