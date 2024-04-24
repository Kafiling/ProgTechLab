public class Card {
    private int cardID;
    private int amount;
    private static int count;
    private static final int MINVALUE = 10;
    public Card(int inputAmount) {
        if(inputAmount >= MINVALUE){
            count++;
            cardID = count;
            amount = inputAmount;
        }
    }
    public int getAmount(){
        return amount;
    }
    public int getCardID(){
        return cardID;
    }
    public void addMoney(int amount){
        this.amount += amount;
    }
    public boolean pay(int amount){
        if(this.amount - amount >= MINVALUE){
            this.amount = this.amount - amount;
            return true;
        }
        else{
            return false;
        }
    }

}
