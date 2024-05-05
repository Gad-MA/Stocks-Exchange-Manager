package backend;

/**
 * User
 */
public class User {
    static int idGen = 0;
    int id;
    String name;
    String username;
    String password;
    StocksWallet stocksWallet;
    CashWallet cashWallet;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = idGen++;
    }

    public void buy(Stock stock) {
        stock.changeOwner(this.id);
    }

    public void sell(Stock stock) {

    }

    void create() {
        UsersDB.users.add(this);
        UsersDB.saveToCSV();
    }

    void delete() {
    }

    public void login() {
        boolean found = false;
        for (User u : UsersDB.users) {
            if (username == u.username && password == u.password) { // TODO: use string comparison for username and password
                found = true;
                System.out.println("Login Success");
            }
        }

        if (!found) {
            System.out.println("User not found, try signing up");
            signUp();
        }
    }

    public void signUp() {
        create();
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password=" + password + "}";
    }
}