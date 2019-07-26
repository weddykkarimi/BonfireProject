import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProjectOOP extends javax.swing.JFrame {

    connection conn = new connection();
    public ProjectOOP() {
        initComponents();
    }
private JFrame frame;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        ticketsnumber = new javax.swing.JLabel();
        daysofvacation = new javax.swing.JLabel();
        modeoftravel = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        Accept = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        Retrieve = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        datea = new javax.swing.JLabel();
        officer = new javax.swing.JLabel();
        dateo = new javax.swing.JLabel();
        comment = new javax.swing.JLabel();
        siga = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        sigo = new javax.swing.JTextField();
        dato = new javax.swing.JTextField();
        com = new javax.swing.JTextField();
        print = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        receiptno = new javax.swing.JLabel();
        receipt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(51, 255, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 255));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        firstname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        firstname.setText("Firstname");

        lastname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lastname.setText("Lastname");

        ticketsnumber.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        ticketsnumber.setText("Ticketsnumber");

        daysofvacation.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        daysofvacation.setText("Daysofvacation");

        modeoftravel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        modeoftravel.setText("Modeoftravel");

        fname.setBackground(new java.awt.Color(255, 0, 204));
        fname.setText("fname");

        lname.setBackground(new java.awt.Color(255, 0, 204));
        lname.setText("lname");

        jComboBox1.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.setToolTipText("");

        jComboBox2.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));

        Accept.setBackground(new java.awt.Color(255, 0, 204));
        Accept.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Accept.setText("Book");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(51, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Firstname", "Lastname", "Ticketsnumber", "Daysofvacation", "Modeoftravel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Delete.setBackground(new java.awt.Color(255, 0, 204));
        Delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Retrieve.setBackground(new java.awt.Color(255, 0, 204));
        Retrieve.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Retrieve.setText("Retrieve");
        Retrieve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetrieveActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 0, 204));
        Update.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jComboBox3.setBackground(new java.awt.Color(255, 0, 204));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehicle", "Plane", "SGR/Train", "Ship" }));

        jButton1.setBackground(new java.awt.Color(255, 0, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setText("BONFIRE ADVENTURES BOOKING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstname)
                            .addComponent(lastname)
                            .addComponent(ticketsnumber)
                            .addComponent(daysofvacation)
                            .addComponent(modeoftravel))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Update)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, 45, Short.MAX_VALUE)
                                            .addComponent(lname)
                                            .addComponent(fname)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Accept)
                        .addGap(277, 277, 277)
                        .addComponent(Delete)
                        .addGap(64, 64, 64)
                        .addComponent(Retrieve)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(firstname)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(lastname))
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticketsnumber)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(daysofvacation)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modeoftravel)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete)
                    .addComponent(Accept)
                    .addComponent(Retrieve)
                    .addComponent(Update))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BONFIRE ADVENTURES BOOKING SYSTEM", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 255, 255));

        name.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        name.setText("Applicantname");

        datea.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        datea.setText("Date of Application");

        officer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        officer.setText("Receiving officer");

        dateo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        dateo.setText("Date received");

        comment.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        comment.setText("Comment on Booking");

        siga.setForeground(new java.awt.Color(255, 0, 255));
        siga.setText("applicantsignature");

        data.setForeground(new java.awt.Color(255, 0, 255));
        data.setText("date");

        sigo.setForeground(new java.awt.Color(255, 0, 255));
        sigo.setText("officerssignature");
        sigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sigoActionPerformed(evt);
            }
        });

        dato.setForeground(new java.awt.Color(255, 0, 255));
        dato.setText("date");

        com.setForeground(new java.awt.Color(255, 0, 255));
        com.setText("comment");

        print.setBackground(new java.awt.Color(255, 0, 204));
        print.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        print.setText("PRINT Receipt");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setText("BOOKING APPROVAL RECEIPT");

        jButton5.setBackground(new java.awt.Color(255, 0, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        receiptno.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        receiptno.setText("Receipt No");

        receipt.setForeground(new java.awt.Color(255, 0, 255));
        receipt.setText("receipt");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(comment)
                        .addGap(213, 213, 213)
                        .addComponent(com, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(dateo)
                        .addGap(271, 271, 271)
                        .addComponent(dato))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(officer)
                        .addGap(252, 252, 252)
                        .addComponent(sigo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(datea)
                        .addGap(234, 234, 234)
                        .addComponent(data))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(name)
                        .addGap(262, 262, 262)
                        .addComponent(siga))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(receiptno, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(251, 251, 251)
                        .addComponent(receipt)))
                .addGap(232, 232, 232))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(print)
                        .addGap(156, 156, 156)
                        .addComponent(jButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton2)
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(receiptno)
                    .addComponent(receipt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(datea)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(officer)
                    .addComponent(sigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateo)
                    .addComponent(dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comment)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(print))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("APPROVAL OF BOOKING", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String firstname=fname.getText();
        String lastname=lname.getText();
        String ticketsnumber=jComboBox1.getSelectedItem().toString();
        String daysofvacation=jComboBox2.getSelectedItem().toString();
        String modeoftravel=jComboBox3.getSelectedItem().toString();
        conn.updateBooking(firstname,lastname,ticketsnumber,daysofvacation,modeoftravel);
    }//GEN-LAST:event_UpdateActionPerformed

    private void RetrieveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetrieveActionPerformed

        ResultSet newrs=conn.getbookings();
        try{
            DefaultTableModel newmode1=(DefaultTableModel)jTable1.getModel();
            while(newrs.next())
            {
                Vector<String>bookingitems=new Vector<String>();
                bookingitems.add(newrs.getString("firstname"));
                bookingitems.add(newrs.getString("lastname"));
                bookingitems.add(newrs.getString("ticketsnumber"));
                bookingitems.add(newrs.getString("daysofvacation"));
                bookingitems.add(newrs.getString("modeoftravel"));
                newmode1.addRow(bookingitems);
                new Report(newmode1);
                JOptionPane.showMessageDialog(null,"booking records retrieved successfully");
                //return;
            }
        }
        catch(SQLException x)
        {
            JOptionPane.showMessageDialog(null,x.getMessage());
        }
    }//GEN-LAST:event_RetrieveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String firstname=fname.getText();
        conn.deleteBooking(firstname);
    }//GEN-LAST:event_DeleteActionPerformed

    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        String firstname=fname.getText();
        String lastname=lname.getText();
        String ticketsnumber=jComboBox1.getSelectedItem().toString();
        String daysofvacation=jComboBox2.getSelectedItem().toString();
        String modeoftravel=jComboBox3.getSelectedItem().toString();
        conn.insertBooking(firstname,lastname,ticketsnumber,daysofvacation,modeoftravel);
    }//GEN-LAST:event_AcceptActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
