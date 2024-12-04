/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

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
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author PC
 */
public class GUIPagos extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEmpleados
     */
    /*private ListaPaquete listP;
    private ListaCliente listC;
    private GestionEnvios listE;
    private ListaRutasEntrega listR;*/
    public GUIPagos() {
        /*initComponents();
        DisableorActiveAll(false);
        listP = ListaPaquete.getInstance();
        listE = GestionEnvios.getInstance();
        listC = ListaCliente.getInstance();
       listR= ListaRutasEntrega.getInstance();*/
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
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/imagenes/icons8-trabajo-permanente-24.png"))); // NOI18N
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

        IdClientetxt.setEditable(false);
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
        FechaTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy -MM-dd"))));
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
        SubTotalTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        SubTotalTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SubTotalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalTxtActionPerformed(evt);
            }
        });

        impuestotxt.setBackground(new java.awt.Color(204, 204, 204));
        impuestotxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        impuestotxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        impuestotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impuestotxtActionPerformed(evt);
            }
        });

        Totaltxt.setBackground(new java.awt.Color(204, 204, 204));
        Totaltxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
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
      
    }//GEN-LAST:event_AddLblMouseClicked
 
    private void buscarLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarLblMouseClicked
        // TODO add your handling code here:
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
        // TODO add your handling code here:
//        if(NombreLbl.isVisible()){
//          try {
//              if( isFechaAntesDeHoy(this.FechaETxt.getText())){
//                  JOptionPane.showMessageDialog(null, "La fecha de entrega no puede ser anterior a la fecha actual", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//              }else if(listC.SearchCliente(CedulaTxt.getText())==null){
//                  JOptionPane.showMessageDialog(null, "El cliente no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//              }else{
//                  Envio envio  = new Envio(listC.SearchCliente(CedulaTxt.getText()),
//                          listP.buscarPaquete(jComboBoxPaquete.getSelectedItem().toString()),
//                          listR.buscarRuta(jComboBoxRuta.getSelectedItem().toString()),convertirStringAFecha(this.FechaETxt.getText()));
//                  System.out.println("entro a fecha envio "+this.FechaETxt.getText());
//                  System.out.println(envio.getRuta().getDescripcion());
//                  listE.registrarEnvio(envio);
//                 
//             
//                  JOptionPane.showMessageDialog(null, "Envio Registrado, Codigo : "+envio.getNumeroEnvio(), "A nombre del cliente: "+listC.SearchCliente(CedulaTxt.getText()).getNombre(), JOptionPane.WARNING_MESSAGE);
//                       this.ClearTxt();
//                  this.DisableorActiveAll(false); 
//              }
//          } catch (ParseException ex) {
//              Logger.getLogger(FrmEnvios.class.getName()).log(Level.SEVERE, null, ex);
//          }
//  }else if(CedulaLbl.getText().equals("Numero de Envio a Buscar")){
//       if(listE.buscarEnvio(Integer.parseInt(this.NumeroEnvioTxt.getText()))!=null){
//     
//            Envio envio = listE.buscarEnvio(Integer.parseInt(this.NumeroEnvioTxt.getText()));
//            this.NumeroEnvioTxt.setText(String.valueOf(envio.getNumeroEnvio()));
//            this.CedulaTxt.setText(envio.getCliente().getCedula());
//            this.NombreTxt.setText(envio.getCliente().getNombre());
//            FechaETxt.setText(String.valueOf(envio.getFechaEntrega()));
//            FechaETxt1.setText(String.valueOf(envio.getFechaEntrega()));
//            jComboBoxPaquete.addItem(envio.getPaquete().getCodigo());
//            jComboBoxRuta.addItem(envio.getRuta().getCodigo());
//            this.EstadoTxt.setText(envio.getEstado());
//            DisableorActiveAll(true);
//            }else{
//                JOptionPane.showMessageDialog(null, "El envio no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//            }
//  }else if(CedulaLbl.getText().equals("Presione listo para despachar!")){
//                    if(this.listE.getCantidadEnviosNoNulosQ()>0){
//                   listE.despacharEnvio();
//              ClearTxt();
//               JOptionPane.showMessageDialog(null, "Envio Despachado!", "completado", JOptionPane.WARNING_MESSAGE);
//                    }else{
//                       JOptionPane.showMessageDialog(null, "El envio no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//                    }
//  }else if (CedulaLbl.getText().equals("Numero de Envio a Entregar")){
//      if(listE.buscarEnvio(Integer.parseInt(NumeroEnvioTxt.getText()))!=null){
//            if(this.listE.getCantidadEnviosNoNulosQ()>0){
//       listE.entregarEnvio(Integer.parseInt(NumeroEnvioTxt.getText()));
//       ClearTxt();
//        JOptionPane.showMessageDialog(null, "Envio Entregado!", "completado", JOptionPane.WARNING_MESSAGE);
//            }else{
//            JOptionPane.showMessageDialog(null, "El envio no existe en la cola de envios", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//            }
//  }else{
//       JOptionPane.showMessageDialog(null, "El envio no existe en la cola de envios", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//  }
//  }else if(CedulaLbl.getText().equals("Numero de Envio a Cancelar")){
//      
//          if(listE.buscarEnvio(Integer.parseInt(NumeroEnvioTxt.getText()))!=null){
//              if(this.listE.getCantidadEnviosNoNulosQ()>0){
//       listE.cancelarEnvio(Integer.parseInt(NumeroEnvioTxt.getText()));
//       ClearTxt();
//        JOptionPane.showMessageDialog(null, "Envio Cancelado!", "completado", JOptionPane.WARNING_MESSAGE);
//              }else{
//                        JOptionPane.showMessageDialog(null, "El envio no existe en la cola de envios", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//              }
//  }else{
//       JOptionPane.showMessageDialog(null, "El envio no existe", "informacion incorrecta", JOptionPane.WARNING_MESSAGE);
//  } 
//  }*/
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
  private double calcularPrecio1(double peso) {
        return 2100 + (peso > 1 ? (peso - 1) * 1200 : 0);
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
