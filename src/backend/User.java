package backend;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

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