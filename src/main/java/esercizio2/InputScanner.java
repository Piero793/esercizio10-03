import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String parola = scanner.nextLine();
        System.out.println("Inserisci la seconda parola");
        String parola2 = scanner.nextLine();
        System.out.println("Inserisci la terza parola");
        String parola3 = scanner.nextLine();

        System.out.println("la frase è :" +"" + parola + " " + parola2 + " " + parola3);
    }
}
