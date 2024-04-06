
import java.util.Scanner;
import java.util.ArrayList;

public class RozszerzonyKalkulatorOcen {
    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do czytania danych z konsoli
        Scanner skaner = new Scanner(System.in);
        // Tworzymy listę do przechowywania ocen
        ArrayList<Double> oceny = new ArrayList<>();
        
        // Użytkownik będzie wprowadzał oceny, aż do wpisania '-1'
        System.out.println("Wprowadź oceny (wpisz -1 aby zakończyć):");
        while (true) {
            double ocena = skaner.nextDouble();
            if (ocena == -1) {
                break; // Wyjście z pętli, jeśli wprowadzono '-1'
            }
            oceny.add(ocena); // Dodajemy ocenę do listy
        }
        
        // Obliczamy sumę ocen
        double sumaOcen = 0;
        for (Double ocena : oceny) {
            sumaOcen += ocena;
        }
        
        // Obliczamy średnią
        double srednia = sumaOcen / oceny.size();
        
        // Wyświetlamy średnią
        System.out.println("Średnia ocen wynosi: " + srednia);
        
        // Zamykamy skaner
        skaner.close();
    }
}
