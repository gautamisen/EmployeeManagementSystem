/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.service;

import employeemanagementsystem.model.Employee;
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
    
}
