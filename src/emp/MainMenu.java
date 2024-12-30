package emp;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class MainMenu extends javax.swing.JFrame {
        
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    public MainMenu() {
        initComponents();
        conn=DBconnect.connect();

        jLabel2.setText(String.valueOf(Emp.empname));
        
        setTitle("ABC Company Payroll Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1005, 610);
        setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logged In As :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(810, 280, 90, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Add_Employee.png"))); // NOI18N
        jButton2.setText("Employee Manager");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(360, 360, 190, 60);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Payment.png"))); // NOI18N
        jButton7.setText("Payment");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(770, 440, 180, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Search_1.png"))); // NOI18N
        jButton3.setText("Search");
        jButton3.setActionCommand("SearchEmployee");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(570, 360, 180, 60);

        jButton1.setBackground(new java.awt.Color(26, 23, 81));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(java.awt.Color.orange);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/logout.png"))); // NOI18N
        jButton1.setText(" Logout");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(850, 30, 100, 50);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Update.png"))); // NOI18N
        jButton5.setText("Update Salary");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(360, 440, 190, 60);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Allowance.png"))); // NOI18N
        jButton4.setText("Allowance");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(770, 360, 180, 60);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("emp");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(900, 280, 60, 20);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/Deduction.png"))); // NOI18N
        jButton6.setText("Deduction");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(570, 440, 180, 60);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 73)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PAYROLL");
        jLabel6.setToolTipText("");
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 80));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 350, 330, 70);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S Y S T E M");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 430, 160, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Version 1.0.0");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 470, 70, 13);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollSystemImages/bk2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(1129, 700));
        jLabel3.setMinimumSize(new java.awt.Dimension(1129, 700));
        jLabel3.setPreferredSize(new java.awt.Dimension(1129, 700));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -70, 1129, 660);

        jMenu1.setText("Employees");

        jMenuItem5.setText("Employee Registration");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reports");

        jMenuItem1.setText("Employee Report");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Employee Total Allowance Report");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Employee Total Deduction Report");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Audit");

        jMenuItem4.setText("Audit Trail");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1016, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Login l = new Login();
    l.setVisible(true);
    this.dispose();

    try {
        Date currentDate = GregorianCalendar.getInstance().getTime();
        DateFormat df = DateFormat.getDateInstance();
        String dateString = df.format(currentDate);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeString = sdf.format(d);

        int staffId = Emp.empid;

        System.out.println("Logging out - Staff ID: " + staffId);

        String reg = "INSERT INTO audit(staffId, date, status) VALUES('" + staffId + "','" + timeString + " / " + dateString + "','Logged out')";
        pst = conn.prepareStatement(reg);
        pst.execute();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, e);
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            JFileChooser dialog = new JFileChooser();
            String defaultDirectory = "C:\\Java Projects\\ABC Company Payroll Management System\\src\\Reports";
            dialog.setCurrentDirectory(new File(defaultDirectory));
            dialog.setSelectedFile(new File("Employees Report.pdf"));
            int dialogResult = dialog.showSaveDialog(null);

            if (dialogResult == JFileChooser.APPROVE_OPTION) {
                String filePath = dialog.getSelectedFile().getPath();

                try {
                    String sql ="SELECT staffId, firstName, surname, dob, contact, address1, gender, department, designation, dateHired, basicSalary, jobTitle, status from staffinformation";
                    pst = conn.prepareStatement(sql);
                    rs = pst.executeQuery();

            
                    Document myDocument = new Document();
                    PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
                    PdfPTable table = new PdfPTable(13);
                    myDocument.open();


                    float[] columnWidths = new float[] {3,8,7,7,8,7,6,9,6,6,6,8,5};
                    table.setWidths(columnWidths);

                    table.setWidthPercentage(100);
           
          
                    myDocument.add(new Paragraph("ABC Company's Employee List",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
                    myDocument.add(new Paragraph(new Date().toString()));
                    myDocument.add(new Paragraph(" "));
                   
                    table.addCell(new PdfPCell(new Paragraph("ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("First Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Surname",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date of Birth",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Contact No.",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Address",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Gender",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Department",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Designation",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Date Hired",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Salary",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Job Title",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
                    table.addCell(new PdfPCell(new Paragraph("Status",FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.BOLD))));
          
                    while(rs.next()){
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(6),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(7),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(8),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(9),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(10),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(11),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(12),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));
                        table.addCell(new PdfPCell(new Paragraph(rs.getString(13),FontFactory.getFont(FontFactory.TIMES_ROMAN,8,Font.PLAIN))));    
                    }
           
                    myDocument.add(table);
                    myDocument.close();  
                    JOptionPane.showMessageDialog(null,"Report was successfully generated");
            
                } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        AddEmployee ae= new AddEmployee();
        ae.setVisible(true);
            } catch (Exception ex) {
        ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
        SearchEmployee searchEmployee = new SearchEmployee();
        searchEmployee.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Allowance a= new Allowance();
        a.setVisible(true);
                
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Deduction d = new Deduction();
        d.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        UpdateSalary us= new UpdateSalary();
        us.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        SearchEmpSalary ses= new SearchEmpSalary();
        ses.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
         Audit a= new Audit();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
        AddEmployee ae = new AddEmployee();
        ae.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JFileChooser dialog = new JFileChooser();
        String defaultDirectory = "C:\\Java Projects\\ABC Company Payroll Management System\\src\\Reports";
        dialog.setCurrentDirectory(new File(defaultDirectory));
        dialog.setSelectedFile(new File("Employee Allowance Report.pdf"));
        int dialogResult = dialog.showSaveDialog(null);

        if (dialogResult == JFileChooser.APPROVE_OPTION) {
            String filePath = dialog.getSelectedFile().getPath();

        try {
            String sql = "SELECT a.allowanceId, a.staffId, s.firstName, s.surname, s.basicSalary, a.overtime, a.medical, a.bonus, a.other, a.rate, a.totalAllowance " +
                         "FROM allowance a " +
                         "JOIN staffinformation s ON a.staffId = s.staffId";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));

            myDocument.open();
            PdfPTable table = new PdfPTable(11); 

            float[] columnWidths = new float[]{3, 7, 7, 5, 5, 7, 6, 5, 7, 7, 7};
            table.setWidths(columnWidths);
            table.setWidthPercentage(100);

            myDocument.add(new Paragraph("ABC Company's Employee Allowance List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph(" "));

            table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Surname", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Basic Salary", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Extra Hours Worked", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Medical", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Bonus", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Other", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Rate", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Total Allowance", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            
            while (rs.next()) {
                table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(7), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(8), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(9), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(10), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(11), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
            }

            myDocument.add(table);
            myDocument.close();
            myWriter.close();
            JOptionPane.showMessageDialog(null, "Report was successfully generated");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
    }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    JFileChooser dialog = new JFileChooser();
    String defaultDirectory = "C:\\Java Projects\\ABC Company Payroll Management System\\src\\Reports";
    dialog.setCurrentDirectory(new File(defaultDirectory));
    dialog.setSelectedFile(new File("Employee Deduction Report.pdf"));
    int dialogResult = dialog.showSaveDialog(null);

    if (dialogResult == JFileChooser.APPROVE_OPTION) {
        String filePath = dialog.getSelectedFile().getPath();

        try {
            String sql = "SELECT deductionId, staffId, firstName, surname, deductionAmount, madeBy FROM deduction";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            Document myDocument = new Document();
            PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath));
            PdfPTable table = new PdfPTable(6);
            myDocument.open();

            float[] columnWidths = new float[] { 3, 7, 7, 5, 5, 6 };
            table.setWidths(columnWidths);
            table.setWidthPercentage(100);

            myDocument.add(new Paragraph("ABC Company's Employee Deduction List", FontFactory.getFont(FontFactory.TIMES_BOLD, 20, Font.BOLD)));
            myDocument.add(new Paragraph(new Date().toString()));
            myDocument.add(new Paragraph(" "));

            table.addCell(new PdfPCell(new Paragraph("ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Employee ID", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("First Name", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Surname", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Deduction Amount", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));
            table.addCell(new PdfPCell(new Paragraph("Validated By", FontFactory.getFont(FontFactory.TIMES_ROMAN, 10, Font.BOLD))));

            while (rs.next()) {
                table.addCell(new PdfPCell(new Paragraph(rs.getString(1), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(2), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(3), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(4), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(5), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
                table.addCell(new PdfPCell(new Paragraph(rs.getString(6), FontFactory.getFont(FontFactory.TIMES_ROMAN, 9, Font.PLAIN))));
            }

            myDocument.add(table);
            myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
            myDocument.close();
            myWriter.close();

            JOptionPane.showMessageDialog(null, "Report was successfully generated");

        } catch (SQLException | DocumentException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

  
    public static void main(String args[]) {
        /* Set the Windows look and feel */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new Login().setVisible(true);
            }
            });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
