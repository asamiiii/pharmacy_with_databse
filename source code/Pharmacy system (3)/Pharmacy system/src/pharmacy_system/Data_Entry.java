/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy_system;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author M.A.S tech
 */
public class Data_Entry extends javax.swing.JFrame {
 private final String url = "jdbc:sqlserver://localhost\\SQL2018;databaseName=pharmacy;user=sa;password=12345;";
    /**
     * Creates new form Data_Entry
     */
    public Data_Entry() {
        
        initComponents();
        setVisible(true);
        setResizable(false);
        setLocation(250, 200);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
        }catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this,"Cannot Load JDBC Driver !!!");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name_textfield = new javax.swing.JTextField();
        price_textfield = new javax.swing.JTextField();
        amount_textfield = new javax.swing.JTextField();
        notes_textfield = new javax.swing.JTextField();
        done_btn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Axure Handwriting", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("name");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 31, 60, 26);

        jLabel2.setFont(new java.awt.Font("Axure Handwriting", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("price");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 91, 60, 25);

        jLabel3.setFont(new java.awt.Font("Axure Handwriting", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("amount");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 147, 70, 26);

        jLabel4.setFont(new java.awt.Font("Axure Handwriting", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("notes");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 206, 50, 24);
        jPanel3.add(name_textfield);
        name_textfield.setBounds(81, 34, 128, 35);

        price_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_textfieldActionPerformed(evt);
            }
        });
        jPanel3.add(price_textfield);
        price_textfield.setBounds(81, 87, 128, 32);
        jPanel3.add(amount_textfield);
        amount_textfield.setBounds(81, 145, 128, 31);

        notes_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notes_textfieldActionPerformed(evt);
            }
        });
        jPanel3.add(notes_textfield);
        notes_textfield.setBounds(81, 202, 128, 32);

        done_btn.setFont(new java.awt.Font("Axure Handwriting", 3, 18)); // NOI18N
        done_btn.setText("done");
        done_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done_btnActionPerformed(evt);
            }
        });
        jPanel3.add(done_btn);
        done_btn.setBounds(188, 294, 75, 27);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/vector-pharmacy.jpg"))); // NOI18N
        jLabel14.setText("jLabel11");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(-120, 0, 980, 340);

        jTabbedPane1.addTab("Add Medicine", jPanel3);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Axure Handwriting", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 70, 90, 30);

        jTextField2.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(130, 70, 110, 30);

        jLabel7.setFont(new java.awt.Font("Axure Handwriting", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("amount");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 110, 110, 25);

        jButton2.setFont(new java.awt.Font("Axure Handwriting", 3, 14)); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 150, 90, 30);

        jTextField3.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3);
        jTextField3.setBounds(150, 110, 70, 30);

        jLabel15.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/vector-pharmacy.jpg"))); // NOI18N
        jLabel15.setText("jLabel11");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(-120, 0, 980, 340);

        jTabbedPane1.addTab("Edite Amount", jPanel1);

        jPanel2.setLayout(null);

        jTextField1.setText(" ");
        jPanel2.add(jTextField1);
        jTextField1.setBounds(120, 110, 130, 30);

        jButton1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        jButton1.setText("Show amount");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(110, 150, 150, 23);

        jLabel5.setFont(new java.awt.Font("Axure Handwriting", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("name ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 120, 50, 15);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/vector-pharmacy.jpg"))); // NOI18N
        jLabel16.setText("jLabel11");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(-120, 0, 980, 340);

        jTabbedPane1.addTab("Amount", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static int Add (int Amount1,int Amount2)
{
  return Amount1 + Amount2;
}
    private void done_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done_btnActionPerformed
        String name = name_textfield.getText();
        String pr = price_textfield.getText();
        float price = Float.parseFloat(pr);
        String notes = notes_textfield.getText();
        String am = amount_textfield.getText();
        int amount = Integer.parseInt(am);
        if (name.isEmpty()||am.isEmpty()||pr.isEmpty()||notes.isEmpty()
            )
        {
            JOptionPane.showMessageDialog(this, "Please enter all your data");
            return;
        }

        Connection con = null;
        Statement comand=null;
        ResultSet rst = null;
        try {

            con= DriverManager.getConnection(url);
            comand = con.createStatement();
            /*String sql="select * from medicine where m_name ='"+name+"'";
            rst =comand.executeQuery(sql);*/
            
             String query = "INSERT INTO medicine VALUES ('"+name+"','"+amount+"'"
                    + ",'"+notes+"','"+price+"')";


                    
            int affectsRows = comand.executeUpdate(query);
            if(affectsRows == 1)
            {
                JOptionPane.showMessageDialog(this, "Successful Adding !!!");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error !!!");
                    }
            
            
        }
            catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        finally{
            if(rst!=null) try{rst.close();}catch(Exception e){}
            if(con!=null) try{con.close();}catch(Exception e){}
            if(comand!=null) try{comand.close();}catch(Exception e){}
        }
            
    }//GEN-LAST:event_done_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
        String name = jTextField1.getText();
        if(name.isEmpty())
            {
            JOptionPane.showMessageDialog(this, "Please enter the name");
            return;
        }
      Connection con = null;
        Statement stmt=null;
        ResultSet result = null;
        try
        {
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            String query = "SELECT * FROM medicine where m_name='"+name+"' ";

            result = stmt.executeQuery(query);

            String notes = null;

            if(result.next())
            {
                int amount = result.getInt("amount");
                JOptionPane.showMessageDialog(this,"Amount :  "+amount);

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid medicine name");
            }

        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
         finally{
            if(result!=null) try{result.close();}catch(Exception e){}
            if(con!=null) try{con.close();}catch(Exception e){}
            if(stmt!=null) try{stmt.close();}catch(Exception e){}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name=jTextField2.getText();
        System.err.println("ww");
        String am =jTextField3.getText();
        int amount=Integer.parseInt(am);
        int Amount = 0;
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter medicine name");
            return;
        }
        if(am.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please amount Of Medicine");
            return;
        }
       
        Connection con = null;
        Statement comand=null;
        ResultSet rst =null;
        try {

            con= DriverManager.getConnection(url);
            comand = con.createStatement();
            
          String a="select * from medicine "+"WHERE m_name='"+name+"'";
          rst = comand.executeQuery(a);
          
           if(rst.next())
            {
                Amount = rst.getInt("amount");
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid medicine name");
            }
         String sql = ("UPDATE medicine set amount="+Add(amount,Amount)+"WHERE m_name='"+name+"'") ;
         
                int affectsRows = comand.executeUpdate(sql);
            if(affectsRows == 1)
            {
                JOptionPane.showMessageDialog(this, "Successful Update Amount ");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Incorrect Amount !!!");
            }

            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        finally{
           // if(rst!=null) try{rst.close();}catch(Exception e){}
            if(con!=null) try{con.close();}catch(Exception e){}
            if(comand!=null) try{comand.close();}catch(Exception e){}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void price_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_textfieldActionPerformed

    private void notes_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notes_textfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notes_textfieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Entry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount_textfield;
    private javax.swing.JButton done_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField name_textfield;
    private javax.swing.JTextField notes_textfield;
    private javax.swing.JTextField price_textfield;
    // End of variables declaration//GEN-END:variables
}