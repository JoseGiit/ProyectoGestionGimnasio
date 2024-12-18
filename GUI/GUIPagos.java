/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import DataBase.DataBaseConnection;
import Model.Cliente.ClienteDAO;
import Model.Cliente.ClienteDTO;
import Model.Cliente.ClienteMapper;
import Model.Pago.Pago;
import Model.Pago.PagoDAO;
import Model.Pago.PagoDTO;
import Model.Pago.PagoMapper;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
/*import Clientes.ListaCliente;
import Envios.Envio;
import Envios.GestionEnvios;
import Paquetes.ListaPaquete;
import Paquetes.Paquete;
import RutasEntrega.ListaRutasEntrega;
import RutasEntrega.RutaEntrega;
*/import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.Document;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author PC
 */
public class GUIPagos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEmpleados
     */
    PagoDAO dao;
    PagoMapper mapper;
    public GUIPagos() throws SQLException {
        initComponents();
        dao = new PagoDAO(DataBaseConnection.getConnection());
        DisableorActiveAll(false);
        mapper = new PagoMapper();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AddLbl = new javax.swing.JLabel();
        buscarLbl = new javax.swing.JLabel();
        ListoLbl = new javax.swing.JButton();
        CancelLbl = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        IdPago = new javax.swing.JLabel();
        idpagotxt = new javax.swing.JTextField();
        FechaNLbl = new javax.swing.JLabel();
        ClienteLbl = new javax.swing.JLabel();
        IdClientetxt = new javax.swing.JTextField();
        TotalLbl = new javax.swing.JLabel();
        FechaTxt = new javax.swing.JFormattedTextField();
        subtotaLbl = new javax.swing.JLabel();
        ImpuestoLbl = new javax.swing.JLabel();
        SubTotalTxt = new javax.swing.JFormattedTextField();
        impuestotxt = new javax.swing.JFormattedTextField();
        Totaltxt = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setPreferredSize(new java.awt.Dimension(840, 421));

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jPanel2.setBackground(new java.awt.Color(255, 206, 84));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                            Administrar Pagos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(33, 37, 41));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Opciones");

        AddLbl.setBackground(new java.awt.Color(255, 255, 255));
        AddLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AddLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-new-24.png"))); // NOI18N
        AddLbl.setText("Agregar");
        AddLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddLblMouseClicked(evt);
            }
        });

        buscarLbl.setBackground(new java.awt.Color(255, 255, 255));
        buscarLbl.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        buscarLbl.setForeground(new java.awt.Color(255, 255, 255));
        buscarLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-google-web-search-24.png"))); // NOI18N
        buscarLbl.setText("Buscar");
        buscarLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarLblMouseClicked(evt);
            }
        });

        ListoLbl.setBackground(new java.awt.Color(33, 37, 41));
        ListoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-casilla-de-verificación-marcada-24.png"))); // NOI18N
        ListoLbl.setBorderPainted(false);
        ListoLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListoLblMouseClicked(evt);
            }
        });
        ListoLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListoLblActionPerformed(evt);
            }
        });

        CancelLbl.setBackground(new java.awt.Color(33, 37, 41));
        CancelLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-24.png"))); // NOI18N
        CancelLbl.setBorderPainted(false);
        CancelLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelLblMouseClicked(evt);
            }
        });
        CancelLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(buscarLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(AddLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buscarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanel5.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        IdPago.setBackground(new java.awt.Color(153, 153, 153));
        IdPago.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        IdPago.setForeground(new java.awt.Color(153, 153, 153));
        IdPago.setText("Id de pago");

        idpagotxt.setEditable(false);
        idpagotxt.setBackground(new java.awt.Color(204, 204, 204));
        idpagotxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        idpagotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpagotxtActionPerformed(evt);
            }
        });

        FechaNLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        FechaNLbl.setForeground(new java.awt.Color(153, 153, 153));
        FechaNLbl.setText("Fecha:");

        ClienteLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ClienteLbl.setForeground(new java.awt.Color(153, 153, 153));
        ClienteLbl.setText(" Cliente:");

        IdClientetxt.setBackground(new java.awt.Color(204, 204, 204));
        IdClientetxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IdClientetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdClientetxtActionPerformed(evt);
            }
        });

        TotalLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TotalLbl.setForeground(new java.awt.Color(153, 153, 153));
        TotalLbl.setText("Total:");

        FechaTxt.setBackground(new java.awt.Color(204, 204, 204));
        FechaTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        FechaTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaTxtActionPerformed(evt);
            }
        });

        subtotaLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        subtotaLbl.setForeground(new java.awt.Color(153, 153, 153));
        subtotaLbl.setText("Subtotal:");

        ImpuestoLbl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ImpuestoLbl.setForeground(new java.awt.Color(153, 153, 153));
        ImpuestoLbl.setText("Impuesto:");

        SubTotalTxt.setBackground(new java.awt.Color(204, 204, 204));
        SubTotalTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        SubTotalTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SubTotalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalTxtActionPerformed(evt);
            }
        });
        SubTotalTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SubTotalTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SubTotalTxtKeyReleased(evt);
            }
        });

        impuestotxt.setBackground(new java.awt.Color(204, 204, 204));
        impuestotxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        impuestotxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        impuestotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impuestotxtActionPerformed(evt);
            }
        });
        impuestotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                impuestotxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                impuestotxtKeyReleased(evt);
            }
        });

        Totaltxt.setEditable(false);
        Totaltxt.setBackground(new java.awt.Color(204, 204, 204));
        Totaltxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        Totaltxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Totaltxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaltxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subtotaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(FechaNLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                            .addComponent(IdPago)
                                            .addComponent(ClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FechaTxt)
                                            .addComponent(IdClientetxt)
                                            .addComponent(idpagotxt))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(ImpuestoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(TotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(76, 76, 76))
                                            .addComponent(SubTotalTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Totaltxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(impuestotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdPago, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subtotaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idpagotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SubTotalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ClienteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImpuestoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FechaNLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(IdClientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(impuestotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Totaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idpagotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpagotxtActionPerformed
        // TODO add your hhandling code here:
    }//GEN-LAST:event_idpagotxtActionPerformed

    private void IdClientetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdClientetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdClientetxtActionPerformed

    private void AddLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddLblMouseClicked
       this.ClearTxt();
        DisableorActiveAll(true);
       IdPago.setEnabled(false);
       IdPago.setVisible(false);
        idpagotxt.setEnabled(false);
       idpagotxt.setVisible(false);
    }//GEN-LAST:event_AddLblMouseClicked
 
    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
        // TODO add your handling code here:
        this.ClearTxt();  
        DisableorActiveAll(false);
        this.IdPago.setEnabled(true);
         this.IdPago.setVisible(true);
          this.IdPago.setText("Numero de Envio a Buscar");
           this.idpagotxt.setEditable(true);
        this.idpagotxt.setEnabled(true);
        this.idpagotxt.setVisible(true);
    }//GEN-LAST:event_buscarLblMouseClicked

    private void CancelLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelLblMouseClicked
this.ClearTxt();
this.DisableorActiveAll(false);

    }//GEN-LAST:event_CancelLblMouseClicked

    private void ListoLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListoLblMouseClicked
   
    }//GEN-LAST:event_ListoLblMouseClicked

    private void ListoLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListoLblActionPerformed
       
     if (IdPago.isVisible()) {
        try {
            PagoDTO dto = dao.read(Integer.valueOf(idpagotxt.getText()));
            Pago pago = mapper.toEnt(dto);

            this.DisableorActiveAll(true);
            subtotaLbl.setEnabled(false);
            subtotaLbl.setVisible(false);
            SubTotalTxt.setEnabled(false);
            SubTotalTxt.setVisible(false);
            ImpuestoLbl.setEnabled(false);
            ImpuestoLbl.setVisible(false);
            TotalLbl.setEnabled(false);
            TotalLbl.setVisible(false);
            Totaltxt.setEnabled(false);
            Totaltxt.setVisible(false);
            impuestotxt.setVisible(false);
            impuestotxt.setEnabled(false);

            IdClientetxt.setText(String.valueOf(pago.getCliente().getId()));
            FechaTxt.setText(String.valueOf(pago.getFecha()));

        } catch (SQLException ex) {
            Logger.getLogger(GUIPagos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al leer el pago: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else if (!IdClientetxt.getText().isEmpty() && !FechaTxt.getText().isEmpty() &&
               !SubTotalTxt.getText().isEmpty() && !impuestotxt.getText().isEmpty() &&
               !Totaltxt.getText().isEmpty()) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date(); // Obtener la fecha actual automáticamente

        ClienteMapper clientemapper = new ClienteMapper();
        ClienteDAO clientedao;

        try {
            // Validar cliente
            clientedao = new ClienteDAO(DataBaseConnection.getConnection());
            int idCliente = Integer.parseInt(IdClientetxt.getText());
            ClienteDTO clienteDTO = clientedao.read(idCliente);

            if (clienteDTO == null) {
                JOptionPane.showMessageDialog(this, "El cliente con ID " + idCliente + " no existe.",
                        "Cliente no encontrado", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Generar fecha actual
            fechaActual = new Date();  // Fecha actual

            double subTotal = 0.0;
            try {
                String subTotalText = SubTotalTxt.getText().trim();
                subTotalText = subTotalText.replace(",", "");  // Eliminar comas si las hay
                subTotal = Double.parseDouble(subTotalText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El SubTotal no es válido. Asegúrese de que es un número.",
                        "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar impuesto
            double impuesto = 0.0;
            try {
                String impuestoText = impuestotxt.getText().trim();
                impuestoText = impuestoText.replace(",", ""); // Eliminar comas si las hay
                impuesto = Double.parseDouble(impuestoText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El Impuesto no es válido. Asegúrese de que es un número.",
                        "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Validar Total
            double total = 0.0;
            try {
                String totalText = Totaltxt.getText().trim();
                totalText = totalText.replace(",", "");  // Eliminar comas si las hay
                total = Double.parseDouble(totalText);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "El Total no es válido. Asegúrese de que es un número.",
                        "Error de formato", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear el pago
            Pago ent = new Pago(clientemapper.toEnt(clienteDTO), fechaActual, subTotal, impuesto, total);
            dao.create(mapper.toDTO(ent));
            this.ClearTxt();
            

            // Generar PDF con la información del pago
           

        } catch (SQLException ex) {
            Logger.getLogger(GUIPagos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error al procesar el pago: " + ex.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);

        } catch (NumberFormatException ex) {
            Logger.getLogger(GUIPagos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error en el formato numérico: " + ex.getMessage(),
                    "Error de formato", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_ListoLblActionPerformed

    private void FechaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaTxtActionPerformed

    private void CancelLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelLblActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CancelLblActionPerformed

    private void SubTotalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalTxtActionPerformed

    private void impuestotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impuestotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impuestotxtActionPerformed

    private void TotaltxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaltxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaltxtActionPerformed

    private void SubTotalTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubTotalTxtKeyPressed
       
    }//GEN-LAST:event_SubTotalTxtKeyPressed

    private void impuestotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_impuestotxtKeyPressed
    }//GEN-LAST:event_impuestotxtKeyPressed

    private void impuestotxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_impuestotxtKeyReleased
        actualizarTotal();
    }//GEN-LAST:event_impuestotxtKeyReleased

    private void SubTotalTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubTotalTxtKeyReleased
actualizarTotal();
    }//GEN-LAST:event_SubTotalTxtKeyReleased

public void DisableorActiveAll(boolean bool){
    this.IdPago.setEnabled(bool);
    this.IdPago.setVisible(bool);
    this.idpagotxt.setEnabled(bool);
    this.idpagotxt.setVisible(bool);
    
    this.ClienteLbl.setEnabled(bool);
    this.ClienteLbl.setVisible(bool);
    this.IdClientetxt.setEnabled(bool);
    this.IdClientetxt.setVisible(bool);
    
    this.subtotaLbl.setEnabled(bool);
    this.subtotaLbl.setVisible(bool);
    this.SubTotalTxt.setEnabled(bool);
    this.SubTotalTxt.setVisible(bool);
    
 
    this.FechaTxt.setEnabled(bool);
    this.FechaTxt.setVisible(bool);
    this.FechaNLbl.setEnabled(bool);
    this.FechaNLbl.setVisible(bool);
    
    this.ImpuestoLbl.setEnabled(bool);
    this.ImpuestoLbl.setVisible(bool);
    this.impuestotxt.setEnabled(bool);
    this.impuestotxt.setVisible(bool);
    
    this.TotalLbl.setEnabled(bool);
    this.TotalLbl.setVisible(bool);
    this.Totaltxt.setEnabled(bool);
    this.Totaltxt.setVisible(bool);

    





}

public void ClearTxt(){
     this.IdClientetxt.setText("");
     this.idpagotxt.setText("");
     this.SubTotalTxt.setText("");
     this.Totaltxt.setText("");
     this.FechaTxt.setText("");
     impuestotxt.setText("");
       
}
 public LocalDate convertirStringAFecha(String fechaStr) {
        try {
            if (fechaStr == null || fechaStr.isEmpty()) {
                throw new IllegalArgumentException("La fecha no puede estar vacía.");
            }
            
            // Especifica el formato de la fecha si es necesario
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
            
            // Intenta parsear el String a LocalDate
            return LocalDate.parse(fechaStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
            return null; // O manejar el error según sea necesario
        }
    }

private void actualizarTotal() {
    try {
        if (!SubTotalTxt.getText().isEmpty() && !impuestotxt.getText().isEmpty()) {
            double subTotal = Double.parseDouble(SubTotalTxt.getText());
            double impuesto = Double.parseDouble(impuestotxt.getText());
            double total = subTotal + (subTotal * (impuesto / 100)); // Correcta aplicación del porcentaje
            Totaltxt.setText(String.format("%.2f", total)); // Formato a dos decimales
        }
    } catch (NumberFormatException e) {
        Totaltxt.setText(""); // Limpia el campo si los valores no son válidos
    }
}
  
   public static boolean isFechaAntesDeHoy(String fechaTexto) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Verifica si el campo de texto no está vacío
            if (fechaTexto == null || fechaTexto.trim().isEmpty()) {
                throw new IllegalArgumentException("El campo de fecha está vacío.");
            }

            // Convierte el texto de la fecha a un objeto Date
            Date fechaIngresada = formatter.parse(fechaTexto);

            // Obtiene la fecha actual
            Date fechaActual = new Date();

            // Comprueba si la fecha ingresada es anterior a la fecha actual
            return fechaIngresada.before(fechaActual);

        }catch (IllegalArgumentException e) {
            // Maneja el caso de campo de texto vacío u otro error
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "El campo de fecha no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Captura y maneja el error de parseo de la fecha
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddLbl;
    private javax.swing.JButton CancelLbl;
    private javax.swing.JLabel ClienteLbl;
    private javax.swing.JLabel FechaNLbl;
    private javax.swing.JFormattedTextField FechaTxt;
    private javax.swing.JTextField IdClientetxt;
    private javax.swing.JLabel IdPago;
    private javax.swing.JLabel ImpuestoLbl;
    private javax.swing.JButton ListoLbl;
    private javax.swing.JFormattedTextField SubTotalTxt;
    private javax.swing.JLabel TotalLbl;
    private javax.swing.JFormattedTextField Totaltxt;
    private javax.swing.JLabel buscarLbl;
    private javax.swing.JTextField idpagotxt;
    private javax.swing.JFormattedTextField impuestotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel subtotaLbl;
    // End of variables declaration//GEN-END:variables
}
