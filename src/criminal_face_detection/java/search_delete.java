/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criminal_face_detection.java;
import connectivity.db_connection;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author bhagwati
 */
public class search_delete extends javax.swing.JFrame {
Connection conn;
Statement st;
static criminal_full_info obj=null;

int id;
int id_var;
String n;
String val;
int ind;
search_delete sd1;
int passing_id[]=new int[6];
    /**
     * Creates new form search_delete
     * @throws java.sql.SQLException
     */
    public search_delete() throws SQLException {
        conn=db_connection.db_method();
         st=conn.createStatement();
        
        initComponents();
    // jPanel8.setVisible(false);  
    // jPanel3.setVisible(false);  
     //jPanel4.setVisible(false);  
     //jPanel6.setVisible(false);   
     ta1.setEditable(false);
     ta2.setEditable(false);
     ta3.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        ta1 = new java.awt.TextArea();
        ta2 = new java.awt.TextArea();
        ta3 = new java.awt.TextArea();
        ta4 = new java.awt.TextArea();
        ta5 = new java.awt.TextArea();
        ta6 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setForeground(new java.awt.Color(51, 0, 51));
        setSize(new java.awt.Dimension(560, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(32, 47, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(32, 47, 90));
        jComboBox1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(32, 47, 90));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "id", "name", "gender", "nationality" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 270, 31));

