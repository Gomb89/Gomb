package feladat04;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Lejart {

    public static List<Berlet> lejartBerletekKigyujtese(List<Berlet> berletek) {
        List<Berlet> lejartBerletek = new ArrayList<>();
        for (Berlet berlet : berletek) {
            if (berlet.lejart()) {
                lejartBerletek.add(berlet);
            }
        }
        return lejartBerletek;
    }

    public static void lejartBerletekKiirasaFajlba(List<Berlet> lejartBerletek, String fajlnev) {
        Path path = Path.of(fajlnev);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("azonosító;jogosultNeve;jogosultCíme;lejáratiÉv\n");
            for (Berlet berlet : lejartBerletek) {
                writer.write(berlet.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
