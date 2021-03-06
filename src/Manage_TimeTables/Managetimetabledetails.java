package Manage_TimeTables;


import Dispaly_TimeTable.DisplayTimeTable;
import TimetableReg.Timetable;
import com.mysql.cj.protocol.Resultset;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Ayub
 */
public class Managetimetabledetails extends javax.swing.JFrame {
     Connection con = null;
    PreparedStatement pst = null;
    Resultset rs = null;

  
    /**
     * Creates new form Managetimetabledetails
     */
    public Managetimetabledetails() {
        initComponents();
        tableUpdate();
        
    }
  
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSubjects = new javax.swing.JPanel();
        jLabelSubjects = new javax.swing.JLabel();
        jLabelLecName = new javax.swing.JLabel();
        jLabelTime = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextTime = new javax.swing.JTextField();
        jButtonRemove = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jComboSubjects = new javax.swing.JComboBox<>();
        jLabelTimeTableID = new javax.swing.JLabel();
        jTextFieldTimeTableID = new javax.swing.JTextField();
        jLabelDate = new javax.swing.JLabel();
        jTextDate = new javax.swing.JTextField();
        jLabelHeading = new javax.swing.JLabel();
        jLabelSubHeading = new javax.swing.JLabel();
        jButtonMinimize = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextemail = new javax.swing.JTextField();
        jButtonclear = new javax.swing.JButton();
        jButtonprint = new javax.swing.JButton();
        jButtonadd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReceipt = new javax.swing.JTextArea();
        text = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSubjects.setText("Subject");

