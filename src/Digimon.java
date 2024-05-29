import java.util.Random;

/**
 * Clase Digimon que representa a un Digimon con sus características básicas.
 *
 * @author TuNombre
 * @version 1.0
 */
public class Digimon {
    private String nombre;
    private int nivel;
    private int ataque;
    private int salud;
    private int dp1; // Puntos de Ataque Digital 1
    private int dp2; // Puntos de Ataque Digital 2

    /**
     * Constructor de Digimon.
     *
     * @param nombre Nombre del Digimon.
     */
    public Digimon(String nombre) {
        this.nombre = nombre;
        Random random = new Random();
        this.nivel = random.nextInt(5) + 1; // Nivel aleatorio entre 1 y 5
        this.ataque = this.nivel * 5;
        this.salud = this.nivel * 10;
        this.dp1 = 10;
        this.dp2 = 10;
    }

    /**
     * Realiza el primer tipo de ataque.
     */
    public void ataque1() {
        if (dp1 > 0) {
            System.out.println(nombre + " usa Ataque1!");
            dp1--;
        } else {
            System.out.println(nombre + " no tiene suficientes DP para Ataque1.");
        }
    }

    /**
     * Realiza el segundo tipo de ataque.
     */
    public void ataque2() {
        if (dp2 > 0) {
            System.out.println(nombre + " usa Ataque2!");
            dp2 -= 2;
        } else {
            System.out.println(nombre + " no tiene suficientes DP para Ataque2.");
        }
    }

    // Getters y Setters
}

