
import java.util.Scanner;

public class KalkulatorOcen {
    public static void main(String[] args) {
        // Tworzymy obiekt Scanner do czytania danych z konsoli
        Scanner skaner = new Scanner(System.in);
        
        // Zmienne przechowujące sumę ocen i liczbę przedmiotów
        double sumaOcen = 0;
        int liczbaPrzedmiotow = 3; // Przykładowo bierzemy trzy przedmioty
        
        // Tablica z nazwami przedmiotów
        String[] przedmioty = new String[]{"matematyka", "fizyka", "chemia"};
        
        // Pętla do pobierania ocen dla każdego przedmiotu
        for (int i = 0; i < liczbaPrzedmiotow; i++) {
            System.out.print("Proszę wprowadzić ocenę z " + przedmioty[i] + ": ");
            double ocena = skaner.nextDouble();
            sumaOcen += ocena; // Dodawanie oceny do sumy całkowitej
        }
        
        // Obliczanie średniej arytmetycznej
        double srednia = sumaOcen / liczbaPrzedmiotow;
        
        // Wyświetlanie średniej
        System.out.println("Średnia arytmetyczna wynosi: " + srednia);
        
        // Zamykanie obiektu skaner
        skaner.close();
    }
}