        jLabelLecName.setText("Lecturer Name");
        jLabelLecName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jLabelLecNameKeyReleased(evt);
            }
        });

        jLabelTime.setText("Time");

        jLabelEmail.setText("Email");

        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        jTextField_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_nameKeyPressed(evt);
            }
        });

        jTextTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTimeActionPerformed(evt);
            }
        });

        jButtonRemove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jComboSubjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinhala", "English", "Science", "Mathematics", "History", " " }));
        jComboSubjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboSubjectsActionPerformed(evt);
            }
        });

        jLabelTimeTableID.setText("Time Table ID");

        jTextFieldTimeTableID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTimeTableIDActionPerformed(evt);
            }
        });

        jLabelDate.setText("Date");

        jTextDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDateActionPerformed(evt);
            }
        });

        jLabelHeading.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabelHeading.setText("MANAGE TIME TABLE DETAILS");

        jLabelSubHeading.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSubHeading.setForeground(new java.awt.Color(0, 102, 102));
        jLabelSubHeading.setText("SIPSEWANA");

        jButtonMinimize.setText("-");
        jButtonMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizeActionPerformed(evt);
            }
        });

        jButtonExit.setText("X");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jButtonExit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonExitKeyPressed(evt);
            }
        });

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Subject", "LecName", "Day", "Time", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextemailActionPerformed(evt);
            }
        });
        jTextemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextemailKeyReleased(evt);
            }
        });

        jButtonclear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });

        jButtonprint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonprint.setText("Print");
        jButtonprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonprintActionPerformed(evt);
            }
        });

        jButtonadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonadd.setText("Add Record");
        jButtonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaddActionPerformed(evt);
            }
        });

        txtReceipt.setColumns(20);
        txtReceipt.setRows(5);
        jScrollPane2.setViewportView(txtReceipt);

        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKeyReleased(evt);
            }
        });

        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanelSubjectsLayout = new javax.swing.GroupLayout(jPanelSubjects);
        jPanelSubjects.setLayout(jPanelSubjectsLayout);
        jPanelSubjectsLayout.setHorizontalGroup(
            jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLecName)
                                    .addComponent(jLabelTime)
                                    .addComponent(jLabelEmail)
                                    .addComponent(jLabelSubjects)
                                    .addComponent(jLabelDate))
                                .addGap(88, 88, 88))
                            .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeTableID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSubjectsLayout.createSequentialGroup()
                                        .addComponent(jButtonUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonRemove)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldTimeTableID, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextemail)
                                .addComponent(jTextTime)
                                .addComponent(jTextDate)
                                .addComponent(jTextField_name)
                                .addComponent(jComboSubjects, 0, 367, Short.MAX_VALUE))
                            .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                                .addComponent(jButtonadd)
                                .addGap(23, 23, 23)
                                .addComponent(jButtonprint)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonclear)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabelHeading))
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabelSubHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonMinimize, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jButtonExit))
        );
        jPanelSubjectsLayout.setVerticalGroup(
            jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMinimize))
                .addGap(4, 4, 4)
                .addComponent(jLabelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSubjectsLayout.createSequentialGroup()
                        .addComponent(jLabelSubHeading)
                        .addGap(32, 32, 32)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTimeTableID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTimeTableID))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSubjects))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLecName))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTime))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail))
                        .addGap(53, 53, 53)
                        .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonadd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelSubjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButtonprint, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSubjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSubjects, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      Connection con1 = null;
    PreparedStatement insert;
    
        
      private void tableUpdate() {
        int c;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "");
            insert = con1.prepareStatement("select * from student_management");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();

            DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);

            while (rs.next()) {
                Vector v2 = new Vector();

                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("subject"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("date"));
                    v2.add(rs.getString("time"));
                    v2.add(rs.getString("email"));
                   

                }
                Df.addRow(v2);
            }

       
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nameActionPerformed

    private void jTextTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTimeActionPerformed

    private void jComboSubjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboSubjectsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboSubjectsActionPerformed

    private void jTextFieldTimeTableIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTimeTableIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTimeTableIDActionPerformed

    private void jLabelLecNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelLecNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelLecNameKeyReleased

     private JFrame frame;
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        frame = new JFrame(); 
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Print Systems",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
         DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        try{
            
            int ID =Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the Record","Warning",JOptionPane.YES_NO_OPTION);
            
            if(dialogResult == JOptionPane.YES_OPTION)
            {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "");
            insert = con1.prepareStatement("delete from student_management where ID = ?");
            insert.setInt(1,ID);
            insert.executeUpdate();
          
            
           
            JOptionPane.showMessageDialog(this, "Record Deleted ");
            tableUpdate();
            
        jTextFieldTimeTableID.setText(""); 
        jComboSubjects.setSelectedItem("");
        jTextField_name.setText("");
        jTextDate.setText("");
        jTextTime.setText("");
        jTextemail.setText("");
        
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jTextField_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_nameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c)){
            jTextField_name.setEditable(true);
        }
        else
        {
            jTextField_name.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_nameKeyPressed

    private void jButtonMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizeActionPerformed
        // TODO add your handling code here:
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setState(Timetable.ICONIFIED); } };
        jButtonMinimize. addActionListener(al);
    }//GEN-LAST:event_jButtonMinimizeActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System. exit(0); } };
        jButtonExit. addActionListener(al);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitKeyPressed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        
       DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
       int selectedIndex = jTable1.getSelectedRow();  
       
       
            
        try {
           int ID= Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            
            String Subject = jComboSubjects.getSelectedItem().toString();
            String LName = jTextField_name.getText();
            String Day = jTextDate.getText();
            String Time = jTextTime.getText();
             String Email = jTextemail.getText();
            
            
            Class.forName("com.mysql.jdbc.Driver");
            
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_management_system", "root", "");
            insert = con1.prepareStatement("update student_management set subject = ?, name = ?, date = ?, time = ? ,email = ? where ID = ? ");
           
            insert.setString(1, Subject);
            insert.setString(2, LName);
            insert.setString(3, Day);
            insert.setString(4, Time);
            insert.setString(5, Email);
            insert.setInt(6,ID);
          
            
            insert.executeUpdate();
            
            
            JOptionPane.showMessageDialog(this,"Record Updated");
            tableUpdate();
         
            
        jTextFieldTimeTableID.setText(""); 
        jComboSubjects.setSelectedItem("");
        jTextField_name.setText("");
        jTextDate.setText("");
        jTextTime.setText("");
        jTextemail.setText("");
        
            
       } 
       catch (ClassNotFoundException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Managetimetabledetails.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDateActionPerformed

    private void jTextemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemailActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
             DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
       int selectedIndex = jTable1.getSelectedRow();
       
       jTextFieldTimeTableID.setText(Df.getValueAt(selectedIndex, 0).toString());
       jComboSubjects.setSelectedItem(Df.getValueAt(selectedIndex, 1).toString());
       jTextField_name.setText(Df.getValueAt(selectedIndex, 2).toString());
       jTextDate.setText(Df.getValueAt(selectedIndex, 3).toString()); 
       jTextTime.setText(Df.getValueAt(selectedIndex, 4).toString());
       jTextemail.setText(Df.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextemailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextemailKeyReleased

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        // TODO add your handling code here:
        txtReceipt.setText("");
        jTextFieldTimeTableID.setText("");
        jComboSubjects.setSelectedItem("Sinhala");
        jTextField_name.setText("");
        jTextDate.setText("");
        jTextTime.setText("");
        jTextemail.setText("");
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtonprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonprintActionPerformed
        try {
            txtReceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(DisplayTimeTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonprintActionPerformed

    private void jButtonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaddActionPerformed
        // TODO add your handling code here:
        txtReceipt.append("\t\t Student Records \n\n" +

            "Time Table ID:\t\t" + jTextFieldTimeTableID.getText()+
            "\n========================================================\n\n" +
            "Subject:\t\t"+ jComboSubjects.getSelectedItem()+ "\n\n" +
            "Lecturer Name:\t\t" + jTextField_name.getText()+ "\n\n" +
            "Email:\t\t"+ jTextemail.getText()+ "\n\n" +            
            "Day:\t\t"+ jTextDate.getText()+ "\n\n" +
            "Time:\t\t"+ jTextTime.getText()+ "\n\n" +
            "========================================================");

    }//GEN-LAST:event_jButtonaddActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textKeyPressed

    private void textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(text.getText().trim()));
    }//GEN-LAST:event_textKeyReleased

    public boolean Validation() {
        if ( validateemail()) {
            JOptionPane.showMessageDialog(null, "validation passed");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "validation failed");
            return false;
        }
    }
    public boolean validateemail() {
        String email = this.jTextemail.getText().trim();
        if (email.equals("") || email.equals(null)) {
            JOptionPane.showMessageDialog(null, "Email cannot be empty");
            return false;
        } else {
            String PA = "^[a-zA-Z0-9]{5,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,3}$";
            if (!email.matches(PA)) {
                JOptionPane.showMessageDialog(null, "Not a valide email");
                return false;
            } else {

                return true;
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(Managetimetabledetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Managetimetabledetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Managetimetabledetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Managetimetabledetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Managetimetabledetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonMinimize;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonadd;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtonprint;
    private javax.swing.JComboBox<String> jComboSubjects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelLecName;
    private javax.swing.JLabel jLabelSubHeading;
    private javax.swing.JLabel jLabelSubjects;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTimeTableID;
    private javax.swing.JPanel jPanelSubjects;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextDate;
    private javax.swing.JTextField jTextFieldTimeTableID;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JTextField jTextTime;
    private javax.swing.JTextField jTextemail;
    private javax.swing.JTextField text;
    private javax.swing.JTextArea txtReceipt;
    // End of variables declaration//GEN-END:variables
}
