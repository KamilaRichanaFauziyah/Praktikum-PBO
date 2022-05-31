/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HomeView;
import View.LemburView;
import View.OutputView;

/**
 *
 * @author Dywa Pratama
 */
public class OutputController {
    public void rincian(OutputView view, String id, String nama, String usia, String gaji){
        LemburView lembur = new LemburView(id, nama, usia, gaji);
        view.setVisible(false);
    }
    
    public void kembali(OutputView view){
        HomeView home = new HomeView();
        view.setVisible(false);
    }
}
