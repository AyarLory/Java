import java.util.ArrayList;
public class Purse{
    public Purse(){
        coins = new ArrayList<Coin>();
        total = 0;
    }

    public void add(Coin aCoin){
        coins.add(aCoin);
        total += aCoin.getValue();
    }

    public double getTotal(){
        return total;
    }

    public int count(Coin aCoin)
    {
        int matches = 0;
        for (Coin c: coins)
        {
            if (c.equals(aCoin))
                matches++;

    //found a match

        }
        return matches;
    }

    public Coin getMaximum() {
        if (coins.isEmpty()) {
            return null;
        }

        Coin max = coins.get(0);

        for (Coin c : coins) {
            if (c.daiValore() > max.daiValore()) {
                max = c;
            }
        }

        return max;
    }

    public Coin getMinimum() {
        if (coins.isEmpty()) {
            return null;
        }

        Coin min = coins.get(0);

        for (Coin c : coins) {
            if (c.daiValore() < min.daiValore()) {
                min = c;
            }
        }

        return min;
    }

    public int find(Coin aCoin){
        for(int i = 0; i < coins.size(); i++){
            if(coins.get(i).getValue() == aCoin.getValue()) //found a match
                return i;
        }
        return -1;
    }

    public void remove(Coin aCoin) {
        int i = find(aCoin);

        if (i != -1) {
            Coin rimossa = coins.remove(i);
            total -= rimossa.getValue();
        }
    }

    private ArrayList<Coin> coins;
    private double total;
}