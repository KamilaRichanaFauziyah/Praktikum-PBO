/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.HomeView;
import View.InputView;
import View.OutputView;

/**
 *
 * @author Dywa Pratama
 */
public class HomeController {
    public void tambahKaryawan(HomeView view){
        InputView input = new InputView();
        view.setVisible(false);
    }
    
    public void lihatKaryawan(HomeView view){
        OutputView output = new OutputView();
        view.setVisible(false);
    }
}
