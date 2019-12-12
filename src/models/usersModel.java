
package models;

public class usersModel {
    
    public String getUser(){
        return "SELECT * FROM `Users`";
    }
    
    public String insertUser(String name, String age, String user, String pass, String Confirmpass){
        return ("INSERT INTO Users(Name, Age, Username, Password, ConPassword)" + "VALUES('" + name + "','" + Integer.parseInt(age) + "','" + user + "','" + pass + "','" + Confirmpass + "')");
    }
}
