public class SaldoVersatoException extends RuntimeException{
    public SaldoVersatoException(){
        super("Non puoi versare saldo negativo!");
    }
    public SaldoVersatoException(String msg){
        super(msg);
    }
}
