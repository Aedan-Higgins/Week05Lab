/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author 789648
 */
public class AccountHandler { // I know this doesn't count as a bean, I'm just too lazy to change the package name
    private String[] usernames = {"abe","barb"};
    private String[] passwords = {"password","password"};
// guess we'll call this simluating a database, even though this would be god awful code for a login system
    public AccountHandler(){ 
        // something something database stuff goes here
    }
    public String login(String user, String pass) {
        for (int i = 0;i != usernames.length;++i) {
            if (usernames[i] == user && passwords[i] == pass) {
                return user;
            }
        }
        return "Invalid Username or Password";
    }
}
