import java.util.Scanner;

public class Operaciones {
 static int n1;
 static int n2;
 static int resultado;
public  Operaciones() {
    n1 = 0;
    n2 = 0;
    resultado = 0;
}
    public static void Suma() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer valor:");
        n1 = scanner.nextInt();

        System.out.println("Digite el segundo valor:");
        n2 = scanner.nextInt();

        resultado = n1 + n2;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Resta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer valor:");
        n1 = scanner.nextInt();

        System.out.println("Digite el segundo valor:");
        n2 = scanner.nextInt();

        resultado = n1 - n2;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Division() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer valor:");
        n1 = scanner.nextInt();

        System.out.println("Digite el segundo valor:");
        n2 = scanner.nextInt();

        resultado = n1 / n2;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Multiplicacion() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el primer valor:");
        n1 = scanner.nextInt();

        System.out.println("Digite el segundo valor:");
        n2 = scanner.nextInt();

        resultado = n1 * n2;
        System.out.println("El resultado es: " + resultado);
    }
}
