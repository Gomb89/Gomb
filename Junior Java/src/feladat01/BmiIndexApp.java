package feladat01;

import java.util.Scanner;

public class BmiIndexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem a súlyt kg-ban: ");
        double suly = scanner.nextDouble();
        System.out.print("Kérem a magasságot méterben: ");
        double magassag = scanner.nextDouble();
        
        double bmiIndex = kalkulal(suly, magassag);
        System.out.printf("A BMI index: %.2f\n", bmiIndex);
        
        String besorolas = besorolas(bmiIndex);
        System.out.println("Besorolás: " + besorolas);
    }
    
    public static double kalkulal(double suly, double magassag) {
        return suly / (magassag * magassag);
    }
    
    public static String besorolas(double bmiIndex) {
        if (bmiIndex < 18.5) {
            return "normál testsúlyhoz képest sovány";
        } else if (bmiIndex >= 25) {
            return "normál testsúlyhoz képest túlsúlyos";
        } else {
            return "normál testsúlyú";
        }
    }
}
