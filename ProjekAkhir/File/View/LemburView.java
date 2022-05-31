/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.LemburController;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dywa Pratama
 */
public class LemburView extends JFrame implements ActionListener{
    LemburController controller = new LemburController();
    
    int id, usia, gaji;
    String nama;
    
    JPanel pData = new JPanel();
    JLabel lNama = new JLabel("Nama :");
    JLabel lUsia = new JLabel("Usia :");
    JLabel lGaji = new JLabel("Gaji :");
    JLabel lLembur = new JLabel("Lembur :");
    
    JLabel lpNama = new JLabel();
    JLabel lpUsia = new JLabel();
    JLabel lpGaji = new JLabel();
    JTextField lpLembur = new JTextField();
    
    JButton btnTotalGaji = new JButton("TOTAL GAJI");
    
    JPanel pButton = new JPanel();
    JButton btnEdit = new JButton("Edit");
    JButton btnHapus = new JButton("Hapus");
    JButton btnKembali = new JButton("Kembali");
    
    public LemburView(String id, String nama, String usia, String gaji){
        this.nama = nama;
        this.id = Integer.parseInt(id);
        this.usia = Integer.parseInt(usia);
        this.gaji = Integer.parseInt(gaji);
        
        setTitle("DATA KARYAWAN");
        setSize(250, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        add(pData);
        add(btnTotalGaji);
        add(pButton);
        
        pData.setLayout(new GridLayout(4, 2, 0, 4));
        pData.add(lNama);
        pData.add(lpNama);
        pData.add(lUsia);
        pData.add(lpUsia);
        pData.add(lGaji);
        pData.add(lpGaji);
        pData.add(lLembur);
        pData.add(lpLembur);
        
        lpNama.setText(nama);
        lpUsia.setText(usia);
        lpGaji.setText(gaji);
        
        btnTotalGaji.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        pButton.setLayout(new FlowLayout());
        pButton.add(btnKembali);
        pButton.add(btnEdit);
        pButton.add(btnHapus);
        
        btnTotalGaji.addActionListener(this);
        
        btnKembali.addActionListener(this);
        btnEdit.addActionListener(this);
        btnHapus.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnTotalGaji){
            if(lpLembur.equals("")){
                JOptionPane.showMessageDialog(null, "Input Tidak Boleh Kosong\n");
            }else{
                try{
                    int jamLembur = Integer.parseInt(lpLembur.getText());
                    controller.getTotalgaji(this, this.id, this.nama, this.usia, this.gaji, jamLembur);
                    setVisible(false);
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input Angka Tidak Boleh Huruf\n");
                }
            }
        }
        else if(e.getSource() == btnEdit){
            controller.edit(this, this.id, this.nama, this.usia, this.gaji);
        }
        else if(e.getSource() == btnHapus){
            controller.hapus(this, this.id);
        }
        else if(e.getSource() == btnKembali){
            controller.kembali(this);
        }
    }
}
