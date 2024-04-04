package feladat04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FajlKezeles {
    
    public List<Berlet> berletekBeolvasasa(String fajlnev) {
        List<Berlet> berletek = new ArrayList<>();
        Path fajlUtvonal = Paths.get(fajlnev);
        
        try (BufferedReader br = Files.newBufferedReader(fajlUtvonal)) {
            br.readLine();
            String sor;
            while ((sor = br.readLine()) != null) {
                String[] adatok = sor.split(";");
                Berlet berlet = new Berlet(adatok[0], adatok[1], adatok[2], Integer.parseInt(adatok[3]));
                berletek.add(berlet);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return berletek;
    }
    
    public void lejartBerletekKiirasa(List<Berlet> berletek, String fajlnev) {
        Path fajlUtvonal = Paths.get(fajlnev);
        List<String> kiirandoSorok = new ArrayList<>();
        kiirandoSorok.add("azonosító;jogosultNeve;jogosultCíme;lejáratiÉv");
        
        for (Berlet berlet : berletek) {
            if (berlet.lejart()) {
                kiirandoSorok.add(berlet.toString());
            }
        }
        
        try {
            Files.write(fajlUtvonal, kiirandoSorok);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

