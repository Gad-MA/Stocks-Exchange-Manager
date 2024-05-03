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
    }

    void delete() {
    }

    void login() {
    }

    void signUp() {
        create();
    }
}