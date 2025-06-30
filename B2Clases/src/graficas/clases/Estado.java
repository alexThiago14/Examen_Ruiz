package graficas.clases;

import javax.swing.*;
import java.awt.*;

public class Estado extends JFrame {
    private JComboBox<String> comboBox1;
    private JButton enviarButton;

    public Estado() {
        setTitle("Estado Civil");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel label = new JLabel("Elige tu estado civil:", SwingConstants.CENTER);
        comboBox1 = new JComboBox<>(new String[]{"Soltero", "Casado", "Viudo", "Divorciado"});
        enviarButton = new JButton("Enviar");

        enviarButton.addActionListener(e -> {
            String estado = (String) comboBox1.getSelectedItem();
            JOptionPane.showMessageDialog(this, "Has seleccionado: " + estado);
        });

        panel.add(label);
        panel.add(comboBox1);
        panel.add(enviarButton);

        setContentPane(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Estado().setVisible(true));
    }
}
