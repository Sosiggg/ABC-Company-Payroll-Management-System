package emp;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SearchEmpSalary extends javax.swing.JFrame {
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public SearchEmpSalary() {
        initComponents();
        conn = DBconnect.connect();
        
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Employee Salary");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee ID :");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Job Title");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Basic Salary");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Status");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Date of Birth");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Surname");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Generate Slip");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Department");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Designation");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Date Hired");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(34, 34, 34)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(643, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    String sql = "SELECT * FROM staffinformation WHERE staffId=?";

    try {
        String staffIdText = jTextField1.getText().trim();
        if (!staffIdText.isEmpty()) {
            try {
                int staffId = Integer.parseInt(staffIdText);
                pst = conn.prepareStatement(sql);
                pst.setInt(1, staffId);
                rs = pst.executeQuery();

                if (rs.next()) {
                    int add1 = rs.getInt("staffId");
                    jTextField2.setText(String.valueOf(add1));
                    String add2 = rs.getString("firstName");
                    jTextField3.setText(add2);
                    String add3 = rs.getString("surname");
                    jTextField4.setText(add3);
                    String add4 = rs.getString("dob");
                    jTextField5.setText(add4);
                    String add5 = rs.getString("department");
                    jTextField6.setText(add5);
                    String add6 = rs.getString("designation");
                    jTextField7.setText(add6);
                    String add7 = rs.getString("status");
                    jTextField8.setText(add7);
                    String add8 = rs.getString("dateHired");
                    jTextField9.setText(add8);
                    String add9 = rs.getString("jobTitle");
                    jTextField10.setText(add9);
                    BigDecimal add10 = rs.getBigDecimal("basicSalary");
                    jTextField11.setText(add10.toString());

                } else {
                    // Set default values if no record is found
                    resetFormFields();
                }
            } catch (NumberFormatException e) {
                resetFormFields();
            }
        } else {
            resetFormFields();
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
        }
    }
}

