
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

public class purchaseCotroller {
    List med = new ArrayList();
    
    public void order(String MedicineOrder, String Quantity){
        purchaseModel model = new purchaseModel();
        medicineModel mod = new medicineModel();
        String id = null;
        String CheckMedname = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
            Statement st = con.createStatement();
            ResultSet rsAcc = st.executeQuery(model.getId(MedicineOrder));
            rsAcc.next();
            id = rsAcc.getString("IDMed");

            ResultSet rs = st.executeQuery(mod.fetchAllMed());
            while (rs.next()) {
                CheckMedname = rs.getString("MedicineName");
                med.add(CheckMedname);
            }
            if (med.contains(MedicineOrder)) {
                st.executeQuery(model.insertMed(id, Quantity));
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
