package teszt02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import feladat02.Ital;

class ItalTeszt {

    @Test
    void konvertTeszt() {
        Ital italObj = new Ital("általános ital", "Italgyártó RT", 10);
        double elvartEredmeny = 100;
        assertEquals(elvartEredmeny, italObj.konvert("centi"));
    }
    
    @Test
    void konvertKivetelTeszt() {
        Ital italObj = new Ital("próba ital", "Próba Gyártó", 5);
        assertThrows(IllegalArgumentException.class, () -> {
            italObj.konvert("nem létező mértékegység");
        });
    }
}
