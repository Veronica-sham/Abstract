package Model;

public class hen extends Shopping {
        private int price = 3;
        private int amount;
        private int total = 0;
        public hen(int amount){
            this.amount = amount;
        }

        public int buy(){
            total = (price*amount);
            System.out.println(total);
            return total;
        }

    }


