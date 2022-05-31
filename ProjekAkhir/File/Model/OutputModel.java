/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dywa Pratama
 */
public class OutputModel {
    Connector connector = new Connector();
    
    public String[][] getDataKaryawan(){
        String data[][] = new String[getJumlahData()][4];
        try {
            String query = "SELECT * fROM `karyawan`";
            connector.statement = connector.connection.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            
            int p = 0;
            while(resultSet.next()){
                data[p][0] = resultSet.getString("id");
                data[p][1] = resultSet.getString("nama");
                data[p][2] = resultSet.getString("usia");
                data[p][3] = resultSet.getString("gaji");
                p++;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Database\n" + ex.getMessage());
        }
        return data;
    }
    
    public int getJumlahData(){
        int jumlah = 0;
        try {
            String query = "SELECT COUNT(*) AS `jumlah` FROM `karyawan`";
            connector.statement = connector.connection.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query);
            
            if(resultSet.next()){
                jumlah = resultSet.getInt("jumlah");
            }
            else{
                jumlah = 0;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan Database\n" + ex.getMessage());
        }
        return jumlah;
    }
}
