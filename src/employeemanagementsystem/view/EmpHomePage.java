/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeemanagementsystem.view;

import employeemanagementsystem.config.Config;
import employeemanagementsystem.model.Employee;
import employeemanagementsystem.service.EmployeeService;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GAUTAMI
 */
public class EmpHomePage extends javax.swing.JFrame {
public Employee e = null;
    /**
     * Creates new form EmpHomePage
     */
    public EmpHomePage() {
        initComponents();
        setTableData();
        new EmployeeService().setEmployeeMap();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        AddEmployee = new javax.swing.JButton();
        UpdateEmployee = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(85, 23, 78));

        jPanel5.setBackground(new java.awt.Color(255, 155, 155));
        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        EmpTable.setBackground(new java.awt.Color(255, 185, 150));
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        jPanel5.add(jScrollPane1);

        jPanel1.setBackground(new java.awt.Color(12, 53, 106));

        AddEmployee.setBackground(new java.awt.Color(12, 53, 106));
        AddEmployee.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        AddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        AddEmployee.setText("Add Employee");
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });

        UpdateEmployee.setBackground(new java.awt.Color(12, 53, 106));
        UpdateEmployee.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        UpdateEmployee.setForeground(new java.awt.Color(255, 255, 255));
        UpdateEmployee.setText("Update Employee");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(12, 53, 106));
        Delete.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AddEmployeepage().setVisible(true);
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        // TODO add your handling code here:
        try {
            //Select row on Mouse Click for getting emploee id
            String id = EmpTable.getValueAt(EmpTable.getSelectedRow(),1).toString();
            System.out.println("<ouse click Id =>"+id);
            
            // Find Employee in Employee map on mouse clicked Employee id
            Employee extractedEmployeeFromMap = Config.EMPLOYEE_MAP.get(Integer.parseInt(id));
            System.out.println("Mouse Clicked data =>"+extractedEmployeeFromMap);
            
            // set data of selected employee for sending it to update page
            e = extractedEmployeeFromMap;
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_EmpTableMouseClicked

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed
        // TODO add your handling code here:
        if(!(e.equals("null"))){
            this.dispose(); 
            new UpdateEmployeePage(e).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Select record to update","Home Page",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        if(!(e.equals("null"))){
            String deleteEmployee = new EmployeeService().deleteEmployee(Config.SESSION, e);
            JOptionPane.showMessageDialog(this, deleteEmployee, "Employee Home Page", JOptionPane.INFORMATION_MESSAGE);
           e=null;
           setTableData();
           
        }
        else{
            JOptionPane.showMessageDialog(this, "Please Select record to Delete","Home Page",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JButton Delete;
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton UpdateEmployee;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void setTableData(){
        try {
            
        
        String[] col={"SRNO","EmpId","Name","Phone Number","Department","Address","City","State"};
            Connection con = Config.SESSION.connection();
            Statement smt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = smt.executeQuery("select * from Employee where status=1");
            //shifting courser to the last row for row count
            rs.last();
            int noOfRows = rs.getRow();
            System.out.println(noOfRows);
            rs.beforeFirst();
            
            String[][] data = new String[noOfRows][col.length];
            int i=0;
            while(rs.next()){
                data[i][0] = (i+1)+"";
                data[i][1] = rs.getInt("id")+"";
                data[i][2] = rs.getString("name");
                data[i][3] = rs.getString("phone");
                data[i][4] = rs.getString("department");
                data[i][5] = rs.getString("address");
                data[i][6] = rs.getString("city");
                data[i][7] = rs.getString("state");
                i++;
            }
        
        DefaultTableModel model = new DefaultTableModel(data,col);
        EmpTable.setModel(model);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


