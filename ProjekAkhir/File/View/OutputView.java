/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.OutputController;
import Model.OutputModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Dywa Pratama
 */
public class OutputView extends JFrame implements ActionListener{
    OutputController controller = new OutputController();
    OutputModel model = new OutputModel();
    
    String kolom[] = {"ID", "NAMA", "USIA", "GAJI"};
    JTableHeader tblHeader;
    JTable tblKaryawan;
    DefaultTableModel tblModel;
    JScrollPane scrollPane;
    ListSelectionModel selection;
    
    JButton btnKembali = new JButton("Kembali");
    
    public OutputView(){
        setTitle("DATA KARYAWAN");
        setSize(500, 500);
        setLayout(null);
        
        tblModel = new DefaultTableModel(model.getDataKaryawan(), kolom);
        tblKaryawan = new JTable(tblModel);
        scrollPane = new JScrollPane(tblKaryawan);
        
        add(scrollPane);
        add(btnKembali);
        
        tblKaryawan.setAutoCreateRowSorter(true);
        tblKaryawan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selection = tblKaryawan.getSelectionModel();
        
        scrollPane.setBounds(0, 0, 500, 400);
        
        btnKembali.setBounds(0, 400, 500, 40);
        btnKembali.setBackground(Color.blue);
        btnKembali.setForeground(Color.white);
        
        selection.addListSelectionListener((ListSelectionEvent e) -> {
            if(!e.getValueIsAdjusting()){
                int baris = tblKaryawan.getSelectedRow();
                String id = tblKaryawan.getModel().getValueAt(baris, 0).toString();
                String nama = tblKaryawan.getModel().getValueAt(baris, 1).toString();
                String usia = tblKaryawan.getModel().getValueAt(baris, 2).toString();
                String gaji = tblKaryawan.getModel().getValueAt(baris, 3).toString();

                controller.rincian(this, id, nama, usia, gaji);
            }
        });
        
        btnKembali.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnKembali){
            controller.kembali(this);
        }
    }
}
