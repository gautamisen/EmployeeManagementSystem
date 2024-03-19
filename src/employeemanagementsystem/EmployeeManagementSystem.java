/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem;

import employeemanagementsystem.config.Config;
import employeemanagementsystem.view.UserLoginPage;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

/**
 *
 * @author GAUTAMI
 */
public class EmployeeManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Config.SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            Config.SESSION = Config.SESSION_FACTORY.openSession();
            Config.TRANSCATION = Config.SESSION.beginTransaction();
            
            //Login page 
            new UserLoginPage().setVisible(true);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
