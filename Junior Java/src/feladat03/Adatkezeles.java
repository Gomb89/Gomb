package feladat03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Adatkezeles {
    
    public Map<String, Integer> adatBeker() {
        
        Map<String, Integer> gyorshajtok = new HashMap<>();
        
        Scanner sc = new Scanner(System.in);
    
        String rendszam;
        while (true) {
            
            System.out.print("Írja be a gyorshajtó jármű rendszámát (vagy ha nincs több, akkor azt, hogy \"vége\"): ");
            rendszam = sc.nextLine();
            
            if(rendszam.equals("vége")) {
                break;
            }
                
            gyorshajtok.put(rendszam, gyorshajtok.getOrDefault(rendszam, 0) + 1);
        }
        
        return gyorshajtok;
    }
}

