package Programowanie.exersises;

import java.util.Random;
import java.util.Scanner;

public class exc1 {

    public enum States {
        INTO,
        PLAY,
        EXIT,
    }

    public static void main(String[] args) {

        States states = States.INTO;

        do {
            switch (states) {
                case INTO:
                    System.out.println("Welcome in the program");
                    System.out.println("What do you want to do?");
                    System.out.println("Press \"1\"  to play the game");
                    System.out.println("Press \"2\"  to exit the game");

                    Scanner scanner = new Scanner(System.in);
                    String decision = scanner.nextLine();

                    switch (decision) {
                        case "1":
                            states = States.PLAY;
                            break;
                        case "2":
                            states = States.EXIT;
                            break;
                    }
                    break;

                case PLAY:
                    System.out.println("The program will generate a number from 0 till 50");
                    Scanner scanner1 = new Scanner(System.in);
                    Random random = new Random();
                    int r = random.nextInt(50) + 1;
                    int t;
                    for (t = 1; t <= 5; t++) {
                        System.out.println("Insert a number: ");
                        int i = scanner1.nextInt();

                        if (i == r) {
                            System.out.println("Congratulations, you won!");
                        } else if (i > r) System.out.println("Too much");
                        else if (i < r) System.out.println("Too less");
                        else if (t == 5) {
                            System.out.println("You loose! \n");
                        }
                    }
                    System.out.println("What do you want to do now?");
                    System.out.println("Press \"1\" to play the game again");
                    System.out.println("Press \"2\" to exit the game");

                    String decision1 = scanner1.nextLine();
                    switch (decision1) {
                        case "1":
                            states = States.PLAY;
                            break;
                        case "2":
                            states = States.EXIT;
                            break;
                    }
            }
        } while (states != States.EXIT);
    }
}
