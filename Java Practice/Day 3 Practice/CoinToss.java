import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        CoinToss oneCoin= new CoinToss();
        System.out.println(oneCoin.tossAcoin());
    }

    public String tossAcoin(){
        Random rand= new Random();
        int toss=Math.abs(rand.nextInt())%2;
        if(toss==0){return "Heads";}
        else{return "Tails";}
    }
}
