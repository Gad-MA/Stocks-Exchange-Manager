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

    static void create(String username, String password) {
        User user = new User(username, password);
        UsersDB.users.add(user);
        UsersDB.saveToCSV();
    }

    void delete() {
    }

    public static boolean login(String username, String password) {
        boolean found = false;
        for (User u : UsersDB.users) {
            if (username == u.username && password == u.password) { // TODO: use string comparison for username and
                                                                    // password
                found = true;
                System.out.println("Login Success");
                return true;
            }
        }

        System.out.println("User not found, try signing up");
        signUp(username, password);
        return false;
    }

    public static void signUp(String username, String password) {
        create(username, password);
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password=" + password + "}";
    }
}