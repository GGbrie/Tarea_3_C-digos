import java.util.Scanner;

public class Potencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número inicial: ");
        int base = scanner.nextInt();

        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
        scanner.close();
    }
}
