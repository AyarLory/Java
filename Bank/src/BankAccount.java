public class BankAccount implements Cloneable {
    // Variabile statica (condivisa tra tutti gli oggetti) per generare i numeri di conto
    private static int counter = 1000;

    // variabili d'istanza
    private Cliente titolare;
    private int accountNumber;
    private double balance;

    // Costruttore
    public BankAccount(double initialBalance, Cliente titolare)
    throws SaldoNegativoException{
        if(initialBalance < 0)
            throw new SaldoNegativoException();
        assert titolare != null : "Il titolare del conto deve esistere!";

        this.accountNumber = counter++; // Assegna il numero attuale e poi incrementa il contatore
        this.balance = initialBalance;
        this.titolare = titolare;
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Cliente getTitolare() {
        return titolare;
    }

    // metodi per operazioni
    // deposito
    public void deposit(double amount) {
        if(amount < 0)
        throw new SaldoVersatoException();
        this.balance += amount;
    }

    // prelievo
    public void withdraw(double amount) {
        if(amount<0 || amount>this.balance)
            throw new SaldoPrelevatoException();
        this.balance -= amount;
    }

    // toString per stampare facilmente i conti
    @Override
    public String toString() {
        return "Conto #" + accountNumber + " | Intestatario: " + titolare.getName() + " | Saldo: " + balance;
    }

    // override metodo equals
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;

        if(obj == null || getClass() != obj.getClass()) return false;

        BankAccount other = (BankAccount) obj;

        return this.titolare.equals(other.titolare) && this.accountNumber == other.accountNumber && Double.compare(this.balance, other.balance) == 0;
    }

    // override clone
    @Override
    public BankAccount clone(){
        try{
            return (BankAccount) super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new AssertionError("Impossibile eseguire clonazione!");
        }
    }
}