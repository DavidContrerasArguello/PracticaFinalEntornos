public class Domador {
    import java.util.ArrayList;

    /**
     * Clase Domador que representa a un domador de Digimon.
     *
     * @author David
     * @version 1.0
     */
    public class Domador {
        private String nombre;
        private ArrayList<Digimon> equipo;

        /**
         * Constructor de Domador.
         *
         * @param nombre Nombre del domador.
         */
        public Domador(String nombre) {
            this.nombre = nombre;
            this.equipo = new ArrayList<>();
            // Asignar un Digimon aleatorio al equipo
            this.equipo.add(new Digimon("Agumon")); // Ejemplo con Agumon
        }

        /**
         * Método para capturar un Digimon.
         *
         * @param digimon Digimon a capturar.
         */
        public void captura(Digimon digimon) {
            if (digimon.getSalud() <= 20) {
                System.out.println(digimon.getNombre() + " se ha unido a su equipo");
                this.equipo.add(digimon);
            } else {
                System.out.println("No se puede unir " + digimon.getNombre());
            }
        }

        // Getters y Setters
    }

}
