package Vista.Recargas;

import Controlador.CNequi;
import Modelo.MNequi;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class Nequi extends javax.swing.JFrame {

    /**
     * Creates new form Nequi
     */
    public Nequi() {
        initComponents();
        btnIngresar.setEnabled(false);
        txtMes.setText(new CNequi().mes()+"");
        try {
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            MNequi recarga = new CNequi().Consultar(sqlDate);
            recarga.calcular();
            txtRecargas.setText(recarga.getRecargas()+"");
            txtRetiros.setText(recarga.getRetiros()+"");
            txtGanancias.setText(recarga.getGanancias()+"");
            txtCaja.setText(recarga.getCaja()+"");
            txtSaldo.setText(recarga.getSaldo()+"");
            txtIngreso.setText(recarga.getIngreso()+"");
            txtEgreso.setText(recarga.getEgreso()+"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error: "+e);
        }
    }
    public void limpiar(){
        txtRecargas.setText(0+"");
        txtRetiros.setText(0+"");
        txtGanancias.setText(0+"");
        txtCaja.setText(0+"");
        txtSaldo.setText(0+"");
        txtIngreso.setText(0+"");
        txtEgreso.setText(0+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtRecargas = new javax.swing.JTextField();
        txtRetiros = new javax.swing.JTextField();
        txtGanancias = new javax.swing.JTextField();
        txtCaja = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtIngreso = new javax.swing.JTextField();
        txtEgreso = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtFecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nequi");

        jLabel1.setText("Fecha");

        jLabel2.setText("Recargas");

        jLabel3.setText("Retiros");

        jLabel4.setText("Ganancias");

        jLabel5.setText("Plata en caja");

        jLabel6.setText("Saldo");

        jLabel7.setText("Ingreso");

        jLabel8.setText("Egreso");

        jLabel9.setText("Movimiento mes");

        txtRecargas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecargasFocusLost(evt);
            }
        });

        txtRetiros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRetirosFocusLost(evt);
            }
        });

        txtGanancias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGananciasFocusLost(evt);
            }
        });

        txtCaja.setEditable(false);
        txtCaja.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCajaFocusLost(evt);
            }
        });

        txtSaldo.setEditable(false);
        txtSaldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSaldoFocusLost(evt);
            }
        });

        txtIngreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIngresoFocusLost(evt);
            }
        });
        txtIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresoActionPerformed(evt);
            }
        });

        txtEgreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEgresoFocusLost(evt);
            }
        });

        txtMes.setEditable(false);
        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMesFocusLost(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultas");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtFecha.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    txtFecha.setFormat(2);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtRecargas)
                        .addComponent(txtRetiros)
                        .addComponent(txtGanancias)
                        .addComponent(txtCaja)
                        .addComponent(txtSaldo)
                        .addComponent(txtIngreso)
                        .addComponent(txtEgreso)
                        .addComponent(txtMes)
                        .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(btnIngresar)
                            .addGap(18, 18, 18)
                            .addComponent(btnConsultar)
                            .addGap(18, 18, 18)
                            .addComponent(btnActualizar)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(167, 167, 167)
                            .addComponent(btnVolver)))
                    .addGap(0, 18, Short.MAX_VALUE)))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel1)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtRecargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(txtRetiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(txtIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(txtEgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnIngresar)
                .addComponent(btnConsultar)
                .addComponent(btnActualizar)
                .addComponent(btnEliminar))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnVolver)
            .addContainerGap(17, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            MNequi recarga = new MNequi();
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            recarga.setFecha(sqlDate);
            recarga.setRecargas(Long.parseLong(txtRecargas.getText()));
            recarga.setRetiros(Long.parseLong(txtRetiros.getText()));
            recarga.setGanancias(Long.parseLong(txtGanancias.getText()));
            recarga.setCaja(Long.parseLong(txtCaja.getText()));
            recarga.setSaldo(Long.parseLong(txtSaldo.getText()));
            recarga.setIngreso(Long.parseLong(txtIngreso.getText()));
            recarga.setEgreso(Long.parseLong(txtEgreso.getText()));
            recarga.calcular();
            boolean reca = new CNequi().Insertar(recarga);
            String mensaje = reca?"Nequi Registrado":"Nequi NO Registrado";
            limpiar();
            JOptionPane.showMessageDialog(this,mensaje);
            btnIngresar.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            boolean reca = new CNequi().Eliminar(sqlDate);
            String mensaje = reca?"Nequi Eliminado":"Nequi NO Eliminado";
            JOptionPane.showMessageDialog(this,mensaje);
        } catch (ParseException ex) {
            Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(btnActualizar.getText().equals("Actualizar")){
            try {
                btnActualizar.setText("Cargar");
                btnEliminar.setEnabled(false);
                btnConsultar.setEnabled(false);
                Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
                MNequi recarga = new CNequi().Consultar(sqlDate);
                recarga.calcular();
                txtRecargas.setText(recarga.getRecargas()+"");
                txtRetiros.setText(recarga.getRetiros()+"");
                txtGanancias.setText(recarga.getGanancias()+"");
                txtCaja.setText(recarga.getCaja()+"");
                txtSaldo.setText(recarga.getSaldo()+"");
                txtIngreso.setText(recarga.getIngreso()+"");
                txtEgreso.setText(recarga.getEgreso()+"");
            } catch (ParseException ex) {
                Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                btnActualizar.setText("Actualizar");
                btnEliminar.setEnabled(true);
                btnConsultar.setEnabled(true);
                MNequi recarga = new MNequi();
                Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
                recarga.setFecha(sqlDate);
                recarga.setRecargas(Long.parseLong(txtRecargas.getText()));
                recarga.setRetiros(Long.parseLong(txtRetiros.getText()));
                recarga.setGanancias(Long.parseLong(txtGanancias.getText()));
                recarga.setCaja(Long.parseLong(txtCaja.getText()));
                recarga.setSaldo(Long.parseLong(txtSaldo.getText()));
                recarga.setIngreso(Long.parseLong(txtIngreso.getText()));
                recarga.setEgreso(Long.parseLong(txtEgreso.getText()));
                recarga.calcular();
                boolean reca = new CNequi().Actualizar(recarga);
                String mensaje = reca?"Nequi Actualizado":"Nequi NO Actualizado";
                limpiar();
                JOptionPane.showMessageDialog(this,mensaje);
            } catch (ParseException ex) {
                Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtRecargasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecargasFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtRecargasFocusLost

    private void txtRetirosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRetirosFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtRetirosFocusLost

    private void txtGananciasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGananciasFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtGananciasFocusLost

    private void txtCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCajaFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtCajaFocusLost

    private void txtSaldoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaldoFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtSaldoFocusLost

    private void txtIngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIngresoFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtIngresoFocusLost

    private void txtEgresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEgresoFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtEgresoFocusLost

    private void txtMesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusLost
        boolean reca = txtRecargas.getText().isEmpty()||txtRetiros.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtIngreso.getText().isEmpty()||txtEgreso.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtMesFocusLost

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Consultar objConsulta = new Consultar();
        objConsulta.setVisible(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Nequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nequi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nequi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtEgreso;
    private datechooser.beans.DateChooserCombo txtFecha;
    private javax.swing.JTextField txtGanancias;
    private javax.swing.JTextField txtIngreso;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtRecargas;
    private javax.swing.JTextField txtRetiros;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}