
import java.util.Scanner;
import java.util.ArrayList;

public class KalkulatorOcenZad3 {
    public static void main(String[] args) {
        // Utworzenie obiektu Scanner dla wejścia konsoli
        Scanner skaner = new Scanner(System.in);
        // Lista do przechowywania ocen
        ArrayList<Double> oceny = new ArrayList<>();
        double sumaOcen = 0;

        // Wprowadzanie ocen przez użytkownika
        System.out.println("Wprowadź oceny (wpisz -1 aby zakończyć):");
        while (true) {
            double ocena = skaner.nextDouble();
            if (ocena == -1) {
                break; // Wyjście z pętli po wprowadzeniu -1
            }
            oceny.add(ocena); // Dodanie oceny do listy
            sumaOcen += ocena; // Dodanie oceny do sumy
        }
        
        // Wyświetlanie wprowadzonych ocen
        System.out.println("Wprowadzone oceny to:");
        for (double ocena : oceny) {
            System.out.println(ocena);
        }
        // Wyświetlanie sumy i średniej ocen
        System.out.println("Suma ocen: " + sumaOcen);
        double srednia = sumaOcen / oceny.size();
        System.out.println("Średnia ocen wynosi: " + srednia);

        skaner.close(); // Zamknięcie skanera
    }
}
