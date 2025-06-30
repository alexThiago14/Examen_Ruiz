package ficheros.clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class DatosPersona extends JFrame {
    private JTextField txtNombres, txtApellidos, txtEdad, txtDireccion, txtCorreo, txtTelefono, txtNacionalidad;
    private JButton btnGuardar;

    public DatosPersona() {
        setTitle("Hoja de Vida");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear panel y layout
        JPanel panel = new JPanel(new GridLayout(8, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Campos y etiquetas
        panel.add(new JLabel("Nombres:"));
        txtNombres = new JTextField();
        panel.add(txtNombres);

        panel.add(new JLabel("Apellidos:"));
        txtApellidos = new JTextField();
        panel.add(txtApellidos);

        panel.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panel.add(txtEdad);

        panel.add(new JLabel("Direccion:"));
        txtDireccion = new JTextField();
        panel.add(txtDireccion);

        panel.add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        panel.add(txtCorreo);

        panel.add(new JLabel("Telefono:"));
        txtTelefono = new JTextField();
        panel.add(txtTelefono);

        panel.add(new JLabel("Nacionalidad"));
        txtNacionalidad = new JTextField();
        panel.add(txtNacionalidad);

        // Botón guardar
        btnGuardar = new JButton("Guardar");
        panel.add(btnGuardar);

        // Espacio vacío
        panel.add(new JLabel());

        // Acción del botón
        btnGuardar.addActionListener((ActionEvent e) -> guardarDatos());

        setContentPane(panel);
    }

    private void guardarDatos() {
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String edad = txtEdad.getText();
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        String nacionalidad = txtNacionalidad.getText();

        String contenido = "HOJA DE VIDA\n"
                + "Nombres: " + nombres + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Edad: " + edad + "\n"
                + "Dirección: " + direccion + "\n"
                + "Correo: " + correo + "\n"
                + "Teléfono: " + telefono + "\n";

        try (FileWriter writer = new FileWriter("hoja_vida.txt")) {
            writer.write(contenido);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente en hoja_vida.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DatosPersona().setVisible(true));
    }
}

