/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Payroll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruth
 */
public class TableFilter {
        
public void Filter(JTable table, String Query, JTextField Filter) {
    Connection con = DBConnect.connect();
        try {
            DBConnect.ps = con.prepareStatement(Query);
            DBConnect.ps.setString(1, "%" + Filter.getText() + "%");
            DBConnect.rs = DBConnect.ps.executeQuery();

            // To remove previously added rows
            while (table.getRowCount() > 0) {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }

            int columns = DBConnect.rs.getMetaData().getColumnCount();

            while (DBConnect.rs.next()) {
                Object[] row = new Object[columns];

                for (int i = 1; i <= columns; i++) {
                    row[i - 1] = DBConnect.rs.getObject(i);
                }

                ((DefaultTableModel) table.getModel()).insertRow(DBConnect.rs.getRow() - 1, row);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {}
        }
}
}
