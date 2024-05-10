package backend;

import java.io.*;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String username;
    protected String password;

    public User(){}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}