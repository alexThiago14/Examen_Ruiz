package ficheros.clases;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HorarioClases {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Horario de Clases Jhonatan Ruiz");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 350);
        frame.setLayout(new BorderLayout());

        // Columnas
        String[] columnas = {"Hora", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};

        // Filas
        Object[][] datos = {
                {"7h00", "Base de Datos", "Gestion de Proyectos", "Gestion de Proyectos", "POO", ""},
                {"8h00", "", "", "", "", ""},
                {"9h00", "Base de Datos", "", "", "", ""},
                {"10h00", "", "", "Gestion de Proyectos", "POO", "Diseño Interfaces"},
                {"11h00", "POO", "Analisis de Datos", "Base de Datos", "", "Diseño Interfaces"},
                {"12h00", "POO", "", "", "", ""},
                {"13h00", "POO", "Analisis de Datos", "Base de Datos", "", "Diseño Interfaces"}
        };
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane(tabla);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Botón Guardar Archivo
        JButton btnGuardar = new JButton("Guardar Archivo");
        frame.add(btnGuardar, BorderLayout.SOUTH);

        // Acción al presionar el botón
        btnGuardar.addActionListener((ActionEvent e) -> {
            guardarTablaEnArchivo(tabla);
        });

        frame.setVisible(true);
    }

    // Método para guardar la tabla en un archivo de texto
    private static void guardarTablaEnArchivo(JTable tabla) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("horario_clases.txt"))) {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();

            // Escribir columnas
            for (int col = 0; col < modelo.getColumnCount(); col++) {
                bw.write(modelo.getColumnName(col) + "\t");
            }
            bw.newLine();

            // Escribir filas
            for (int fila = 0; fila < modelo.getRowCount(); fila++) {
                for (int col = 0; col < modelo.getColumnCount(); col++) {
                    Object valor = modelo.getValueAt(fila, col);
                    bw.write((valor != null ? valor.toString() : "") + "\t");
                }
                bw.newLine();
            }

            JOptionPane.showMessageDialog(null, "Archivo guardado como horario_clases.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar archivo: " + ex.getMessage());
        }
    }
}

