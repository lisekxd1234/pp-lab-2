
import java.util.Scanner;
import java.util.ArrayList;

public class KalkulatorOcenZad3 {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        ArrayList<Double> oceny = new ArrayList<>();
        double sumaOcen = 0;

        System.out.println("Wprowadź oceny (wpisz -1 aby zakończyć):");
        while (true) {
            double ocena = skaner.nextDouble();
            if (ocena == -1) {
                break;
            }
            oceny.add(ocena);
            sumaOcen += ocena;
        }
        
        System.out.println("Wprowadzone oceny to:");
        for (double ocena : oceny) {
            System.out.println(ocena);
        }
        System.out.println("Suma ocen: " + sumaOcen);
        double srednia = sumaOcen / oceny.size();
        System.out.println("Średnia ocen wynosi: " + srednia);

        skaner.close();
    }
}
