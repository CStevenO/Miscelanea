package Vista.Recargas;

import Controlador.CLlave;
import Controlador.CNequi;
import Controlador.CRecargas;
import DAO.GenericDomainTableModel;
import Modelo.MNequi;
import Modelo.MRecargas;
import Modelo.MTuLlave;
import java.awt.event.ActionEvent;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import tablas.TLlave;
import tablas.TNequi;
import tablas.TRecargas;
import tablas.TableCellListener;

/**
 *
 * @author Steve
 */
public class Consultar extends javax.swing.JFrame {
    public Consultar() {
        initComponents();
        boxPlataforma.addItem("tuRed");
        boxPlataforma.addItem("soluciones");
        boxPlataforma.addItem("llave");
        boxPlataforma.addItem("nequi");
        boxPlataforma.addItem("tigo");
        btnActualizar.setEnabled(false);
        //Listener para cuando una celda cambia
        Action action = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                TableCellListener tcl = (TableCellListener)e.getSource();
                System.out.println("Row   : " + tcl.getRow());
                System.out.println("Column: " + tcl.getColumn());
                System.out.println("Old   : " + tcl.getOldValue());
                System.out.println("New   : " + tcl.getNewValue());
                switch(txtTitulo.getText()){
                    case "nequi":
                        GenericDomainTableModel<MNequi> modelN = (GenericDomainTableModel) tableData.getModel();
                        List<MNequi> nequi = modelN.getDomainObjects();
                        int i = 0;
                        while(i<nequi.size()){
                            if(i==0){
                                nequi.get(i).calcular();
                            }
                            else{
                                nequi.get(i).calcular(nequi.get(i-1));
                            }
                            i++;
                        }
                        TNequi nModel = new TNequi();
                        nModel.model.addRows(nequi);
                        tableData.setModel(nModel.getModelo());
                    break;
                    case "llave":
                        GenericDomainTableModel<MTuLlave> modelT = (GenericDomainTableModel) tableData.getModel();
                        List<MTuLlave> llave = modelT.getDomainObjects();
                        int j = 0;
                        while(j<llave.size()){
                            if(j==0){
                                llave.get(j).calcular();
                            }
                            else{
                                llave.get(j).calcular(llave.get(j-1));
                            }
                            j++;
                        }
                        TLlave tModel = new TLlave();
                        tModel.model.addRows(llave);
                        tableData.setModel(tModel.getModelo());
                    break;
                    default:
                        GenericDomainTableModel<MRecargas> modelR = (GenericDomainTableModel) tableData.getModel();
                        List<MRecargas> recarga = modelR.getDomainObjects();
                        int k = 0;
                        while(k<recarga.size()){
                            if(k==0){
                                recarga.get(k).calcular(txtTitulo.getText());
                            }
                            else{
                                recarga.get(k).calcular(txtTitulo.getText(),recarga.get(k-1));
                            }
                            k++;
                        }
                        TRecargas rModel = new TRecargas();
                        rModel.model.addRows(recarga);
                        tableData.setModel(rModel.getModelo());
                }
            }
        };
        TableCellListener tcl = new TableCellListener(tableData, action);
    }
    public void hola(String id,String result){
        JOptionPane.showMessageDialog(this,id+" "+result);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boxPlataforma = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableResults = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dateInicial = new datechooser.beans.DateChooserCombo();
        dateFinal = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        txtTitulo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultas");

        boxPlataforma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boxPlataforma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        boxPlataforma.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxPlataformaItemStateChanged(evt);
            }
        });
        boxPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPlataformaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Plataforma");

        jScrollPane3.setFocusable(false);

        tableResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableResults.setEnabled(false);
        jScrollPane3.setViewportView(tableResults);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fecha Inicial");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Final");

        dateInicial.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        dateFinal.setFieldFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad de datos: ");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.setText("0");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableData.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tableDataInputMethodTextChanged(evt);
            }
        });
        jScrollPane4.setViewportView(tableData);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCantidad))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(boxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(dateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(dateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(356, 356, 356)
                                .addComponent(txtTitulo)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConsultar)
                            .addComponent(btnActualizar))
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxPlataforma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCantidad))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        switch(boxPlataforma.getSelectedItem().toString()){
            case "llave":
                try {
                    TLlave model = new TLlave();
                    Date fechaInicial = new Date(dateInicial.getDateFormat().parse(dateInicial.getText()).getTime());
                    Date fechaFinal = new Date(dateFinal.getDateFormat().parse(dateFinal.getText()).getTime());
                    model.model.addRows(new CLlave().ConsultarRango(fechaInicial, fechaFinal));
                    tableData.setModel(model.getModelo());
                    txtCantidad.setText(model.model.getRowCount()+"");
                    txtTitulo.setText(boxPlataforma.getSelectedItem().toString());
                    btnActualizar.setEnabled(true);
                    List<Long> resultados = new CLlave().total(fechaInicial, fechaFinal);
                    MTuLlave resul = new MTuLlave(resultados,fechaInicial);
                    TLlave suma = new TLlave();
                    suma.model.addRow(resul);
                    tableResults.setModel(suma.getModelo());
                    
                } catch (ParseException ex) {
                    Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
                } 
            break;
            case "nequi":
                try {
                    TNequi model = new TNequi();
                    Date fechaInicial = new Date(dateInicial.getDateFormat().parse(dateInicial.getText()).getTime());
                    Date fechaFinal = new Date(dateFinal.getDateFormat().parse(dateFinal.getText()).getTime());
                    model.model.addRows(new CNequi().ConsultarRango(fechaInicial, fechaFinal));
                    tableData.setModel(model.getModelo());
                    txtCantidad.setText(model.model.getRowCount()+"");
                    txtTitulo.setText(boxPlataforma.getSelectedItem().toString());
                    btnActualizar.setEnabled(true);
                    List<Long> resultados = new CNequi().total(fechaInicial, fechaFinal);
                    MNequi resul = new MNequi(resultados,fechaInicial);
                    TNequi suma = new TNequi();
                    suma.model.addRow(resul);
                    tableResults.setModel(suma.getModelo());
                } catch (ParseException ex) {
                    Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
                } 
            break;
            default:
                try {
                    TRecargas model = new TRecargas();
                    Date fechaInicial = new Date(dateInicial.getDateFormat().parse(dateInicial.getText()).getTime());
                    Date fechaFinal = new Date(dateFinal.getDateFormat().parse(dateFinal.getText()).getTime());
                    model.model.addRows(new CRecargas().ConsultarRango(fechaInicial, fechaFinal, boxPlataforma.getSelectedItem().toString()));
                    tableData.setModel(model.getModelo());
                    txtCantidad.setText(model.model.getRowCount()+"");
                    txtTitulo.setText(boxPlataforma.getSelectedItem().toString());
                    btnActualizar.setEnabled(true);
                    List<Long> resultados = new CRecargas().total(fechaInicial, fechaFinal,boxPlataforma.getSelectedItem().toString());
                    MRecargas resul = new MRecargas(resultados,fechaInicial);
                    TRecargas suma = new TRecargas();
                    suma.model.addRow(resul);
                    tableResults.setModel(suma.getModelo());
                } catch (ParseException ex) {
                    Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
                } 
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void boxPlataformaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxPlataformaItemStateChanged
        
    }//GEN-LAST:event_boxPlataformaItemStateChanged

    private void boxPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPlataformaActionPerformed
        btnActualizar.setEnabled(false);
    }//GEN-LAST:event_boxPlataformaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        switch(txtTitulo.getText()){
            case "nequi":
                GenericDomainTableModel<MNequi> modelN = (GenericDomainTableModel) tableData.getModel();
                List<MNequi> nequi = modelN.getDomainObjects();
                for(MNequi ne:nequi){
                    boolean reca = new CNequi().Actualizar(ne);
                    if(!reca){
                        JOptionPane.showMessageDialog(this,"La fecha: "+ne.getFecha()+" no se actualizó");
                    }
                }
                JOptionPane.showMessageDialog(this,"Listo");
            break;
            case "llave":
                GenericDomainTableModel<MTuLlave> modelL = (GenericDomainTableModel) tableData.getModel();
                List<MTuLlave> llave = modelL.getDomainObjects();
                for(MTuLlave ne:llave){
                    boolean reca = new CLlave().Actualizar(ne);
                    if(!reca){
                        JOptionPane.showMessageDialog(this,"La fecha: "+ne.getFecha()+" no se actualizó");
                    }
                }
                JOptionPane.showMessageDialog(this,"Listo");
            break;
            default:
                if(!txtTitulo.getText().isEmpty()){
                    GenericDomainTableModel<MRecargas> modelR = (GenericDomainTableModel) tableData.getModel();
                    List<MRecargas> recar = modelR.getDomainObjects();
                    for(MRecargas ne:recar){
                        boolean reca = new CRecargas().Actualizar(ne,txtTitulo.getText());
                        if(!reca){
                            JOptionPane.showMessageDialog(this,"La fecha: "+ne.getFecha()+" no se actualizó");
                        }
                    }
                    JOptionPane.showMessageDialog(this,"Listo");
                }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tableDataInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableDataInputMethodTextChanged
        
    }//GEN-LAST:event_tableDataInputMethodTextChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPlataforma;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private datechooser.beans.DateChooserCombo dateFinal;
    private datechooser.beans.DateChooserCombo dateInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tableData;
    private javax.swing.JTable tableResults;
    private javax.swing.JLabel txtCantidad;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
