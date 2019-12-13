
package models;

public class usersModel {
    
    public String getUser(String user){
        return String.format("SELECT Username, Password FROM `users` WHERE Username='%s'", user);
    }
    
    public String insertUser(String name, String age, String user, String pass, String Confirmpass){
        return ("INSERT INTO users(Name, Age, Username, Password, ConPassword)" + "VALUES('" + name + "','" + Integer.parseInt(age) + "','" + user + "','" + pass + "','" + Confirmpass + "')");
    }
}
