package backend;


import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        UsersDB.initialize();
        StocksDB.initialize();

        Stock st = new Stock("nas", 100, UsersDB.users.get(0).id);
        System.out.println(st);
        st.changePrice(200);
        System.out.println(st);
    }
}