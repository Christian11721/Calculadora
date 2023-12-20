import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Textos.menuOperaciones);
        System.out.println("Ingrese su opción: ");
        opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    Operaciones.Suma();
                    break;
                case 2:
                    Operaciones.Resta();
                    break;
                case 3:
                    Operaciones.Division();
                    break;
                case 4:
                    Operaciones.Multiplicacion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar esta calculadora");
                    break;
                default:
                    System.out.println(Textos.incorrecta);
            }
        }
    }