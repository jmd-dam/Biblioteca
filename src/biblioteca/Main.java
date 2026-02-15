package biblioteca;
public class Main {
    public static void main(String[] args) {
        gestionarLlibre();
    }

    private static void gestionarLlibre() {
        Llibre elMeuLlibre = new Llibre("Tirant lo Blanc", "Joanot Martorell", 10, 19.95f);

        elMeuLlibre.mostrarDades();
        System.out.println();
        try {
            elMeuLlibre.prestarLlibre(3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        elMeuLlibre.retornarLlibre(2);
        System.out.println();
        elMeuLlibre.mostrarDades();
    }
}
