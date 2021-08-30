package Vista.Recargas;

import Controlador.CRecargas;
import Modelo.MRecargas;
import java.sql.Date;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Steve
 */
public class Soluciones extends javax.swing.JFrame {

    /**
     * Creates new form Tigo
     */
    public Soluciones() {
        initComponents();
        btnIngresar.setEnabled(false);
        try {
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            MRecargas recarga = new CRecargas().Consultar(sqlDate, "soluciones");
            recarga.calcular("soluciones");
            txtPagado.setText(recarga.getPagado()+"");
            txtRecargado.setText(recarga.getRecargado()+"");
            txtDebe.setText(recarga.getDebe()+"");
            txtVentas.setText(recarga.getVentas()+"");
            txtSaldo.setText(recarga.getSaldo()+"");
            txtGanancias.setText(recarga.getGanancias()+"");
            txtCaja.setText(recarga.getCaja()+"");
            txtSugerencia.setText(recarga.getSugerencia()+"");
            txtRetiro.setText(recarga.getRetiro()+"");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Error: "+e);
        }
    }
    public void limpiar(){
        txtPagado.setText(0+"");
        txtRecargado.setText(0+"");
        txtDebe.setText(0+"");
        txtVentas.setText(0+"");
        txtSaldo.setText(0+"");
        txtGanancias.setText(0+"");
        txtCaja.setText(0+"");
        txtSugerencia.setText(0+"");
        txtRetiro.setText(0+"");
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
        jLabel10 = new javax.swing.JLabel();
        txtPagado = new javax.swing.JTextField();
        txtRecargado = new javax.swing.JTextField();
        txtDebe = new javax.swing.JTextField();
        txtVentas = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        txtGanancias = new javax.swing.JTextField();
        txtCaja = new javax.swing.JTextField();
        txtSugerencia = new javax.swing.JTextField();
        txtRetiro = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnTrasladar = new javax.swing.JButton();
        txtFecha = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Soluciones en Red");

        jLabel1.setText("Fecha");

        jLabel2.setText("Pagado");

        jLabel3.setText("Recargado");

        jLabel4.setText("Debe");

        jLabel5.setText("Ventas");

        jLabel6.setText("Saldo");

        jLabel7.setText("Ganancias");

        jLabel8.setText("Plata en caja");

        jLabel9.setText("Sugerencia");

        jLabel10.setText("Retiro");

        txtPagado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagadoFocusLost(evt);
            }
        });

        txtRecargado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecargadoFocusLost(evt);
            }
        });

        txtDebe.setEditable(false);
        txtDebe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDebeFocusLost(evt);
            }
        });

        txtVentas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVentasFocusLost(evt);
            }
        });

        txtSaldo.setEditable(false);
        txtSaldo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSaldoFocusLost(evt);
            }
        });

        txtGanancias.setEditable(false);
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

        txtSugerencia.setEditable(false);
        txtSugerencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSugerenciaFocusLost(evt);
            }
        });

        txtRetiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRetiroFocusLost(evt);
            }
        });

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
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

        btnTrasladar.setText("Trasladar");
        btnTrasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrasladarActionPerformed(evt);
            }
        });

        txtFecha.setFormat(2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPagado)
                            .addComponent(txtRecargado)
                            .addComponent(txtDebe)
                            .addComponent(txtVentas)
                            .addComponent(txtSaldo)
                            .addComponent(txtGanancias)
                            .addComponent(txtCaja)
                            .addComponent(txtSugerencia)
                            .addComponent(txtRetiro)
                            .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIngresar)
                                .addGap(18, 18, 18)
                                .addComponent(btnConsultar))
                            .addComponent(btnTrasladar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVolver)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRecargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGanancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSugerencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnConsultar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnTrasladar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnTrasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrasladarActionPerformed
        try {
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            MRecargas recarga = new CRecargas().Consultar(sqlDate, "soluciones");
            recarga.setSaldo(recarga.getSaldo()+recarga.getGanancias());
            recarga.setGanancias(0);
            boolean reca = new CRecargas().Actualizar(recarga, "soluciones");
            String mensaje = reca?"Saldo Transladados":"Recarga NO Transladados";
            limpiar();
            JOptionPane.showMessageDialog(this,mensaje);
        } catch (ParseException ex) {
            Logger.getLogger(Soluciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTrasladarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            MRecargas recarga = new MRecargas();
            Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
            recarga.setFecha(sqlDate);
            recarga.setCaja(Long.parseLong(txtCaja.getText()));
            recarga.setDebe(Long.parseLong(txtDebe.getText()));
            recarga.setGanancias(Long.parseLong(txtGanancias.getText()));
            recarga.setPagado(Long.parseLong(txtPagado.getText()));
            recarga.setRecargado(Long.parseLong(txtRecargado.getText()));
            recarga.setRetiro(Long.parseLong(txtRetiro.getText()));
            recarga.setSaldo(Long.parseLong(txtSaldo.getText()));
            recarga.setSugerencia(Long.parseLong(txtSugerencia.getText()));
            recarga.setVentas(Long.parseLong(txtVentas.getText()));
            recarga.calcular("soluciones");
            boolean reca = new CRecargas().Insertar(recarga, "soluciones");
            String mensaje = reca?"Recarga Registrada":"Recarga NO Registrada";
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
            boolean reca = new CRecargas().Eliminar(sqlDate, "soluciones");
            String mensaje = reca?"Recarga Eliminada":"Recarga NO Eliminada";
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
                btnTrasladar.setEnabled(false);
                Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
                MRecargas recarga = new CRecargas().Consultar(sqlDate, "soluciones");
                recarga.calcular("soluciones");
                txtPagado.setText(recarga.getPagado()+"");
                txtRecargado.setText(recarga.getRecargado()+"");
                txtDebe.setText(recarga.getDebe()+"");
                txtVentas.setText(recarga.getVentas()+"");
                txtSaldo.setText(recarga.getSaldo()+"");
                txtGanancias.setText(recarga.getGanancias()+"");
                txtCaja.setText(recarga.getCaja()+"");
                txtSugerencia.setText(recarga.getSugerencia()+"");
                txtRetiro.setText(recarga.getRetiro()+"");
            } catch (ParseException ex) {
                Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                btnActualizar.setText("Actualizar");
                btnEliminar.setEnabled(true);
                btnConsultar.setEnabled(true);
                btnTrasladar.setEnabled(true);
                MRecargas recarga = new MRecargas();
                Date sqlDate = new Date(txtFecha.getDateFormat().parse(txtFecha.getText()).getTime());
                recarga.setFecha(sqlDate);
                recarga.setCaja(Long.parseLong(txtCaja.getText()));
                recarga.setDebe(Long.parseLong(txtDebe.getText()));
                recarga.setGanancias(Long.parseLong(txtGanancias.getText()));
                recarga.setPagado(Long.parseLong(txtPagado.getText()));
                recarga.setRecargado(Long.parseLong(txtRecargado.getText()));
                recarga.setRetiro(Long.parseLong(txtRetiro.getText()));
                recarga.setSaldo(Long.parseLong(txtSaldo.getText()));
                recarga.setSugerencia(Long.parseLong(txtSugerencia.getText()));
                recarga.setVentas(Long.parseLong(txtVentas.getText()));
                recarga.calcular("soluciones");
                boolean reca = new CRecargas().Actualizar(recarga, "soluciones");
                String mensaje = reca?"Recarga Actualizada":"Recarga NO Actualizada";
                limpiar();
                JOptionPane.showMessageDialog(this,mensaje);
            } catch (ParseException ex) {
                Logger.getLogger(TuRed.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtPagadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPagadoFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtPagadoFocusLost

    private void txtRecargadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecargadoFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtRecargadoFocusLost

    private void txtDebeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDebeFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtDebeFocusLost

    private void txtVentasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVentasFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtVentasFocusLost

    private void txtSaldoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSaldoFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtSaldoFocusLost

    private void txtGananciasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGananciasFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtGananciasFocusLost

    private void txtCajaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCajaFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtCajaFocusLost

    private void txtSugerenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSugerenciaFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtSugerenciaFocusLost

    private void txtRetiroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRetiroFocusLost
        boolean reca = txtPagado.getText().isEmpty()||txtRecargado.getText().isEmpty()||txtDebe.getText().isEmpty()||txtVentas.getText().isEmpty()||txtSaldo.getText().isEmpty()||txtGanancias.getText().isEmpty()||txtCaja.getText().isEmpty()||txtSugerencia.getText().isEmpty()||txtRetiro.getText().isEmpty();
        btnIngresar.setEnabled(!reca);
    }//GEN-LAST:event_txtRetiroFocusLost

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
            java.util.logging.Logger.getLogger(Soluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnTrasladar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtDebe;
    private datechooser.beans.DateChooserCombo txtFecha;
    private javax.swing.JTextField txtGanancias;
    private javax.swing.JTextField txtPagado;
    private javax.swing.JTextField txtRecargado;
    private javax.swing.JTextField txtRetiro;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtSugerencia;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
}
