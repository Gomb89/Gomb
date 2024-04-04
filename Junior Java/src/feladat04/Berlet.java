package feladat04;

import java.time.LocalDate;

public class Berlet {
    
    private String azonosito;
    private String nev;
    private String cim;
    private int lejaratiEv;
    
    public Berlet(String azonosito, String nev, String cim, int lejaratiEv) {
        this.azonosito = azonosito;
        this.nev = nev;
        this.cim = cim;
        this.lejaratiEv = lejaratiEv;
    }
    
    public boolean lejart() {
        return lejaratiEv < LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return String.format("%s;%s;%s;%d", azonosito, nev, cim, lejaratiEv);
    }
}
