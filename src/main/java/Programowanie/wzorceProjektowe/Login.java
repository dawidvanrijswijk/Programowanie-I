package Programowanie.wzorceProjektowe;

public class Login {
    private final String LOGIN = "dawidvanrijswijk";
    private final String PASSWORD = "Qua16op99%";

    public boolean getAccess(String login, String password) {
        return login.equals(LOGIN) && password.equals(PASSWORD);
    }
}