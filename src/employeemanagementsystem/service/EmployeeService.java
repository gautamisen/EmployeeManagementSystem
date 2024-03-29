/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.service;

import employeemanagementsystem.config.Config;
import employeemanagementsystem.model.Employee;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author GAUTAMI
 */
public class EmployeeService {
    public String saveEmployee(Session s,Employee e)
    {
        e.setCreated(new Date());
        e.setModified(new Date());
        e.setStatus(1);
        s.save(e);
        return"Employee data saved";
    }
    
    public String setEmployeeMap(){
        try {
             Connection con = Config.SESSION.connection();
            Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = smt.executeQuery("select * from Employee where status=1");
            
            while(rs.next()){
                Employee e = new Employee();
                e.setId(rs.getInt("id"));
                e.setAddress(rs.getString("address"));
                e.setCity(rs.getString("city"));
                e.setCreated(rs.getDate("created"));
                e.setModified(rs.getDate("modified"));
                e.setDepartment(rs.getString("department"));
                e.setName(rs.getString("name"));
                e.setPhone(rs.getString("phone"));
                e.setState(rs.getString("state"));  
                e.setStatus(rs.getInt("status"));  
                
                Config.EMPLOYEE_MAP.put(rs.getInt("id"), e);   
            }
            System.out.println("Employee Map is: "+Config.EMPLOYEE_MAP);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "Data Set Success";
    }
    
    public String updateEmployee(Session s , Employee e){
        Config.TRANSCATION.begin();
        e.setModified(new Date());
        s.update(e);
        Config.TRANSCATION.commit();
        return "Employee Update successfully.";
    }
    public String deleteEmployee(Session s , Employee e){
        Config.TRANSCATION.begin();
        s.delete(e);
        Config.TRANSCATION.commit();
        return "Employee Deleted successfully.";
    }
}
