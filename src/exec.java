import java.util.Scanner;

/**
 * Punto de entrada del programa.
 *
 * @author David
 * @version 1.0
 */
public class exec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del domador: ");
        String nombreDomador = scanner.nextLine();

        Domador domador = new Domador(nombreDomador);
        BatallaDigital batalla = new BatallaDigital(domador);

        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Iniciar batalla\n2. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    batalla.elige();
                    batalla.pelea();
                    break;
                case 2:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}
