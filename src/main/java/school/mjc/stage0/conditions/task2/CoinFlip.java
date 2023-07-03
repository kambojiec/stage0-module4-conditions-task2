package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        if(from1UpTo1000 < 500 && from1UpTo1000 > 0){
            System.out.print("Eagle");
        } else {
            System.out.print("Tail");
        }
    }
}
