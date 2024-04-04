package feladat05;

public class Tura {
	
	private String megnevezes;
	private int hosszKm;
	private int szintemelkedesMeter;
	
	
	public Tura(String megnevezes, int hosszKm, int szintemelkedesMeter) {
		this.megnevezes = megnevezes;
		this.hosszKm = hosszKm;
		this.szintemelkedesMeter = szintemelkedesMeter;
	}
	
	
	public String getMegnevezes() {
		return megnevezes;
	}


	public int getHosszKm() {
		return hosszKm;
	}


	public int getSzintemelkedesMeter() {
		return szintemelkedesMeter;
	}


	@Override
	public String toString() {
		return megnevezes + " hossza: " + hosszKm + " km, szintemelkedés: "	+ szintemelkedesMeter + " m";
	}

}
