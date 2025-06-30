package graficas.clases;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {
    private JTextField txt1, txt2, txtResultado;
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;

    public Calculadora() {
        setTitle("Calculadora Básica");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        txt1 = new JTextField();
        txt2 = new JTextField();
        txtResultado = new JTextField();
        txtResultado.setEditable(false);

        btnSumar = new JButton("Sumar");
        btnRestar = new JButton("Restar");
        btnMultiplicar = new JButton("Multiplicar");
        btnDividir = new JButton("Dividir");

        panel.add(new JLabel("Número 1:"));
        panel.add(txt1);
        panel.add(new JLabel("Número 2:"));
        panel.add(txt2);
        panel.add(btnSumar);
        panel.add(btnRestar);
        panel.add(btnMultiplicar);
        panel.add(btnDividir);
        panel.add(new JLabel("Resultado:"));
        panel.add(txtResultado);

        // Eventos
        btnSumar.addActionListener(e -> calcular('+'));
        btnRestar.addActionListener(e -> calcular('-'));
        btnMultiplicar.addActionListener(e -> calcular('*'));
        btnDividir.addActionListener(e -> calcular('/'));

        setContentPane(panel);
    }

    private void calcular(char operador) {
        try {
            double n1 = Double.parseDouble(txt1.getText());
            double n2 = Double.parseDouble(txt2.getText());
            double res = switch (operador) {
                case '+' -> n1 + n2;
                case '-' -> n1 - n2;
                case '*' -> n1 * n2;
                case '/' -> (n2 != 0) ? n1 / n2 : Double.NaN;
                default -> 0;
            };
            txtResultado.setText(String.valueOf(res));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa valores válidos.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculadora().setVisible(true));
    }
}
