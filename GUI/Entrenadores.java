/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;




import Model.Entrenador.EntrenadorDAO;
import Model.Entrenador.EntrenadorDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Entrenadores extends JInternalFrame {

    private JTable tableEntrenadores;
    private DefaultTableModel tableModel;
    private EntrenadorDAO entrenadorDAO;

    public Entrenadores(Connection connection) {
        super("Entrenadores", true, true, true, true);

        this.entrenadorDAO = new EntrenadorDAO(connection);

        // Configuración del layout
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.decode("#F4F6F7")); // Fondo claro

        // Panel superior
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.decode("#FFA500")); // Fondo naranja
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Lista de Entrenadores");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(titleLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Crear el modelo de la tabla
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
                "ID", "Nombre", "Especialidad", "Teléfono"
        });

        // Crear la tabla
        tableEntrenadores = new JTable(tableModel);
        tableEntrenadores.setFillsViewportHeight(true);
        tableEntrenadores.getTableHeader().setBackground(Color.decode("#FFA500")); // Fondo naranja
        tableEntrenadores.getTableHeader().setForeground(Color.GRAY);
        tableEntrenadores.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tableEntrenadores.setRowHeight(30); // Altura de las filas

        // Ajustar tamaño de columnas (opcional)
        tableEntrenadores.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tableEntrenadores.getColumnModel().getColumn(1).setPreferredWidth(200); // Nombre
        tableEntrenadores.getColumnModel().getColumn(2).setPreferredWidth(200); // Especialidad
        tableEntrenadores.getColumnModel().getColumn(3).setPreferredWidth(100); // Teléfono

        // Crear el panel con scroll y ajustar el tamaño
        JScrollPane scrollPane = new JScrollPane(tableEntrenadores);
        scrollPane.setPreferredSize(new Dimension(800, 400)); // Tamaño para acomodar la tabla
        add(scrollPane, BorderLayout.CENTER);

        // Cargar los datos
        try {
            cargarEntrenadores();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos de los entrenadores: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Tamaño del frame
        setSize(840, 521);
    }

    private void cargarEntrenadores() throws SQLException {
        tableModel.setRowCount(0);
        List<EntrenadorDTO> entrenadores = entrenadorDAO.readAll();
        for (EntrenadorDTO entrenador : entrenadores) {
            tableModel.addRow(new Object[]{
                    entrenador.getId(),
                    entrenador.getNombre(),
                    entrenador.getEspecialidades(),
                    entrenador.getContacto()
            });
        }
    }
    
}