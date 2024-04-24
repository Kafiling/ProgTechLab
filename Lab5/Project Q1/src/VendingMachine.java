import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private ArrayList<DrinkBox> drinkList = new ArrayList<DrinkBox>();
    private ArrayList<CoinBox> coinList = new ArrayList<CoinBox>();
    private int revenue;
    private int totalCoinValue;
    public VendingMachine() {
        drinkList.add(new DrinkBox("Coke", 13, 2));
        drinkList.add(new DrinkBox("Sprit", 13, 2));
        drinkList.add(new DrinkBox("GreenTea", 20, 2));
        drinkList.add(new DrinkBox("Water", 10, 2));
        drinkList.add(new DrinkBox("MinuteMaid", 18, 2));
        drinkList.add(new DrinkBox("Pepsi", 13, 2));
        drinkList.add(new DrinkBox("Vitamilk", 15, 2));
        drinkList.add(new DrinkBox("RootBeer", 13, 2));
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
        setTotalCoinValue();
    }
    public String buy(String name, Card c) {
        //enter your code here
        if(c.getCardID() > 100 ){
            return "Invalid card";
        }
        boolean vaildDrink = false;
        DrinkBox drinkBox = drinkList.get(0);
        for(DrinkBox drink:drinkList){
            if(drink.getName().equals(name)){
                vaildDrink = true;
                drinkBox = drink;
                break;
            }
        }
        if(vaildDrink){
            if(drinkBox.getAmount() >= 1 && c.getAmount()>=drinkBox.getPrice()+10){
                drinkBox.setAmount(drinkBox.getAmount()-1);
                c.pay(drinkBox.getPrice());
                revenue += drinkBox.getPrice();
                return "Thank you";
            }
            else if(drinkBox.getAmount() < 1){
                return "Out of stock";
            }
            else if(c.getAmount() < drinkBox.getPrice()+10){
                return "Not enough money";
            }

        }
            return "Drink not found";
    }
    public void endOfDayProcess() {
        //enter your code here
        for(DrinkBox drink:drinkList){
            drink.setAmount(2);
        }
        coinList.clear();
        coinList.add(new CoinBox(1, 20));
        coinList.add(new CoinBox(2, 20));
        coinList.add(new CoinBox(5, 10));
        coinList.add(new CoinBox(10, 0));
        revenue = 0;
    }
    public int getRevenue() {
        //enter your code here
        return revenue;
    }
    public String getDrinkDetail() {
        //enter your code here
        String str = "**********************\n";
        for(DrinkBox drink:drinkList){
            str += drink.getName()+" "+drink.getPrice()+" "+drink.getAmount()+"\n";
        }
        return str;
    }
    public String buy(String name, ArrayList<Integer> coinValue) {
        //add this overloaded method
        //NOTE : In tester, coin type is assign based on index (0 for 1 thb, 1 for 2 Thb and so on...)
        boolean vaildDrink = false;
        int sumCoinInput = 0;
        DrinkBox drinkBox = drinkList.get(0);
        for(DrinkBox drink:drinkList){
            if(drink.getName().equals(name)){
                vaildDrink = true;
                drinkBox = drink;
                break;
            }
        }
        sumCoinInput += coinValue.get(0);
        sumCoinInput += coinValue.get(1)*2;
        sumCoinInput += coinValue.get(2)*5;
        sumCoinInput += coinValue.get(3)*10;
        coinList.get(0).setAmount(coinList.get(0).getAmount()+coinValue.get(0));
        coinList.get(1).setAmount(coinList.get(1).getAmount()+coinValue.get(1));
        coinList.get(2).setAmount(coinList.get(2).getAmount()+coinValue.get(2));
        coinList.get(3).setAmount(coinList.get(3).getAmount()+coinValue.get(3));
        System.out.println("10thb" +  coinList.get(3).getAmount());
        if(vaildDrink){
            if(sumCoinInput >= drinkBox.getPrice() && drinkBox.getAmount() >= 1){
                if(totalCoinValue >= (sumCoinInput - drinkBox.getPrice())){
                    drinkBox.setAmount(drinkBox.getAmount()-1);
                    System.out.println(calcChange(sumCoinInput - drinkBox.getPrice()));
                    revenue += drinkBox.getPrice();
                    return "Thank you";
                }
                else if (totalCoinValue < (sumCoinInput - drinkBox.getPrice()) || calcChange(sumCoinInput - drinkBox.getPrice()).equals("False")) {
                    return "Cannot give change";
                }
            }
            else if(drinkBox.getAmount() < 1){
                return "Out of stock";
            }
            else if(sumCoinInput < drinkBox.getPrice()){
                return "Not enough money";
            }
        }
        return "Drink not found";
    }

    public String toString() {
        //add this method
        String str = "**********************\n";
        for(DrinkBox drink:drinkList){
            str += drink.getName()+" "+drink.getPrice()+" "+drink.getAmount()+"\n";
        }
        str += "\n";
        str += "CoinBox";
        for(CoinBox coin:coinList){
            str += coin.getValue()+" "+coin.getAmount()+"\n";
        }
        return str;
    }

    public void setTotalCoinValue(){
        for(CoinBox coin:coinList){
            totalCoinValue += coin.getAmount()*coin.getValue();
        }
    }

    public String calcChange(int changeAmount){
        String str = "\nChange :\n";
        for (int i = 3; i >= 0 ; i--) {
            System.out.println(i);
            if(changeAmount>0){

                int coinNum = Math.floorDiv(changeAmount,coinList.get(i).getValue()) ;
                if(coinNum > coinList.get(i).getAmount()){
                    coinNum = coinList.get(i).getAmount();
                }
                str += coinList.get(i).getValue() +" THB Coin : "+ coinNum + " Coin\n";
                changeAmount -= coinNum*coinList.get(i).getValue();
                coinList.get(i).setAmount(coinList.get(i).getAmount() - coinNum);
            }

        }
            if(changeAmount != 0){
                System.out.println(changeAmount);
                str = "False";
            }
            if(str.equals("\nChange :\n")){
                str = "\nChange : None\n";
            }


        return str;
    }

    public ArrayList<Integer> InputCoin(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 1 THB coin(s):");
        arr.add(scanner.nextInt());
        System.out.println("Insert 2 THB coin(s):");
        arr.add(scanner.nextInt());
        System.out.println("Insert 5 THB coin(s):");
        arr.add(scanner.nextInt());
        System.out.println("Insert 10 THB coin(s):");
        arr.add(scanner.nextInt());
        return arr;
    }

 }