
import java.util.Scanner;
import java.util.ArrayList;

public class KalkulatorOcenZad4 {
    public static void main(String[] args) {
        // Utworzenie obiektu Scanner dla wejścia konsoli
        Scanner skaner = new Scanner(System.in);
        // Lista do przechowywania ocen
        ArrayList<Double> oceny = new ArrayList<>();
        
        // Wprowadzanie ocen przez użytkownika z walidacją
        System.out.println("Wprowadź oceny (liczby od 1 do 6, wpisz -1 aby zakończyć):");
        while (true) {
            double ocena = skaner.nextDouble();
            if (ocena == -1) {
                break; // Wyjście z pętli po wprowadzeniu -1
            }
            if (ocena < 1 || ocena > 6) {
                System.out.println("Ocena poza zakresem! Wprowadź ocenę od 1 do 6.");
                continue; // Kontynuacja pętli, pominięcie dodania oceny
            }
            oceny.add(ocena); // Dodanie poprawnej oceny do listy
        }
        
        // Obliczanie sumy i średniej ocen
        double sumaOcen = 0;
        for (double ocena : oceny) {
            sumaOcen += ocena;
        }
        double srednia = sumaOcen / oceny.size();
        System.out.println("Średnia ocen wynosi: " + srednia);

        skaner.close(); // Zamknięcie skanera
    }
}
