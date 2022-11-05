package Verification;

public class Data {
    private static final String VALID_CHARACTERS = "abcdefghijklmnopgrstuvwxyzABCDEFGHIJKLMNOPGRSTUVWXYZ0123456789_";

    public Data() {
    }

    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongPasswordException | WringLoginException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WringLoginException {
        if (!validate(login)) {
            throw new WrongPasswordException("Не корректный логин!");
        }
        if (!validate(password)) {
            throw new WringLoginException("Не корректный пароль!");
        }
        if(!password.equals(confirmPassword)){
            throw new WringLoginException("Пароли не совпадают!!");
        }
    }

    private static boolean validate(String s) {
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}