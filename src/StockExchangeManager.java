import java.io.*;
import java.util.HashMap;
import java.util.Map;

import frontend.start.*;
import backend.StocksDatabase;
import backend.StocksWalletsDatabase;
import backend.Transaction;
import backend.TransactionsHistoryDatabase;
import backend.UsersDatabase;

public class StockExchangeManager {
    public static void main(String[] args) {
        // Initialize databases
        UsersDatabase usersDatabase = UsersDatabase.getInstance();
        StocksDatabase stocksDatabase = StocksDatabase.getInstance();
        StocksWalletsDatabase walletsDatabase = StocksWalletsDatabase.getInstance();
        TransactionsHistoryDatabase transactionsDatabase = TransactionsHistoryDatabase.getInstance();

        // new Login().setVisible(true);

        // usersDatabase.printUsers();
        // stocksDatabase.printStocks();
        // walletsDatabase.printWallets();
        transactionsDatabase.printTransactions();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                usersDatabase.saveUsers();
                stocksDatabase.saveStocks();
                walletsDatabase.saveWallets();
                transactionsDatabase.saveTransactions();
            }
        });
    }
}
