
package controllers;

import cherryjava.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import models.*;

public class usersController {
    
    public void login(String loguser, String pass){
        usersModel model = new usersModel();
        boolean canlogin = true;
        String checkUser = " ";
        String checkPass = " ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(model.getUser(loguser));
            while (rs.next()) {
                checkUser = rs.getString("Username");
                checkPass = rs.getString("Password");
            }
            if(loguser.equals("admin") && pass.equals("admin")){
                new MedicineListsAdmin().setVisible(true);
                new Login().setVisible(false);
            }else if (!loguser.equals(checkUser)) {
                canlogin = false;
                JOptionPane.showMessageDialog(null, "Account doesn't exist!!!");
            } else if (!checkPass.equals(pass)) {
                canlogin = false;
                JOptionPane.showMessageDialog(null, "Invalid Password!!!");
            } else if (canlogin) {
                System.out.println("Welcome to Tambalan");
                new MedicineLists().setVisible(true);
                new Register().setVisible(false);
            }
            con.close();
        } catch (Exception e) {
            System.err.println("Got an exception here!");
            System.out.println(e.getMessage());
        }
    }
    
    public void register(String user, String pass, String Confirmpass, String name, String age){
        usersModel model = new usersModel();
        boolean canlogin = true;
        String checkUser = " ";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
//            Connection conn = con.dbConnect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(model.getUser(user));
            while (rs.next()) {
                checkUser = rs.getString("Username");
            }
            if (name.length() <= 2) {
                JOptionPane.showMessageDialog(null, "Name must be at least 2 letters");
                canlogin = false;
            } else if (pass.length() <= 6) {
                JOptionPane.showMessageDialog(null, "Password must be at least 8 letters long");
                canlogin = false;
            } else if (!pass.equals(Confirmpass)) {
                JOptionPane.showMessageDialog(null, "Password & Repeat Password must be the same!");
                canlogin = false;
            } else if (checkUser.equals(user)) {
                JOptionPane.showMessageDialog(null, "Account Aready Exist");
                canlogin = false;
            }

            if (canlogin) {
                st.executeUpdate(model.insertUser(name, age, user, pass, Confirmpass));
                System.out.println("Successfully Added");
                new Login().setVisible(true);
                new Register().setVisible(false);
            }
            con.close();
        } catch (Exception e) {
            System.err.println("Got an exception here!");
            System.out.println(e.getMessage());
        }
    }
}
