/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.InputController;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Dywa Pratama
 */
public class InputView extends JFrame implements ActionListener{
    InputController controller = new InputController();
    
    JLabel lTitle = new JLabel("INPUT KARYAWAN");
    
    JPanel pFormInput = new JPanel();
    JLabel lNama = new JLabel("NAMA");
    public JTextField tfNama = new JTextField();
    JLabel lUsia = new JLabel("USIA");
    public JTextField tfUsia = new JTextField();
    JLabel lGaji = new JLabel("GAJI");
    public JTextField tfGaji = new JTextField();
    
    JPanel pButton = new JPanel();
    JButton btnSimpan = new JButton("Simpan");
    JButton btnReset = new JButton("Reset");
    JButton btnKembali = new JButton("Kembali");
    
    public InputView(){
        setTitle("INPUT KARYAWAN");
        setSize(250, 200);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        add(lTitle);
        add(pFormInput);
        add(pButton);
        
        lTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        pFormInput.setLayout(new GridLayout(3, 2, 0, 4));
        pFormInput.add(lNama);
        pFormInput.add(tfNama);
        pFormInput.add(lUsia);
        pFormInput.add(tfUsia);
        pFormInput.add(lGaji);
        pFormInput.add(tfGaji);
        
        pButton.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        pButton.add(btnSimpan, gbc);
 
        gbc.gridx = 1;
        gbc.gridy = 0;
        pButton.add(btnReset, gbc);
 
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        pButton.add(btnKembali, gbc);
        
        btnSimpan.setBackground(Color.green);
        btnReset.setBackground(Color.red);
        btnKembali.setBackground(Color.blue);
        
        btnSimpan.setForeground(Color.white);
        btnReset.setForeground(Color.white);
        btnKembali.setForeground(Color.white);
        
        btnSimpan.addActionListener(this);
        btnReset.addActionListener(this);
        btnKembali.addActionListener(this);
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSimpan){
            controller.simpan(this);
        }
        else if(e.getSource() == btnReset){
            controller.reset(this);
        }
        else if(e.getSource() == btnKembali){
            controller.kembali(this);
        }
    }
    
    public String getNama(){
        return tfNama.getText();
    }
    
    public String getUsia(){
        return tfUsia.getText();
    }
    
    public String getGaji(){
        return tfGaji.getText();
    }
}
