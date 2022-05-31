/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.EditModel;
import View.EditView;
import View.LemburView;
import View.OutputView;
import View.GajiView;
import javax.swing.JOptionPane;

/**
 *
 * @author Dywa Pratama
 */
public class LemburController {
    EditModel model = new EditModel();
    
    public void getTotalgaji(LemburView view, int id, String nama, int usia, int gaji, int jamLembur){
        GajiView gajiView = new GajiView(nama, usia, gaji);
        gajiView.setTotalGaji(gaji, jamLembur);
    }
    
    public void edit(LemburView view, int id, String nama, int usia, int gaji){
        EditView output = new EditView(id, nama, usia, gaji);
        view.setVisible(false);
    }
    
    public void kembali(LemburView view){
        OutputView output = new OutputView();
        view.setVisible(false);
    }
    
    public void hapus(LemburView view, int id){
        int confirm = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini?");
        if(confirm == 0){
            if(model.hapusData(id)){
                JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus\n");
                OutputView output = new OutputView();
                view.setVisible(false);
            }
        }
    }
}
