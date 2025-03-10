package PariDispari;

import java.util.Scanner;

public class PariDispariTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci l'operazione");
        double operazione = scanner.nextInt();

        System.out.println("il risultato della operazione e' " + PariDispari.pariDispari((int) operazione));
    }
}
