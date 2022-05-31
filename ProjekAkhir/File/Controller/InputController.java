/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.InputModel;
import View.HomeView;
import View.InputView;
import javax.swing.JOptionPane;

/**
 *
 * @author Dywa Pratama
 */
public class InputController {
    InputModel model = new InputModel();
    
    public void reset(InputView view){
        view.tfNama.setText("");
        view.tfUsia.setText("");
        view.tfGaji.setText("");
    }
    
    public void simpan(InputView view){
        if(view.getNama().equals("") || view.getUsia().equals("") || view.getGaji().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
        }else{
            try{
                String nama = view.getNama();
                int usia = Integer.parseInt(view.getUsia());
                int gaji = Integer.parseInt(view.getGaji());

                model.setData(nama, usia, gaji);
                if(model.insertData()){
                    reset(view);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input angka tidak boleh huruf\n" + e.getMessage());
            }
        }
    }
    
    public void kembali(InputView view){
        HomeView home = new HomeView();
        view.setVisible(false);
    }
}
