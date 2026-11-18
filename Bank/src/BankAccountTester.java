import java.util.Scanner;

public class BankAccountTester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inserimento dati cliente
        System.out.print("Inserisci il nome del cliente: ");
        String nome = input.nextLine();

        System.out.print("Inserisci la via: ");
        String via = input.nextLine();

        System.out.print("Inserisci il numero civico: ");
        int civico = input.nextInt();
        input.nextLine();

        System.out.print("Inserisci la città: ");
        String citta = input.nextLine();

        System.out.print("Inserisci il CAP: ");
        int cap = input.nextInt();

        Indirizzo indirizzo = new Indirizzo(via, civico, citta, cap);
        Cliente titolare = new Cliente(nome, indirizzo);

        // Inserimento saldo iniziale
        System.out.print("Inserisci il saldo iniziale: ");
        double saldo = input.nextDouble();

        try {
            BankAccount conto = new BankAccount(saldo, titolare);

            System.out.println("\nConto creato:");
            System.out.println(conto);

            // Deposito
            System.out.print("\nInserisci l'importo da depositare: ");
            double deposito = input.nextDouble();

            try {
                conto.deposit(deposito);
                System.out.println("Saldo dopo il deposito: " + conto.getBalance());
            }
            catch (SaldoVersatoException e) {
                System.out.println("Errore: importo da depositare non valido!");
            }

            // Prelievo
            System.out.print("\nInserisci l'importo da prelevare: ");
            double prelievo = input.nextDouble();

            conto.withdraw(prelievo);

            System.out.println("Saldo dopo il prelievo: " + conto.getBalance());

        }
        catch (SaldoNegativoException e) {
            System.out.println("Errore: saldo iniziale negativo!");
        }

        input.close();
    }
}
