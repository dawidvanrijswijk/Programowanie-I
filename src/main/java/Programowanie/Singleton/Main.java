package Programowanie.Singleton;

import java.util.Scanner;

public class Main {
    public enum State {
        START,
        LOGGED_IN,
        STOP
    }

    public static State handleStart() {
        Scanner scanner = KeyboardReader.getInstance();

        System.out.println("Podaj hasło");
        String password = scanner.nextLine();
        if (password.equals("123")) {
            return State.LOGGED_IN;
        } else {
            return State.START;
        }
    }

    public static State handleLoggedIn() {
        Scanner scanner = KeyboardReader.getInstance();

        System.out.println("Którą książkę chcesz wypożyczyć? (podaj index)");
        int index = scanner.nextInt();

        BooksRegistry booksRegistry = BooksRegistry.getInstance();

        booksRegistry.borrow(index);

        return State.LOGGED_IN;
    }

    public static void main(String[] args) {
        State state = State.START;
        BooksRegistry booksRegistry = BooksRegistry.getInstance();
        booksRegistry.add(new Book("Pan Tadeusz", "Adam Mickiewicz"));

        while (true) {
            switch (state) {
                case START: {
                    state = handleStart();
                    break;
                }

                case LOGGED_IN: {
                    state = handleLoggedIn();
                    break;
                }
            }
        }
    }
}