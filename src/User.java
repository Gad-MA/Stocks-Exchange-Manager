/**
 * User
 */
public class User {
    String name;
    String username;
    String password;
    StocksWallet stocksWallet;
    CashWallet cashWallet;

    User() {
    }

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    void create() {
        UsersDB.users.add(this);
        UsersDB.saveToCSV("users.csv");
    }

    void delete() {
    }

    void login() {
        boolean found = false;
        for (User u : UsersDB.users) {
            if (username == u.username && password == u.password) {
                found = true;
                System.out.println("Login Success");
            } 
        }

        if(!found) {
            System.out.println("User not found, try signing up");
            signUp();
        }
    }

    void signUp() {
        create();
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password=" + password + "}";
    }
}