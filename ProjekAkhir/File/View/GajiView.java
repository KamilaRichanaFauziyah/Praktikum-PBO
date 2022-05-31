/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Karyawan;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dywa Pratama
 */
public class GajiView extends JFrame implements Karyawan, ActionListener{
    JPanel pData = new JPanel();
    JLabel lNama = new JLabel("Nama :");
    JLabel lUsia = new JLabel("Usia :");
    JLabel lGaji = new JLabel("Gaji :");
    JLabel lTotalGaji = new JLabel("Total Gaji :");
    
    JLabel lpNama = new JLabel();
    JLabel lpUsia = new JLabel();
    JLabel lpGaji = new JLabel();
    JLabel lpTotalGaji = new JLabel();
    
    JButton btnKembali = new JButton("Kembali");
    
    public GajiView(String nama, int usia, int gaji){
        lpNama.setText(nama);
        lpUsia.setText(Integer.toString(usia));
        lpGaji.setText(Integer.toString(gaji));
        
        setTitle("DATA KARYAWAN");
        setSize(250, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        add(pData);
        add(btnKembali);
        
        pData.setLayout(new GridLayout(4, 2, 0, 4));
        pData.add(lNama);
        pData.add(lpNama);
        pData.add(lUsia);
        pData.add(lpUsia);
        pData.add(lGaji);
        pData.add(lpGaji);
        pData.add(lTotalGaji);
        pData.add(lpTotalGaji);
        
        btnKembali.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void setTotalGaji(int gaji, int jamLembur) {
        lpTotalGaji.setText(Integer.toString(gaji + (jamLembur * gajiLembur)));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnKembali){
            setVisible(false);
            OutputView output = new OutputView();
        }
    }
}
