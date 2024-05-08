
import frontend.start.Login;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import backend.StocksDatabase;
import backend.StocksWalletsDatabase;
import backend.UsersDatabase;

public class StockExchangeManager {
    public static void main(String[] args) {
        // Initialize databases
        UsersDatabase usersDatabase = UsersDatabase.getInstance();
        StocksDatabase stocksDatabase = StocksDatabase.getInstance();
        StocksWalletsDatabase walletsDatabase = StocksWalletsDatabase.getInstance();

        // new Login().setVisible(true);

        usersDatabase.printUsers();
        // stocksDatabase.printStocks();
        // walletsDatabase.printWallets();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                usersDatabase.saveUsers();
                stocksDatabase.saveStocks();
                walletsDatabase.saveWallets();
            }
        });
    }
}
