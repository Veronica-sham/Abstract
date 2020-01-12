package Model;

import java.util.Random;

public class test {
    public static void main(String args[]) {
        int count ;
        int money = 100;
        int n1=0;
        int n2=0;
        int n3=0;
        for(count = 0;(money!=0)||(n1==0)||(n2==0)||(n3==0);count++){

            Random r = new Random();
            n1 = r.nextInt(100);
            n2 = r.nextInt(100-n1);
            n3 = r.nextInt(100-n1-n2);
            money = 100;
            Shopping cock= new Cock(n1);
            Shopping hen= new hen(n2);
            Shopping chic= new Chicken(n3);
            money = money - (cock.buy()+hen.buy()+chic.buy());
        }

        System.out.println("Number of Cock: "+n1+"\nNumber of hen: "+n2+"\nNumber of Chicken: "+n3+"\nMoney left: "+money);


    }

}
