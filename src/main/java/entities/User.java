package entities;


/**
 * Created by nazarenkod on 10-Jul-17.
 */

public class User {

    private String login;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    private String password;


    public String getLogin() {
        return login;
    }

    public String getPassword() {return password;}


}
