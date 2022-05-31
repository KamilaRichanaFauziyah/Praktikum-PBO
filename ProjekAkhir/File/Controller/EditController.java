/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EditModel;
import View.EditView;
import View.OutputView;
import javax.swing.JOptionPane;

/**
 *
 * @author Dywa Pratama
 */
public class EditController {
    EditModel model = new EditModel();
    
    public void reset(EditView view){
        view.tfNama.setText("");
        view.tfUsia.setText("");
        view.tfGaji.setText("");
    }
    
    public void simpan(EditView view, int id){
        if(view.getNama().equals("") || view.getUsia().equals("") || view.getGaji().equals("")){
            JOptionPane.showMessageDialog(null, "Input tidak boleh kosong");
        }else{
            try{
                String nama = view.getNama();
                int usia = Integer.parseInt(view.getUsia());
                int gaji = Integer.parseInt(view.getGaji());

                model.setData(id, nama, usia, gaji);
                if(model.updateData()){
                    JOptionPane.showMessageDialog(null, "Data berhasil diedit");
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input angka tidak boleh huruf\n" + e.getMessage());
            }
        }
    }
    
    public void kembali(EditView view){
        OutputView output = new OutputView();
        view.setVisible(false);
    }
}
