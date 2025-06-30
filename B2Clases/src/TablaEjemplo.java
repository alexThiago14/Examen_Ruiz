import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class TablaEjemplo {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Ejemplo de JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Datos de ejemplo
        String[] columnas = {"ID", "Nombre", "Edad"};
        Object[][] datos = {
                {1, "Ana", 20},
                {2, "Luis", 25},
                {3, "Carlos", 30}
        };

        // Crear modelo de tabla
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);

        // Scroll para la tabla
        JScrollPane scrollPane = new JScrollPane(tabla);
        frame.add(scrollPane);

        // Mostrar ventana
        frame.setVisible(true);
    }
}

