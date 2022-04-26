import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Form extends JFrame{
    Connector connector = new Connector();

    JLabel lTitle = new JLabel("Form Login Register", SwingConstants.CENTER);


    JLabel lUsernameLogin = new JLabel("Username");
    JLabel lPasswordLogin = new JLabel("Password");
    JLabel lUsernameReg = new JLabel("Username");
    JLabel lPasswordReg = new JLabel("Password");

    JTextField tfUsernameLogin = new JTextField();
    JTextField tfPasswordLogin = new JTextField();
    JTextField tfUsernameReg = new JTextField();
    JTextField tfPasswordReg = new JTextField();

    JButton btnLogin = new JButton("Login");
    JButton btnReg = new JButton("Register");

    public Form(){
        setTitle("Form Login Register");
        setSize(550, 450);
        setLayout(null);

        add(lTitle);
        add(lUsernameLogin);
        add(lPasswordLogin);
        add(lUsernameReg);
        add(lPasswordReg);
        add(tfUsernameLogin);
        add(tfPasswordLogin);
        add(tfUsernameReg);
        add(tfPasswordReg);
        add(btnLogin);
        add(btnReg);

        lTitle.setBounds(200, 55, 140, 20);

        lUsernameLogin.setBounds(65, 100, 80, 20);
        lPasswordLogin.setBounds(65, 180, 80, 20);

        tfUsernameLogin.setBounds(65, 130, 150, 30);
        tfPasswordLogin.setBounds(65, 200, 150, 30);

        btnLogin.setBounds(80, 280, 100, 20);

        lUsernameReg.setBounds(270, 110, 80, 20);
        lPasswordReg.setBounds(270, 180, 80, 20);

        tfUsernameReg.setBounds(290, 130, 140, 30);
        tfPasswordReg.setBounds(290, 210, 140, 30);

        btnReg.setBounds(300, 270, 100, 20);

        btnReg.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    if(!getUsernameReg().isEmpty() & !getPasswordReg().isEmpty()){
                        String query = "INSERT INTO `users`(`username`, `password`) VALUES ('" + getUsernameReg() + "','" + getPasswordReg() + "')";

                        connector.statement = connector.koneksi.createStatement();
                        connector.statement.executeUpdate(query);

                        JOptionPane.showMessageDialog(null,"Berhasil Mendaftarkan User.");
                    }else{
                        JOptionPane.showMessageDialog(null,"Username dan Password Tidak Boleh Kosong!!!");
                    }
                } catch (Exception ex){
                    if(ex.getMessage().contains("Duplicate entry")){
                        JOptionPane.showMessageDialog(null,"Username Sudah Digunakan.");
                    }
                }
            }
        });

        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String query = "SELECT `username`, `password` FROM `users` WHERE `username` = '" + getUsernameLogin() + "'";

                    connector.statement = connector.koneksi.createStatement();
                    ResultSet resultSet = connector.statement.executeQuery(query);

                    if(resultSet.next()){
                        if(resultSet.getString("password").equals(getPasswordLogin())){
                            JOptionPane.showMessageDialog(null,"Berhasil Login");
                        }else{
                            JOptionPane.showMessageDialog(null,"Password Salah");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Username Belum Terdaftar");
                    }
                } catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUsernameLogin(){
        return tfUsernameLogin.getText();
    }

    public String getPasswordLogin() {
        return tfPasswordLogin.getText();
    }

    public String getUsernameReg(){
        return tfUsernameReg.getText();
    }

    public String getPasswordReg() {
        return tfPasswordReg.getText();
    }
}
