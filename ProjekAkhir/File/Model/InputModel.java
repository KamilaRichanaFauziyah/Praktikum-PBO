/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Connector;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dywa Pratama
 */
public class InputModel {
    Connector connector = new Connector();
    String nama;
    int usia, gaji;
    
    public void setData(String nama, int usia, int gaji){
        this.nama = nama;
        this.usia = usia;
        this.gaji = gaji;
    }
    
    public boolean insertData(){
        boolean success = false;
        try {
            String query = "INSERT INTO `karyawan` (`id`, `nama`, `usia`, `gaji`) VALUES "
                    + "(NULL, '" + this.nama + "', " + this.usia + ",'" + this.gaji + "');";
            
            connector.statement = connector.connection.createStatement();
            connector.statement.executeUpdate(query);
            success = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Database\n" + ex.getMessage());
        }
        return success;
    }
}
