package Model;

public class Chicken extends Shopping{
    int price = 3;
    private int amount;
    private int total=0;
    public Chicken(int amount){
        this.amount = amount;
    }

    public int buy(){
        total =(price*amount);
        System.out.println(total);
        return total;
    }

    }

