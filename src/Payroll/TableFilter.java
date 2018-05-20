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
     PreparedStatement ps = null;
        Statement stmt;
        ResultSet rs = null;
        
public void Filter(JTable table, String Query,JTextField Filter) {
    try {
        Connection con = DBConnect.connect();
        ps = con.prepareStatement(Query);
        ps.setString(1, "%" + Filter.getText() + "%");
        rs = ps.executeQuery();
        
        //To remove previously added rows
        while(table.getRowCount() > 0) 
        {
            ((DefaultTableModel) table.getModel()).removeRow(0);
        }
        int columns = rs.getMetaData().getColumnCount();
        while(rs.next())
        {  
            Object[] row = new Object[columns];
            for (int i = 1; i <= columns; i++)
            {  
                row[i - 1] = rs.getObject(i);
            }
            ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
        }
        con.close();
    }
    catch(SQLException e)
    {
        JOptionPane.showMessageDialog(null,e);
    }
}
}
