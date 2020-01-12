package Model;

public class Cock extends Shopping{
    private int price = 5;
    private int amount;
    private int total=0;
    public Cock(int amount){
        this.amount = amount;
    }

    public int buy(){
        total = (price*amount);
        System.out.println(total);
        return total;
    }


}
