package teszt03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import feladat03.Adatkezeles;
import java.util.Map;

class AdatkezelesTeszt {

    @Test
    void adatBekerTeszt() {
        Adatkezeles adatObj = new Adatkezeles();
        assertFalse(adatObj.adatBeker().containsKey("vége"));
    }
    
    @Test
    void maxBuntetesTeszt() {
        Adatkezeles adatObj = new Adatkezeles();
        Map<String, Integer> eredmeny = adatObj.adatBeker();
        assertTrue(eredmeny.getOrDefault("ABC123", 0) >= 2);
    }
}