private void resetFormFields() {
    jTextField2.setText("-");
    jTextField3.setText("-");
    jTextField4.setText("-");
    jTextField5.setText("-");
    jTextField6.setText("-");
    jTextField7.setText("-");
    jTextField8.setText("-");
    jTextField9.setText("-");
    jTextField10.setText("-");
    jTextField11.setText("0.00");
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        BigDecimal basicSalary = BigDecimal.ZERO;
        BigDecimal overtime = BigDecimal.ZERO;
        BigDecimal overtimeFinal = BigDecimal.ZERO; 
        BigDecimal medical = BigDecimal.ZERO;
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal other = BigDecimal.ZERO;
        BigDecimal totalAllowance = BigDecimal.ZERO;
        BigDecimal totalDeduction = BigDecimal.ZERO;
        String deductionReason = "";
        
        try {
            String basicSalarySql = "SELECT basicSalary FROM staffinformation WHERE staffId = ?";
            pst = conn.prepareStatement(basicSalarySql);
            pst.setInt(1, Integer.parseInt(jTextField2.getText()));
            rs = pst.executeQuery();
            if (rs.next()) {
                basicSalary = new BigDecimal(rs.getString("basicSalary"));
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching basic salary: " + e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            String allowanceSql = "SELECT a.*, s.basicSalary " +
                                  "FROM allowance a " +
                                  "JOIN staffinformation s ON a.staffId = s.staffId " +
                                  "WHERE a.staffId=?";
            pst = conn.prepareStatement(allowanceSql);
            pst.setInt(1, Integer.parseInt(jTextField2.getText()));
            rs = pst.executeQuery();

            if (rs.next()) {
                overtime = new BigDecimal(rs.getString("overtime"));

                int overtimeHours = overtime.intValue(); //
                BigDecimal standardHoursPerDay = new BigDecimal("8");
                BigDecimal workingDaysPerMonth = new BigDecimal("25");
                BigDecimal overtimeRate = new BigDecimal("1.5");

                BigDecimal dailyOvertimeRate = basicSalary.divide(workingDaysPerMonth.multiply(standardHoursPerDay), 2, RoundingMode.HALF_UP);
                overtimeFinal = dailyOvertimeRate.multiply(new BigDecimal(overtimeHours));

                medical = new BigDecimal(rs.getString("medical"));
                bonus = new BigDecimal(rs.getString("bonus"));
                other = new BigDecimal(rs.getString("other"));
                basicSalary = new BigDecimal(rs.getString("basicSalary"));
            }
            totalAllowance = basicSalary.add(overtimeFinal).add(medical).add(bonus).add(other);
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching allowance details: " + e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            String deductionSql = "SELECT d.*, s.basicSalary " +
                    "FROM deduction d " +
                    "JOIN staffinformation s ON d.staffId = s.staffId " +
                    "WHERE d.staffId=?";
            pst = conn.prepareStatement(deductionSql);
            pst.setInt(1, Integer.parseInt(jTextField2.getText()));
            rs = pst.executeQuery();

            if (rs.next()) {
                deductionReason = rs.getString("deductionReason");
                BigDecimal deductionAmount = new BigDecimal(rs.getString("deductionAmount"));
                totalDeduction = totalDeduction.add(deductionAmount);
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching deduction details: " + e.getMessage());
        } finally {
            try {
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        generatePaySlip(basicSalary, overtime, overtimeFinal, medical, bonus, other, totalAllowance, totalDeduction, deductionReason, evt);
}       catch (FileNotFoundException | DocumentException ex) {
            Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


private void generatePaySlip(BigDecimal basicSalary, BigDecimal overtime, BigDecimal overtimeFinal, BigDecimal medical, BigDecimal bonus, BigDecimal other, BigDecimal totalAllowance, BigDecimal totalDeduction, String deductionReason, java.awt.event.ActionEvent evt) throws FileNotFoundException, DocumentException {
    JFileChooser dialog = new JFileChooser();
    String defaultDirectory = "C:\\Java Projects\\ABC Company Payroll Management System\\src\\Reports";
    dialog.setCurrentDirectory(new File(defaultDirectory));
    dialog.setSelectedFile(new File(jTextField3.getText() + " " + jTextField4.getText() + "-salary slip" + ".pdf"));
    int dialogResult = dialog.showSaveDialog(null);

    if (dialogResult == JFileChooser.APPROVE_OPTION) {
        String filePath = dialog.getSelectedFile().getPath();

        try {
            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));

            myDocument.open();

            myDocument.add(new Paragraph("PAY SLIP", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph("---------------------------------------------------------------"));
            myDocument.add(new Paragraph("EMPLOYEE DETAILS", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
            myDocument.add(new Paragraph("Name of Employee : " + jTextField3.getText() + " " + jTextField4.getText(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Designation      : " + jTextField7.getText(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Department       : " + jTextField6.getText(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("---------------------------------------------------------------"));
            myDocument.add(new Paragraph("SALARY", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
            myDocument.add(new Paragraph("Basic Salary : " + basicSalary.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Overtime : " + overtimeFinal.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Medical : " + medical.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Bonus : " + bonus.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Other : " + other.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("---------------------------------------------------------------"));
            myDocument.add(new Paragraph("DEDUCTION", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
            myDocument.add(new Paragraph("Deduction Details : " + deductionReason, FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Total Deduction   : " + totalDeduction.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("---------------------------------------------------------------"));
            myDocument.add(new Paragraph("TOTAL PAYMENTS", FontFactory.getFont(FontFactory.TIMES_BOLD, 15, Font.BOLD)));
            myDocument.add(new Paragraph("Total Earnings : " + totalAllowance.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("Net Loss        : " + totalDeduction.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            BigDecimal finalsalary = totalAllowance.subtract(totalDeduction);
            Calendar calendar = Calendar.getInstance();
            int currentMonth = calendar.get(Calendar.MONTH) + 1;
            myDocument.add(new Paragraph("Final Salary for the Month of " + getMonthName(currentMonth) + ": " + finalsalary.toString(), FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.PLAIN)));
            myDocument.add(new Paragraph("---------------------------------------------------------------"));

            myDocument.newPage();
            myDocument.close();
            myWriter.close();

            JOptionPane.showMessageDialog(null, "Report generated successfully!");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}

private String getMonthName(int month) {
    String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    return monthNames[month - 1];

    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SearchEmpSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
            java.awt.EventQueue.invokeLater(() -> {
                new Login().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