        Search.setBackground(new java.awt.Color(204, 204, 255));
        Search.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 140, 42));

        Delete.setBackground(new java.awt.Color(204, 204, 255));
        Delete.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 150, 42));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select any option");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 200, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminal_face_detection/java/left-arrow.png"))); // NOI18N
        back.setText("jLabel3");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });

        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/criminal_face_detection/java/home-black-shape12.png"))); // NOI18N
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 560));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("<HTML><B>Find the suspicious one</B></HTML>");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 710, 120));

        jPanel8.setBackground(java.awt.SystemColor.controlHighlight);

        ta1.setBackground(java.awt.Color.blue);
        ta1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta1.setForeground(new java.awt.Color(255, 255, 255));
        ta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                none(evt);
            }
        });

        ta2.setBackground(java.awt.Color.blue);
        ta2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta2.setForeground(new java.awt.Color(255, 255, 255));
        ta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ta2none(evt);
            }
        });

        ta3.setBackground(java.awt.Color.blue);
        ta3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta3.setForeground(new java.awt.Color(255, 255, 255));
        ta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ta3MouseExited(evt);
            }
        });

        ta4.setBackground(java.awt.Color.blue);
        ta4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta4.setForeground(new java.awt.Color(255, 255, 255));
        ta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ta4MouseExited(evt);
            }
        });

        ta5.setBackground(java.awt.Color.blue);
        ta5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta5.setForeground(new java.awt.Color(255, 255, 255));
        ta5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ta5MouseExited(evt);
            }
        });

        ta6.setBackground(java.awt.Color.blue);
        ta6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        ta6.setForeground(new java.awt.Color(255, 255, 255));
        ta6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ta6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ta6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ta6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ta4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ta5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ta6, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ta1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ta2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ta3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ta4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ta5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ta6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 250, 270));
        jPanel8.setVisible(false);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       ind=jComboBox1.getSelectedIndex();
    switch (ind) {
        case 0:
            val=JOptionPane.showInputDialog("Enter the id of the criminal");
            break;
        case 1:
            val=JOptionPane.showInputDialog("Enter the name of the criminal");
            break;
        case 2:
            val=JOptionPane.showInputDialog("Enter the gender(f/m) of the criminal");
            break;
    //  System.out.println(val);
        case 3:
            val=JOptionPane.showInputDialog("Enter the nationality of the criminal");
            break;
        default:
            break;
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String query = null;
   ta1.setVisible(false);
   ta2.setVisible(false);
   ta3.setVisible(false);
   ta4.setVisible(false);
   ta5.setVisible(false);
   ta6.setVisible(false);
   
        if(ind==0)
        {
            int id_var=Integer.parseInt(val);
            query="Select * from criminal_record where id="+id_var+";";
        }
        else if(ind==1)
        {
            String name_var=val.toString();
           //System.out.println(name_var);
            query="Select * from criminal_record where name='"+val+"';";
        }
        else if(ind==2)
        {
            char ch=val.charAt(0);
            query="Select * from criminal_record where gender='"+ch+"';";
        }
        else if(ind==3)
        {
            
            query="Select * from criminal_record where nationality='"+val+"';";
        }
    try {
        ResultSet rs=st.executeQuery(query);
        int cnt=1;
        while(rs.next())
        {
           jPanel8.setVisible(true);
            int id=rs.getInt("id");
            
            if(cnt==1)
            { 
                ta1.setVisible(true);
                System.out.println(rs.getString("name"));
            ta1.setText(rs.getString("name"));
            passing_id[1]=id;
            }
            else if(cnt==2)
            {
                ta2.setVisible(true);
            ta2.setText(rs.getString("name"));
            passing_id[2]=id;
            System.out.println(rs.getString("name"));
            }
            else if(cnt==3)
            {
          ta3.setVisible(true);
          ta3.setText(rs.getString("name"));
          System.out.println(rs.getString("name"));
          passing_id[3]=id;
            }
            else if(cnt==4)
            {
          ta4.setVisible(true);
          ta4.setText(rs.getString("name"));
          System.out.println(rs.getString("name"));
          passing_id[4]=id;
            }
            else if(cnt==5)
            {
          ta5.setVisible(true);
          ta5.setText(rs.getString("name"));
          System.out.println(rs.getString("name"));
          passing_id[5]=id;
            }
            else if(cnt==6)
            {
          ta6.setVisible(true);
          ta6.setText(rs.getString("name"));
          System.out.println(rs.getString("name"));
          passing_id[6]=id;
            }
            cnt++;
        }
        if(cnt==1)
        {
           JOptionPane.showMessageDialog(null,"Unfortunately !! no such criminal found");
        }
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_SearchActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        ta1.setVisible(false);
   ta2.setVisible(false);
   ta3.setVisible(false);
        String query = null;
        if(ind==0)
        {
            int id_var=Integer.parseInt(val);
            query="Delete from criminal_record where id="+id_var+";";
        }
        else if(ind==1)
        {
            String name_var=val.toString();
            query="Delete from criminal_record where name='"+val+"';";
        }
        else if(ind==2)
        {
            char ch=val.charAt(0);
            query="Delete from criminal_record where gender='"+ch+"';";
        }
        else if(ind==3)
        {

            query="Delete from criminal_record where nationality='"+val+"';";
        }
        int rs=0;
        try {
            rs=st.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(rs);
        JOptionPane.showMessageDialog(rootPane,"Deleted Succesfully");
    }//GEN-LAST:event_DeleteActionPerformed

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
        ta1.setBackground(Color.BLUE);
                
    }//GEN-LAST:event_none

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_HomeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backMouseClicked

    private void ta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta1MouseClicked
    try {
        // TODO add your handling code here:
         ta1.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[1],this);
       
        obj.setVisible(true);
        this.setVisible(false);
        
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta1MouseClicked

    private void ta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta3MouseClicked
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        ta3.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[3],this);
        obj.setVisible(true);
        this.setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta3MouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        System.out.println("mouse entered");
       back.setBackground(Color.WHITE);
    }//GEN-LAST:event_backMouseEntered

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        // TODO add your handling code here:
        Home.setBackground(Color.red);
    }//GEN-LAST:event_HomeMouseEntered

    private void ta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta1MouseEntered
        // TODO add your handling code here:
        ta1.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta1MouseEntered

    private void ta3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta3MouseEntered
        // TODO add your handling code here:
         ta3.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta3MouseEntered

    private void ta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta3MouseExited
        // TODO add your handling code here:
         ta3.setBackground(Color.BLUE);
    }//GEN-LAST:event_ta3MouseExited

    private void ta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta2MouseClicked
        // TODO add your handling code here:
       try {
        // TODO add your handling code here:
        ta2.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[2],this);
        obj.setVisible(true);
        this.setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta2MouseClicked

    private void ta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta2MouseEntered
        // TODO add your handling code here:
        ta2.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta2MouseEntered

    private void ta2none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta2none
        // TODO add your handling code here:
        ta2.setBackground(Color.BLUE);
    }//GEN-LAST:event_ta2none

    private void ta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta4MouseClicked
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        ta4.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[4],this);
        obj.setVisible(true);
        this.setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta4MouseClicked

    private void ta4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta4MouseEntered
        // TODO add your handling code here:
        ta4.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta4MouseEntered

    private void ta4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta4MouseExited
        // TODO add your handling code here:
        ta4.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta4MouseExited

    private void ta5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta5MouseClicked
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        ta5.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[5],this);
        obj.setVisible(true);
        this.setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta5MouseClicked

    private void ta5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta5MouseEntered
        // TODO add your handling code here:
         ta4.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta5MouseEntered

    private void ta5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta5MouseExited
        // TODO add your handling code here:
         ta4.setBackground(Color.BLUE);
    }//GEN-LAST:event_ta5MouseExited

    private void ta6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta6MouseClicked
        // TODO add your handling code here:
         try {
        // TODO add your handling code here:
        ta6.setBackground(Color.GRAY);
        obj=new criminal_full_info(passing_id[6],this);
        obj.setVisible(true);
        this.setVisible(false);
    } catch (SQLException ex) {
        Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_ta6MouseClicked

    private void ta6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta6MouseEntered
        // TODO add your handling code here:
         ta4.setBackground(Color.GRAY);
    }//GEN-LAST:event_ta6MouseEntered

    private void ta6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ta6MouseExited
        // TODO add your handling code here:
         ta4.setBackground(Color.BLUE);
    }//GEN-LAST:event_ta6MouseExited

    
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
            java.util.logging.Logger.getLogger(search_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new search_delete().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(search_delete.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JLabel Home;
    private javax.swing.JButton Search;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private java.awt.TextArea ta1;
    private java.awt.TextArea ta2;
    private java.awt.TextArea ta3;
    private java.awt.TextArea ta4;
    private java.awt.TextArea ta5;
    private java.awt.TextArea ta6;
    // End of variables declaration//GEN-END:variables
}
