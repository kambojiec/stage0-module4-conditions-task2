package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if(first > second || second > first){
            if(first > second){
            System.out.print(first);}else
            {
                System.out.print(second);
            }
        } else if (first == second) {
            System.out.print(second);
        }
    }
}
