package Programowanie.wzorceProjektowe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    private Scanner scanner;
    private String userLogin;
    private BookService bookService;
    private State state;

    private enum State {
        START, LOGGED_IN, STOP
    }

    public Application() {
        state = State.START;
        scanner = new Scanner(System.in);
        bookService = new BookService();
    }

    public void runApplication() {
        while (true) {
            switch (state) {
                case START: {
                    System.out.println(Messages.GET_LOGIN_DATA);
                    state = logStage();
                    break;
                }
                case LOGGED_IN: {
                    state = menuStage();
                    break;
                }
                case STOP: {
                    System.out.println(Messages.LEAVE + ", " + userLogin);
                    return;
                }
            }
        }
    }

    private State logStage() {
        if (!logUser()) {
            System.out.println(Messages.LOGIN_ERROR);
            return State.START;
        } else {
            System.out.println(Messages.WELCOME + ", " + userLogin);
            return State.LOGGED_IN;
        }
    }

    private boolean logUser() {
        System.out.println(Messages.LOGIN);
        String login = scanner.next();
        System.out.println(Messages.PASSWORD);
        String password = scanner.next();
        if (new Login().getAccess(login, password)) {
            userLogin = login;
            return true;
        } else {
            return false;
        }
    }

    private State menuStage() {
        printMenu();

        int menuInt;
        try {
            menuInt = scanner.nextInt();
        } catch (InputMismatchException inms) {
            System.out.println(Messages.WRONG_MENU_NUMBER);
            return State.LOGGED_IN;
        }

        switch (menuInt) {
            case 1:
                printBooks();
                break;
            case 2:
                getBook();
                break;
            case 3:
                return State.STOP;
        }
        return State.LOGGED_IN;
    }

    private void printMenu() {
        System.out.println();
        System.out.println(Messages.WHAT_TO_DO);
        System.out.println(Messages.MENU);
    }

    private void printBooks() {
        System.out.println();
        System.out.println(Messages.AVAILABLE_BOOKS);
        bookService.getBooks().forEach(System.out::println);
    }

    private void getBook() {
        System.out.println();
        System.out.println(Messages.GET_BOOK_ID);
        int bookId;

        try {
            bookId = scanner.nextInt();
            System.out.println(Messages.LOANED_BOOK + " " + bookService.getBook(bookId).toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException i) {
            System.out.println(Messages.WRONG_MENU_NUMBER);
        }
    }
}