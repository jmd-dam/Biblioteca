package biblioteca;

/**
 * Classe principal que gestiona l'execució del programa de biblioteca.
 *
 * @author Javier
 * @version 1.0
 */
public class Main {

    /**
     * Mètode que engloba totes les operacions sobre un objecte Llibre:
     * mostra les dades, presta exemplars, retorna exemplars i torna a mostrar les dades.
     *
     * @param llibrePrincipal    L'objecte Llibre sobre el qual es realitzen les operacions.
     * @param quantitatAPrestar  Nombre d'exemplars a prestar.
     * @param quantitatARetornar Nombre d'exemplars a retornar.
     */
    public static void gestionarLlibre(Llibre llibrePrincipal, int quantitatAPrestar, int quantitatARetornar) {
        llibrePrincipal.mostrarDades();
        System.out.println();

        try {
            llibrePrincipal.prestarLlibre(quantitatAPrestar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        llibrePrincipal.retornarLlibre(quantitatARetornar);
        System.out.println();

        llibrePrincipal.mostrarDades();
    }

    /**
     * Mètode principal del programa.
     * Crea un objecte Llibre i crida al mètode gestionarLlibre.
     *
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        Llibre llibrePrincipal = new Llibre("Tirant lo Blanc", "Joanot Martorell", 10, 19.95f);
        gestionarLlibre(llibrePrincipal, 3, 2);
    }
}

