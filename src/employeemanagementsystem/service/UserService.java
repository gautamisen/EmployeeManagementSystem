/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.service;

import employeemanagementsystem.model.User;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author GAUTAMI
 */
public class UserService {
    //Used for registration
    public String saveUser(Session s,User u)
    {
        u.setCreated(new Date());
        u.setModified(new Date());
        u.setStatus(1);
        s.save(u);
        
        return "User Data Saved";
    }
    
    //Used for Login
    
    public String checkUserForLogin(Session s,User user)
    {
        Query q = s.createQuery("from User where username='"+user.getUsername()+"' and password='"+user.getPassword()+"' and status=1");
        List<User> list = q.list();
        System.out.println("List=> "+list+"\n Username="+user.getUsername()+"\n Password="+user.getPassword());
        if(list.isEmpty()){
            return "no";
        }
        else{
        return "yes";
        }
    }
    
    
        
    
}
