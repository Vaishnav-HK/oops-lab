public class Login {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();
        login.setCredentials("admin", "1234");

        if (login.validate("admin", "1234")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}

class LoginSystem {
    private String username;
    private String password;

    public void setCredentials(String u, String p) {
        username = u;
        password = p;
    }

    public boolean validate(String inputUser, String inputPass) {
        return inputUser.equals(username) && inputPass.equals(password);
    }
}


