package teszt01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import feladat01.BmiIndexApp;

class BmiIndexAppTeszt {

	@Test
    void kalkulalTeszt() {
        double suly = 81;
        double magassag = 1.8;
        double elvartEredmeny = suly / (magassag * magassag);
        assertEquals(elvartEredmeny, BmiIndexApp.kalkulal(suly, magassag), "A BMI kalkuláció hibás.");
    }

    @Test
    void besorolasTest() {
        assertEquals("normál testsúlyhoz képest sovány", BmiIndexApp.besorolas(18), "A sovány besorolás helytelen.");
        assertEquals("normál testsúlyú", BmiIndexApp.besorolas(22), "A normál testsúlyú besorolás helytelen.");
        assertEquals("normál testsúlyhoz képest túlsúlyos", BmiIndexApp.besorolas(26), "A túlsúlyos besorolás helytelen.");
    }
}
