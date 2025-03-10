package perimetroRettangolo;

import java.util.Scanner;

public class PerimetroRettangoloTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la base del rettangolo: ");
        int base = scanner.nextInt();

        System.out.println("Inserisci l'altezza del rettangolo: ");
        int altezza = scanner.nextInt();

        System.out.println("il perimetro è:" + "" + PerimetroRettangolo.perimetroRettangolo(base, altezza));
    }
}
