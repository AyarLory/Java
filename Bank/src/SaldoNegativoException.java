public class SaldoNegativoException extends Exception{
    public SaldoNegativoException(){
        super("Il conto non puo' essere inizializzato con saldo negativo!");
    }
    public SaldoNegativoException(String msg){
        super(msg);
    }
}