PrinterJob printJob = PrinterJob.getPrinterJob();
        try {
            printJob.print(  );
        } catch (PrinterException ex) {
            Logger.getLogger(ProjectOOP.class.getName()).log(Level.SEVERE, null, ex);
        }
if (printJob.printDialog())
try { 
printJob.print();
} catch(PrinterException pe) {
System.out.println("Error printing: " + pe);
}
    }//GEN-LAST:event_printActionPerformed

    private void sigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sigoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frame=new JFrame();
        if (JOptionPane.showConfirmDialog(frame,"confirm if u want to exit","Employee Management System",
        JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectOOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectOOP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accept;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Retrieve;
    private javax.swing.JButton Update;
    private javax.swing.JTextField com;
    private javax.swing.JLabel comment;
    private javax.swing.JTextField data;
    private javax.swing.JLabel datea;
    private javax.swing.JLabel dateo;
    private javax.swing.JTextField dato;
    private javax.swing.JLabel daysofvacation;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel modeoftravel;
    private javax.swing.JLabel name;
    private javax.swing.JLabel officer;
    private javax.swing.JButton print;
    private javax.swing.JTextField receipt;
    private javax.swing.JLabel receiptno;
    private javax.swing.JTextField siga;
    private javax.swing.JTextField sigo;
    private javax.swing.JLabel ticketsnumber;
    // End of variables declaration//GEN-END:variables
}
