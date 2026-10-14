public class Coin { //Una semplice classe Coin

    public Coin(double unValore, String unNome) {
        nome = unNome;
        valore = unValore;
    }

    public String daiNome() { return nome; }
    public double daiValore(){ return valore; }
    public double getValue(){ return valore; }
    public boolean equals(Coin moneta){
        return nome.equals(moneta.daiNome());
    }

    private String nome;
    private double valore;
}