import javax.swing.*;
import java.util.Random;

public class Okno extends JFrame {
    private JButton btnGeneruj;
    private JButton btnKopiruj;
    private JPanel pnMain;
    private JTextField txtFCislo;
    private JTextArea txtAVypis;

    public Okno() {
        initCompotent();
    }

    public void initCompotent(){
        setContentPane(pnMain);
        setTitle("Test práce tlačítky");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnGeneruj.addActionListener(e -> btnGeneruj());
        btnKopiruj.addActionListener(e -> btnKopiruj());
    }

    public void btnGeneruj(){
        Random random = new Random();
        int cislo = random.nextInt(100);
        txtFCislo.setText(String.valueOf(cislo));
    }

    private void btnKopiruj() {
        String cislo = txtFCislo.getText();
        String text = txtAVypis.getText();
        txtAVypis.setText(text + cislo + "\n");
    }

}
