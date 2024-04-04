package teszt04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import feladat04.Berlet;
import feladat04.FajlKezeles;
import java.util.List;

class BerletTeszt {

    @Test
    void lejartTeszt() {
        Berlet berlet = new Berlet("B00001", "Teszt Elek", "1201 Budapest", 2020);
        assertTrue(berlet.lejart());
    }
    
    @Test
    void beolvasasTeszt() {
        FajlKezeles fajlKezeles = new FajlKezeles();
        List<Berlet> berletek = fajlKezeles.berletekBeolvasasa("berletek.csv");
        assertFalse(berletek.isEmpty());
    }
}
