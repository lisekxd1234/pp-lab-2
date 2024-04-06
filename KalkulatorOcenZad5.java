
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class KalkulatorOcenZad5 {
    public static void main(String[] args) {
        // Utworzenie obiektu Scanner do odczytu danych z konsoli
        Scanner skaner = new Scanner(System.in);
        // Lista do przechowywania ocen
        ArrayList<Double> oceny = new ArrayList<>();

        // Wprowadzanie ocen przez użytkownika
        System.out.println("Wprowadź oceny (wpisz -1 aby zakończyć):");
        while (true) {
            double ocena = skaner.nextDouble();
            if (ocena == -1) {
                break; // Zakończenie wprowadzania danych
            }
            oceny.add(ocena); // Dodawanie oceny do listy
        }
        
        // Sortowanie listy w celu obliczenia mediany
        Collections.sort(oceny);
        double mediana;
        int size = oceny.size();
        if (size % 2 == 0) {
            // Obliczenie średniej z dwóch środkowych elementów dla parzystej liczby ocen
            mediana = (oceny.get(size / 2) + oceny.get(size / 2 - 1)) / 2;
        } else {
            // Pobranie środkowego elementu dla nieparzystej liczby ocen
            mediana = oceny.get(size / 2);
        }
        System.out.println("Mediana ocen wynosi: " + mediana);

        skaner.close(); // Zamknięcie obiektu Scanner
    }
}
