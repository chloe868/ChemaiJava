
package models;

public class medicineListsModel {
    
    public String showMed(String comboBoxValue){
        return "SELECT * FROM `MedicineLists` WHERE `Classification`='" + comboBoxValue + "'";
    }
}
