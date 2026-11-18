public class SaldoPrelevatoException extends RuntimeException{
    public SaldoPrelevatoException(){
        super("Non puoi prelevare una somma inferiore a 0 o che superi il tuo attuale saldo!");
    }
    public SaldoPrelevatoException(String msg){
        super(msg);
    }
}
