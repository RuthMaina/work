/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ruth
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    // Change the color of the selected menu item
    public void ChangeColor (JPanel panel, JLabel label) {
for (Component C : panel.getComponents())
{    
    if (C instanceof JLabel){
        ((JLabel) C).setBackground(new Color(255, 255, 255));
        label.setBackground(new Color(96, 96, 96));
    } else {
        label.setBackground(new Color(255, 255, 255));
    }
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

        Body = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btnEmployees = new javax.swing.JLabel();
        btnDepartment = new javax.swing.JLabel();
        btnAttendance = new javax.swing.JLabel();
        btnHolidays = new javax.swing.JLabel();
        btnOvertime = new javax.swing.JLabel();
        btnAllowances = new javax.swing.JLabel();
        btnDeductions = new javax.swing.JLabel();
        btnAnalysis = new javax.swing.JLabel();
        btnReports = new javax.swing.JLabel();
        btnSettings = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 460));

        Body.setBackground(new java.awt.Color(255, 255, 255));
        Body.setMinimumSize(new java.awt.Dimension(845, 375));

        Menu.setBackground(new java.awt.Color(255, 255, 255));
        Menu.setLayout(new java.awt.GridLayout(2, 5, 5, 5));

        btnEmployees.setBackground(new java.awt.Color(255, 255, 255));
        btnEmployees.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEmployees.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmployees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnEmployees.setText("Employees");
        btnEmployees.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmployees.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        btnEmployees.setOpaque(true);
        btnEmployees.setPreferredSize(new java.awt.Dimension(845, 523));
        btnEmployees.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmployees.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEmployeesMouseMoved(evt);
            }
        });
        btnEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmployeesMouseClicked(evt);
            }
        });
        Menu.add(btnEmployees);

        btnDepartment.setBackground(new java.awt.Color(255, 255, 255));
        btnDepartment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDepartment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnDepartment.setText("Departments");
        btnDepartment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepartment.setOpaque(true);
        btnDepartment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDepartment.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDepartmentMouseMoved(evt);
            }
        });
        btnDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDepartmentMouseClicked(evt);
            }
        });
        Menu.add(btnDepartment);

        btnAttendance.setBackground(new java.awt.Color(255, 255, 255));
        btnAttendance.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAttendance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnAttendance.setText("<html>Attendance <br>and Leave</html>");
        btnAttendance.setToolTipText("");
        btnAttendance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAttendance.setOpaque(true);
        btnAttendance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAttendance.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAttendanceMouseMoved(evt);
            }
        });
        btnAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAttendanceMouseClicked(evt);
            }
        });
        Menu.add(btnAttendance);

        btnHolidays.setBackground(new java.awt.Color(255, 255, 255));
        btnHolidays.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnHolidays.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnHolidays.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnHolidays.setText("Holidays");
        btnHolidays.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHolidays.setOpaque(true);
        btnHolidays.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHolidays.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnHolidaysMouseMoved(evt);
            }
        });
        btnHolidays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHolidaysMouseClicked(evt);
            }
        });
        Menu.add(btnHolidays);

        btnOvertime.setBackground(new java.awt.Color(255, 255, 255));
        btnOvertime.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnOvertime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOvertime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnOvertime.setText("Overtime");
        btnOvertime.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOvertime.setOpaque(true);
        btnOvertime.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOvertime.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnOvertimeMouseMoved(evt);
            }
        });
        btnOvertime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOvertimeMouseClicked(evt);
            }
        });
        Menu.add(btnOvertime);

        btnAllowances.setBackground(new java.awt.Color(255, 255, 255));
        btnAllowances.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAllowances.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAllowances.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnAllowances.setText("Allowances");
        btnAllowances.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAllowances.setOpaque(true);
        btnAllowances.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAllowances.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAllowancesMouseMoved(evt);
            }
        });
        btnAllowances.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAllowancesMouseClicked(evt);
            }
        });
        Menu.add(btnAllowances);

        btnDeductions.setBackground(new java.awt.Color(255, 255, 255));
        btnDeductions.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnDeductions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDeductions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnDeductions.setText("Deductions");
        btnDeductions.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeductions.setOpaque(true);
        btnDeductions.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeductions.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDeductionsMouseMoved(evt);
            }
        });
        btnDeductions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeductionsMouseClicked(evt);
            }
        });
        Menu.add(btnDeductions);

        btnAnalysis.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalysis.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAnalysis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAnalysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnAnalysis.setText("<html>Analysis<br> and Reports</html>");
        btnAnalysis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalysis.setOpaque(true);
        btnAnalysis.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAnalysis.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAnalysisMouseMoved(evt);
            }
        });
        btnAnalysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAnalysisMouseClicked(evt);
            }
        });
        Menu.add(btnAnalysis);

        btnReports.setBackground(new java.awt.Color(255, 255, 255));
        btnReports.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnReports.setText("<html>Backup and<br>Restore</html>");
        btnReports.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReports.setOpaque(true);
        btnReports.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReports.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnReportsMouseMoved(evt);
            }
        });
        btnReports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportsMouseClicked(evt);
            }
        });
        Menu.add(btnReports);

        btnSettings.setBackground(new java.awt.Color(255, 255, 255));
        btnSettings.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Orange.png"))); // NOI18N
        btnSettings.setText("Settings");
        btnSettings.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSettings.setOpaque(true);
        btnSettings.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSettings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSettingsMouseMoved(evt);
            }
        });
        btnSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSettingsMouseClicked(evt);
            }
        });
        Menu.add(btnSettings);

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addGap(108, 108, 108))
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BodyLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(Body, java.awt.BorderLayout.CENTER);

        Header.setBackground(new java.awt.Color(18, 19, 34));
        Header.setMinimumSize(new java.awt.Dimension(776, 72));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_25px.png"))); // NOI18N
        jLabel7.setText("Administrator");
        jLabel7.setIconTextGap(5);

        jLabel8.setFont(new java.awt.Font("Castellar", 0, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PAYROLL SYSTEM");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(136, 136, 136)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeesMouseClicked
        // TODO add your handling code here:
        Employee e = new Employee();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmployeesMouseClicked

    private void btnDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartmentMouseClicked
        // TODO add your handling code here:
        Department d = new Department();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDepartmentMouseClicked

    private void btnAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttendanceMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAttendanceMouseClicked

    private void btnHolidaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHolidaysMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnHolidaysMouseClicked

    private void btnEmployeesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmployeesMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnEmployees);
    }//GEN-LAST:event_btnEmployeesMouseMoved

    private void btnOvertimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOvertimeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOvertimeMouseClicked

    private void btnAllowancesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllowancesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAllowancesMouseClicked

    private void btnDeductionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeductionsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeductionsMouseClicked

    private void btnAnalysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalysisMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalysisMouseClicked

    private void btnReportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsMouseClicked

    private void btnSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSettingsMouseClicked

    private void btnDepartmentMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDepartmentMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnDepartment);
    }//GEN-LAST:event_btnDepartmentMouseMoved

    private void btnAttendanceMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAttendanceMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnAttendance);
    }//GEN-LAST:event_btnAttendanceMouseMoved

    private void btnHolidaysMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHolidaysMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnHolidays);
    }//GEN-LAST:event_btnHolidaysMouseMoved

    private void btnOvertimeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOvertimeMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnOvertime);
    }//GEN-LAST:event_btnOvertimeMouseMoved

    private void btnAllowancesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAllowancesMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnAllowances);
    }//GEN-LAST:event_btnAllowancesMouseMoved

    private void btnDeductionsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeductionsMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnDeductions);
    }//GEN-LAST:event_btnDeductionsMouseMoved

    private void btnAnalysisMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnalysisMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnAnalysis);
    }//GEN-LAST:event_btnAnalysisMouseMoved

    private void btnReportsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportsMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnReports);
    }//GEN-LAST:event_btnReportsMouseMoved

    private void btnSettingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSettingsMouseMoved
        // TODO add your handling code here:
        ChangeColor(Menu, btnSettings);
    }//GEN-LAST:event_btnSettingsMouseMoved

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel btnAllowances;
    private javax.swing.JLabel btnAnalysis;
    private javax.swing.JLabel btnAttendance;
    private javax.swing.JLabel btnDeductions;
    private javax.swing.JLabel btnDepartment;
    private javax.swing.JLabel btnEmployees;
    private javax.swing.JLabel btnHolidays;
    private javax.swing.JLabel btnOvertime;
    private javax.swing.JLabel btnReports;
    private javax.swing.JLabel btnSettings;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
