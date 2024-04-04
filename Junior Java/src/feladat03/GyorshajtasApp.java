package feladat03;

import java.util.Map;

public class GyorshajtasApp {

    public static void main(String[] args) {
        
        Adatkezeles adatObj = new Adatkezeles();
        Map<String, Integer> gyorshajtok = adatObj.adatBeker();
        
        adatokListazasa(gyorshajtok);
        maxBuntetesKiirasa(gyorshajtok);
    }

    public static void adatokListazasa(Map<String, Integer> gyorshajtok) {
        System.out.println("Gyorshajtók listája:");
        gyorshajtok.forEach((rendszam, buntetesekSzama) -> System.out.println("Rendszám: " + rendszam + ", Büntetések száma: " + buntetesekSzama));
    }
    
    public static void maxBuntetesKiirasa(Map<String, Integer> gyorshajtok) {
        int maxBuntetes = gyorshajtok.values().stream().max(Integer::compare).orElse(0);
        System.out.println("Legmagasabb büntetésszám: " + maxBuntetes);
    }
}
