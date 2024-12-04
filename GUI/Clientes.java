/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author PC
 */

import Model.Cliente.ClienteDAO;
import Model.Cliente.ClienteDTO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Clientes extends JInternalFrame {

    private JTable tableClientes;
    private DefaultTableModel tableModel;
    private ClienteDAO clienteDAO;

    public Clientes(Connection connection) {
        super("Clientes", true, true, true, true);

        this.clienteDAO = new ClienteDAO(connection);

        // Configuración del layout
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.decode("#F4F6F7")); // Fondo claro

        // Panel superior
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(Color.decode("#2ECC71")); // Fondo verde
        headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Lista de Clientes");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        headerPanel.add(titleLabel);
        add(headerPanel, BorderLayout.NORTH);

        // Crear el modelo de la tabla
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[]{
                "ID", "Nombre", "Correo", "Teléfono"
        });

        // Crear la tabla
        tableClientes = new JTable(tableModel);
        tableClientes.setFillsViewportHeight(true);
        tableClientes.getTableHeader().setBackground(Color.decode("#2ECC71")); // Fondo verde
        tableClientes.getTableHeader().setForeground(Color.GRAY);
        tableClientes.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        tableClientes.setRowHeight(30); // Altura de las filas

        // Ajustar tamaño de columnas (opcional)
        tableClientes.getColumnModel().getColumn(0).setPreferredWidth(50);  // ID
        tableClientes.getColumnModel().getColumn(1).setPreferredWidth(200); // Nombre
        tableClientes.getColumnModel().getColumn(2).setPreferredWidth(200); // Correo
        tableClientes.getColumnModel().getColumn(3).setPreferredWidth(100); // Teléfono

        // Crear el panel con scroll y ajustar el tamaño
        JScrollPane scrollPane = new JScrollPane(tableClientes);
        scrollPane.setPreferredSize(new Dimension(800, 400)); // Tamaño para acomodar la tabla
        add(scrollPane, BorderLayout.CENTER);

        // Cargar los datos
        try {
            cargarClientes();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los datos de los clientes: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Tamaño del frame
        setSize(840, 521);
    }

    private void cargarClientes() throws SQLException {
        tableModel.setRowCount(0);
        List<ClienteDTO> clientes = clienteDAO.readAll();
        for (ClienteDTO cliente : clientes) {
            tableModel.addRow(new Object[]{
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getCorreo(),
                    cliente.getTelefono()
            });
        }
    }
}