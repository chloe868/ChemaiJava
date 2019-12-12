
package controllers;

import cherryjava.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.*;

public class medicineController {
    List med = new ArrayList();
    
    public void addMed(String classify, String medicineName, String genericName, String brandName, String quantity, String pr){
        medicineModel model = new medicineModel();
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
            Statement st = con.createStatement();
            if(classify.equalsIgnoreCase("Cough") || classify.equalsIgnoreCase("Allergy") || classify.equalsIgnoreCase("BodyPain") || classify.equalsIgnoreCase("Headache")){
                ResultSet rs = st.executeQuery(model.fetchAllMed());
                while(rs.next()){
                    String getMed = rs.getString("MedicineName");
                    med.add(getMed);
                }
                if(!med.contains(medicineName)){
                    st.executeQuery(model.addMed(classify, medicineName, genericName, brandName, pr, quantity));
                    new MedicineListsAdmin().setVisible(true);
//                    this.setVisible(false);
                    con.close();
                    med.clear();
                }else{
                    JOptionPane.showMessageDialog(null, "Medicine name already exist");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Medicine is nowhere to find");
            }
        } catch (Exception e) {
            System.err.println("Got an exception here!");
            System.out.println(e.getMessage());
        }
    }
    
    public void delMed(String medicine){
        medicineModel model = new medicineModel();
        String id = null;
        String CheckMedname = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(model.fetchAllMed());
            while (rs.next()) {
                CheckMedname = rs.getString("MedicineName");
                med.add(CheckMedname);
            }
            if (med.contains(medicine)) {
                st.executeQuery(model.deleteMed(medicine));
                con.close();
                new MedicineLists().setVisible(true);
//                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Medicine is nowhere to find");
            }

        } catch (Exception e) {
            System.err.println("Got an exception here!");
            System.out.println(e.getMessage());
        }
    }
}
