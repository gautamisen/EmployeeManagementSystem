/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.config;

import employeemanagementsystem.model.Employee;
import java.util.LinkedHashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author GAUTAMI
 */
public class Config {
    public static SessionFactory SESSION_FACTORY=null;
    
    public static Session SESSION = null;
    
    public static Transaction TRANSCATION = null;
    
   public static LinkedHashMap<Integer , Employee> EMPLOYEE_MAP = new LinkedHashMap();
    
    
    
    
}
