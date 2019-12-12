
package models;

public class purchaseModel {
    
    public String insertMed(String id, String Quantity){
        return ("INSERT INTO tblPurchase(IDMed, Quantity)" + "VALUES('" + "','" + Integer.parseInt(id) + "','" + Integer.parseInt(Quantity) + "')");
    }
    
    public String getId(String MedicineOrder){
        return String.format("SELECT IDMed FROM tblPurchase WHERE MedicineName='%s'", MedicineOrder);
    }
    
    
}
