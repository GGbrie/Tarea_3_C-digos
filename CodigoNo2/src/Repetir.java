import java.util.Scanner;

public class Repetir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una Frase que quieras: ");
        String frase = scanner.nextLine();

        System.out.print("Ingresa el número de veces que se repetirá: ");
        int repeticiones = scanner.nextInt();

        for (int i = 0; i < repeticiones; i++) {
            System.out.println(frase);
        }
        scanner.close();
    }
}
