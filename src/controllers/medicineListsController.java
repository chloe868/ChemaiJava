
package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.*;

public class medicineListsController {
    
    public void allergy(String comboBoxValue, JTable tab){
        medicineListsModel model = new medicineListsModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicine_app", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(model.showMed(comboBoxValue));

            DefaultTableModel tm = (DefaultTableModel) tab.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object table[] = {rs.getString("Classification"), rs.getString("MedicineName"), rs.getString("BrandName"), rs.getString("GenericName"), rs.getDouble("Price"), rs.getInt("Quantity")};
                tm.addRow(table);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
