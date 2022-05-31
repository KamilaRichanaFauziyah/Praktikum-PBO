/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.HomeController;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dywa Pratama
 */
public class HomeView extends JFrame implements ActionListener{
    HomeController controller = new HomeController();
    
    JLabel lTitle = new JLabel("MAIN MENU", SwingConstants.CENTER);
    JButton btnTambahKaryawan = new JButton("Tambah Karyawan");
    JButton btnLihatKaryawan = new JButton("Lihat Karyawan");
    
    public HomeView(){
        setTitle("MAIN MENU");
        setSize(200, 150);
        setLayout(new GridLayout(3, 1, 0, 8));
        
        add(lTitle);
        add(btnTambahKaryawan);
        add(btnLihatKaryawan);
        
        btnTambahKaryawan.addActionListener(this);
        btnLihatKaryawan.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnTambahKaryawan){
            controller.tambahKaryawan(this);
        }
        else if(e.getSource() == btnLihatKaryawan){
            controller.lihatKaryawan(this);
        }
    }
    
    
}
