public class Rettangolo {

    private Punto puntoIniziale;
    private float larghezza;
    private float altezza;

    public Rettangolo(Punto puntoIniziale, float larghezza, float altezza) {
        this.puntoIniziale = puntoIniziale;
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    public Punto getPuntoIniziale() {
        return puntoIniziale;
    }

    public void setPuntoIniziale(Punto puntoIniziale) {
        this.puntoIniziale = puntoIniziale;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(float larghezza) {
        this.larghezza = larghezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float calcolaArea() {
        return larghezza * altezza;
    }

    public float calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }

    public void stampaRettangolo() {
        System.out.println("Rettangolo:");
        System.out.println("Punto iniziale: ("
                + puntoIniziale.getX() + ", "
                + puntoIniziale.getY() + ")");

        System.out.println("Larghezza: " + larghezza);
        System.out.println("Altezza: " + altezza);
        System.out.println("Area: " + calcolaArea());
        System.out.println("Perimetro: " + calcolaPerimetro());
    }
}