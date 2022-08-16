package Tutorium3;

public class RmwRaceCondition2 {
    public static int counter = 0;


    public static synchronized void incrementAndPrint(String name) {

        System.out.println(name + " reads counter: " + RmwRaceCondition.counter);
        int count = RmwRaceCondition.counter;
        RmwRaceCondition.counter = count + 1;
        System.out.println(name + " increased counter: " + RmwRaceCondition.counter);}



    public static void main(String[] args) {
        for (int i=0; i < 25; i++) {
            new AdderThread().start();
        }
    }
}
