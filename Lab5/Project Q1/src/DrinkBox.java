public class DrinkBox {
    private String name;
    private int price;
    private int amount;
    public DrinkBox(String name,int price,int amount){
        this.name = name ; this.price = price ; this.amount = amount;
    }
    public String getName(){
        return this.name;
    }
    public  int getPrice(){
        return this.price;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
}
