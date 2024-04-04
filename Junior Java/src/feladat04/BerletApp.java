package feladat04;

import java.util.List;

public class BerletApp {

    public static void main(String[] args) {
        FajlKezeles fajlKezeles = new FajlKezeles();
        List<Berlet> berletek = fajlKezeles.berletekBeolvasasa("berletek.csv");
        
        System.out.println("Összes bérlet:");
        for (Berlet berlet : berletek) {
            System.out.println(berlet);
        }

        List<Berlet> lejartBerletek = Lejart.lejartBerletekKigyujtese(berletek);
        System.out.println("Lejárt bérletek száma: " + lejartBerletek.size());
        
        Lejart.lejartBerletekKiirasaFajlba(lejartBerletek, "lejart_berletek.csv");


        System.out.println("Lejárt bérletek:");
        for (Berlet lejartBerlet : lejartBerletek) {
            System.out.println(lejartBerlet);
        }
    }
}
