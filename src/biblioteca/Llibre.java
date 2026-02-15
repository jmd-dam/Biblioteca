package biblioteca;

/**
 * Classe que representa un llibre dins d'una biblioteca.
 * <p>
 * Permet gestionar les dades bàsiques d'un llibre, així com
 * les operacions de préstec i retorn d'exemplars.
 * </p>
 *
 * @author Javier
 * @version 1.0
 */
public class Llibre {

    /** Títol del llibre. */
    private String titol;

    /** Autor del llibre. */
    private String autor;

    /** Nombre d'exemplars disponibles. */
    private int exemplars;

    /** Preu del llibre en euros. */
    private float preu;

    /**
     * Constructor de la classe Llibre.
     *
     * @param titol     Títol del llibre.
     * @param autor     Autor del llibre.
     * @param exemplars Nombre d'exemplars disponibles.
     * @param preu      Preu del llibre en euros.
     */
    public Llibre(String titol, String autor, int exemplars, float preu) {
        this.titol = titol;
        this.autor = autor;
        this.exemplars = exemplars;
        this.preu = preu;
    }

    /**
     * Obté el títol del llibre.
     *
     * @return El títol del llibre.
     */
    public String getTitol() {
        return titol;
    }

    /**
     * Estableix el títol del llibre.
     *
     * @param titol El nou títol del llibre.
     */
    public void setTitol(String titol) {
        this.titol = titol;
    }

    /**
     * Obté l'autor del llibre.
     *
     * @return L'autor del llibre.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Estableix l'autor del llibre.
     *
     * @param autor El nou autor del llibre.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obté el nombre d'exemplars disponibles.
     *
     * @return El nombre d'exemplars disponibles.
     */
    public int getExemplars() {
        return exemplars;
    }

    /**
     * Estableix el nombre d'exemplars disponibles.
     *
     * @param exemplars El nou nombre d'exemplars.
     */
    public void setExemplars(int exemplars) {
        this.exemplars = exemplars;
    }

    /**
     * Obté el preu del llibre.
     *
     * @return El preu del llibre en euros.
     */
    public float getPreu() {
        return preu;
    }

    /**
     * Estableix el preu del llibre.
     *
     * @param preu El nou preu del llibre en euros.
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     * Presta una quantitat determinada d'exemplars del llibre.
     * <p>
     * Redueix el nombre d'exemplars disponibles en la quantitat indicada.
     * Si no hi ha prou exemplars, llança una excepció.
     * </p>
     *
     * @param quantitat Nombre d'exemplars a prestar.
     * @throws Exception Si no hi ha prou exemplars disponibles.
     */
    public void prestarLlibre(int quantitat) throws Exception {
        if (exemplars >= quantitat) {
            exemplars -= quantitat;
            System.out.println("S'han prestat " + quantitat + " exemplars.");
        } else {
            throw new Exception("No hi ha prou exemplars disponibles.");
        }
    }

    /**
     * Retorna una quantitat determinada d'exemplars del llibre.
     * <p>
     * Augmenta el nombre d'exemplars disponibles en la quantitat indicada.
     * </p>
     *
     * @param quantitat Nombre d'exemplars a retornar.
     */
    public void retornarLlibre(int quantitat) {
        exemplars += quantitat;
        System.out.println("S'han retornat " + quantitat + " exemplars.");
    }

    /**
     * Mostra per consola les dades del llibre: títol, autor,
     * nombre d'exemplars i preu.
     */
    public void mostrarDades() {
        System.out.println("Títol: " + titol);
        System.out.println("Autor: " + autor);
        System.out.println("Exemplars: " + exemplars);
        System.out.println("Preu: " + preu + " €");
    }
}

