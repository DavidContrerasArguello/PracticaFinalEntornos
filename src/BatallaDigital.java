import java.util.Scanner;

/**
 * Clase BatallaDigital que maneja la lógica de la batalla.
 *
 * @author David
 * @version 1.0
 */
public class BatallaDigital {
    private Domador domador;
    private Digimon enemigo;

    /**
     * Constructor de BatallaDigital.
     *
     * @param domador Domador que participa en la batalla.
     */
    public BatallaDigital(Domador domador) {
        this.domador = domador;
        // Generar un Digimon enemigo aleatorio
        this.enemigo = new Digimon("Gabumon"); // Ejemplo con Gabumon
    }

    /**
     * Método para elegir un Digimon del equipo.
     */
    public void elige() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige un Digimon de tu equipo:");
        // Lógica para mostrar y seleccionar Digimon del equipo
    }

    /**
     * Método para iniciar la pelea.
     */
    public void pelea() {
        // Lógica para decidir qué ataque usar o si capturar
    }
}
