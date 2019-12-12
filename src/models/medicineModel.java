/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 2ndyrGroupB
 */
public class medicineModel {
    
    public String addMed(String classify, String medicineName, String genericName, String brandName, String pr, String quantity){
        return String.format("INSERT INTO medicine_app(Classification, MedicineName, BrandName,"
                + " GenericName, Price, Quantity) VALUES('%s', '%s', '%s', '%s', '%d','%d')",
                classify, medicineName, genericName, brandName, Integer.parseInt(pr), Integer.parseInt(quantity));
    }
    
    public String fetchAllMed(){
        return "SELECT MedicineName from medicinelists";
    }
    
    public String deleteMed(String medicine){
        return String.format("DELETE FROM medicinelists WHERE MedicineName='%s'", medicine);
    }
}
