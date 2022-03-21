import javax.swing.*;

public class Interfacee extends JFrame {

    JLabel lJudul = new JLabel("Cuboid Calculator");
    JLabel lLength = new JLabel("Length:");
    JLabel lWidth = new JLabel("Width:");
    JLabel lHeight = new JLabel("Height:");
    JLabel lResult = new JLabel("Result");
    JTextField tfLength = new JTextField();
    JTextField tfWidth = new JTextField();
    JTextField tfHeight = new JTextField();


    JButton btnCount = new JButton("Count");
    JButton btnReset = new JButton("Reset");

    public Interfacee(){
        setTitle("Cuboid Calculator");
        setSize(400, 280);
        setLayout(null);

        add(lJudul);
        add(lLength);
        add(lWidth);
        add(lHeight );
        add(lResult);

        add(tfLength);
        add(tfWidth);
        add(tfHeight);
        add(btnCount);
        add(btnReset);

        lJudul.setBounds(125,10,200,20);

        lLength.setBounds(20, 40, 100, 20);
        tfLength.setBounds(130, 40, 100, 20);

        lWidth.setBounds(20,70,100,20);
        tfWidth.setBounds(130,70,100,20);

        lLength.setBounds(20,70,100,20);
        tfLength.setBounds(130,70,100,20);

        btnCount.setBounds(125,200,125,20);
        btnReset.setBounds(125,200,125,20);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}