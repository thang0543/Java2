package edu.poly.thangdtph27626;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ListEmpolee {

    private int index = 0;
    private List<Employee> list = new ArrayList<>();
    private String path = "C:\\Users\\LENOVO\\Desktop";
    
    public void saveFile(){
        try {
            XFile.ObjectWrite(path);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListEmpolee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void loadFile(){
       list = (List<Employee>) XFile.ObjectRead(path);
    }
    public void initTable(DefaultTableModel model){
        model.setRowCount(0);
        
        for(Employee em : list){
          Object[] row = new Object[]{
              em.getId(),em.getFullName(),em.getAge(),em.getEmail(),em.getWage()
          };
          model.addRow(row);
        }
        model.fireTableDataChanged();
    }
    public void addEmployee(Employee ep) {
        list.add(ep);
    }

    public boolean updateEmpoly(Employee ep){
        boolean flage = false;
        Employee employee = findEmployeeByID(ep.getId());
        
        if(employee != null){
          employee.setId(ep.getId());
          employee.setFullName(ep.getFullName());
          employee.setAge(ep.getAge());
          employee.setEmail(ep.getEmail());
          employee.setWage(ep.getWage());
          flage = true;
        }
       return false;
    }
    public void deleteEmployee(Employee ep) {
        list.remove(ep);
    }

    public Employee findEmployeeByID(String EmployeeID) {
        for (Employee em : list) {
            if (em.getId().equalsIgnoreCase(EmployeeID)) {
                return em;
            }
        }
        return null;
    }

    public boolean deleteEmployeeID(String EmployeeID) {
        for (Employee em : list) {
            if (em.getId().equalsIgnoreCase(EmployeeID)) {
                list.remove(em);
                return true;
            }
        }
        return false;
    }

    public void first() {
        if (index > 0) {
            index = 0;
        }
    }

    public void last() {
       
            index = list.size() -1;
 
    }

    public void previous() {
        if (index < list.size() - 1) {
            index--;
        }
        
    }

    public void next() {
        if (index < list.size() - 1) {
            index++;
        }
       
    }

    public int getIndex() {
        return index;
    }

    public Employee getEmployee() {
        if(list.size() == 0){
            return  null;
        }
        return list.get(index);
    }

   public String getPositionElement(){
       return "record: " + index+" of "+list.size() ;
   }
}
