package Day4SnakeLadderProgram;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("The player rolls the die to get a number between 1 to 6.");
        Random rand = new Random();
        int Roll = rand.nextInt(7);
        System.out.println("The dice rolls to : "+Roll);
    }
}
