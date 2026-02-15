package biblioteca;
public class Llibre {

    String titol;
    String autor;
    int exemplars;
    float preu;

    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    public void prestarLlibre(int quantitat) throws Exception {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    public void mostrarDades() {
        System.out.println("Títol: " + titol);
        System.out.println("Autor: " + autor);
        System.out.println("Exemplars: " + exemplars);
        System.out.println("Preu: " + preu + " €");
    }
}
