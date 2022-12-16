package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainForm {
    private JButton buttonCalculate;
    private JPanel taxPanel;
    private JTextField priceText;
    private JTextField ivaText;
    private JTextField totalText;

    public MainForm() {
       /* priceText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                priceText.getText();
                String valorPrecio = priceText.getText()+"ñ";
                priceText.setText(valorPrecio);

            }
        });*/
        buttonCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double price = Double.parseDouble(priceText.getText());
                double iva = Double.parseDouble(ivaText.getText());
                double resultado = price+(price/100*iva);
                totalText.setText(Double.toString(resultado));
            }
        });
    }

    public static void  main(String[] args){
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPanel);
        frame.setVisible(true);
    }
}
