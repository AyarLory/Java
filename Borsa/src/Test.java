
public class Test {

    public static void main(String[] args) {

        // Creazione delle monete
        Coin c1 = new Coin(1.00, "1 euro");
        Coin c2 = new Coin(0.50, "50 centesimi");
        Coin c3 = new Coin(2.00, "2 euro");

        // Recupero delle informazioni
        System.out.println(c1.daiNome());
        System.out.println(c1.daiValore());

        // Creazione della borsa
        Purse borsa = new Purse();

        // Aggiunta delle monete
        borsa.add(c1);
        borsa.add(c1);
        borsa.add(c2);
        borsa.add(c3);

        // Verifica
        System.out.println("Totale: " + borsa.getTotal());
        System.out.println("Nella borsa ci sono: "+borsa.count(c1)+" monete da 1 euro");
        System.out.println("La moneta di valore massimo nella borsa vale: "+borsa.getMaximum().daiValore()+" euro");
        System.out.println("La moneta di valore minimo nella borsa vale: "+borsa.getMinimum().daiValore()+" euro");
        System.out.println("La moneta dal valore di 50 centesimi si trova nella posizione: "+borsa.find(c3));

        borsa.remove(c1);
        System.out.println("Nella borsa ci sono: "+borsa.count(c1)+" monete da 1 euro");

        }

    }

