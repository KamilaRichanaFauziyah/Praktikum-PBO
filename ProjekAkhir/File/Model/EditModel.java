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
public class EditModel {
    Connector connector = new Connector();
    String nama;
    int id, usia, gaji;
    
    public void setData(int id, String nama, int usia, int gaji){
        this.id = id;
        this.nama = nama;
        this.usia = usia;
        this.gaji = gaji;
    }
    
    public boolean updateData(){
        boolean success = false;
        try {
            String query = "UPDATE `karyawan` SET "
                    + "`nama` = '" + this.nama + "',"
                    + "`usia` = '" + this.usia + "',"
                    + "`gaji` = '" + this.gaji + "'"
                    + "WHERE `karyawan`.`id` = " + this.id;
            
            connector.statement = connector.connection.createStatement();
            connector.statement.executeUpdate(query);
            success = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Database\n" + ex.getMessage());
        }
        return success;
    }
    
    public boolean hapusData(int id){
        boolean success = false;
        try {
            String query = "DELETE FROM karyawan WHERE `karyawan`.`id` = " + id;
            
            connector.statement = connector.connection.createStatement();
            connector.statement.executeUpdate(query);
            success = true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Database\n" + ex.getMessage());
        }
        return success;
    }
}
