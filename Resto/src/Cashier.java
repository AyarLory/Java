/* ◼ Scrivere un programma che calcoli il resto in monete (2 euro, 1 euro, 50/100, 20/100, 10/100, 5/100, 2/100, 1/100)
della somma corrisposta dal cliente
❑ L’input è costituito da due importi:
il prezzo da pagare e la somma corrisposta dal cliente
❑ Il resto dato deve privilegiare le monete di maggior valore
❑ Definire una classe Cashier con i metodi setAmountDue, receive e i vari resti per moneta
Es. return2Euro, return1Euro, etc.
*/

import java.util.Scanner;

public class Cashier {
    private int amountDue;
    private int amountReceived;

    public void setAmountDue(double amount){
        amountDue = (int) Math.round(amount * 100);
    }

    public void receive(double amount){
        amountReceived = (int) Math.round(amount * 100);
    }

    private int change(){
        return amountReceived - amountDue;
    }

    public int return2Euro(){
        return change()/200;
    }
    public int return1Euro(){
        return (change() % 200)/100;
    }
    public int return50Cent(){
        return (change() % 100)/50;
    }
    public int return20Cent(){
        return (change() % 50)/20;
    }
    public int return10Cent(){
        return (change() % 20)/10;
    }
    public int return5Cent(){
        return (change() % 10)/5;
    }
    public int return2Cent(){
        return (change() % 5)/2;
    }
    public int return1Cent(){
        return (change() % 2);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Cashier cashier = new Cashier();
        System.out.println("Inserire l'importo dovuto: ");
        double prezzo = input.nextDouble();
        System.out.println("Inserire l'importo versato: ");
        double pagato = input.nextDouble();
        cashier.setAmountDue(prezzo);
        cashier.receive(pagato);

        System.out.println("\nResto: ");

        System.out.println("2 euro: " + cashier.return2Euro());
        System.out.println("1 euro: " + cashier.return1Euro());
        System.out.println("50 cent: " + cashier.return50Cent());
        System.out.println("20 cent: " + cashier.return20Cent());
        System.out.println("10 cent: " + cashier.return10Cent());
        System.out.println("5 cent: " + cashier.return5Cent());
        System.out.println("2 cent: " + cashier.return2Cent());
        System.out.println("1 cent: " + cashier.return1Cent());

        input.close();
    }
}
