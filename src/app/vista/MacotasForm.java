package app.vista;

import app.controlador.RegistroMascotas;
import app.modelo.Mascota;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MacotasForm extends javax.swing.JFrame {

    DefaultTableModel dtm = new DefaultTableModel();
    RegistroMascotas mascotasDatos = new RegistroMascotas();
    public MacotasForm() {
        initComponents();
        String titulo[] = new String[]{"Tipo Mascota", "Nombre","Raza", "Color", "Edad", "Nivel", "Toxoplasmosis"};


        dtm.setColumnIdentifiers(titulo);
        jTable1.setModel(dtm);
        //Agregamos los datos existentes
        List<Mascota> datos = mascotasDatos.getMascotas();
        for(int i = 0; i < mascotasDatos.getMascotas().size(); i++ ){
            if(datos.get(i).getTipoMascota().equals("canino")){
                dtm.addRow(new String[]{datos.get(i).getTipoMascota(), datos.get(i).getNombre(),
                        datos.get(i).getRaza(), datos.get(i).getColor(), String.valueOf(datos.get(i).getEdad()),
                        String.valueOf(datos.get(i).getNivel())});
            }else {
                dtm.addRow(new String[]{datos.get(i).getTipoMascota(), datos.get(i).getNombre(),
                        datos.get(i).getRaza(), datos.get(i).getColor(), String.valueOf(datos.get(i).getEdad()), "",
                        datos.get(i).getToxoplasmosis()});
            }

        }
        
        

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnEdadPromedio = new javax.swing.JButton();
        btnCantidadFel = new javax.swing.JButton();
        btnCantidadCan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo app.modelo.Mascota", "Nombre", "Raza", "Color", "Edad", "Nivel", "Toxoplasmosis"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Mascotas Disponibles");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnEdadPromedio.setText("Edad Promedio");
        btnEdadPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdadPromedioActionPerformed(evt);
            }
        });

        btnCantidadFel.setText("Cantidad de Felinos");
        btnCantidadFel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadFelActionPerformed(evt);
            }
        });

        btnCantidadCan.setText("Cantidad de Caninos");
        btnCantidadCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantidadCanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(34, 34, 34)
                        .addComponent(btnRetirar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdadPromedio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCantidadFel)
                        .addGap(18, 18, 18)
                        .addComponent(btnCantidadCan)))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRetirar)
                    .addComponent(btnEdadPromedio)
                    .addComponent(btnCantidadFel)
                    .addComponent(btnCantidadCan))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCantidadFelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadFelActionPerforme
        JOptionPane.showMessageDialog(null, "Total Felinos: " + mascotasDatos.totalFelino());
    }

    private void btnEdadPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdadPromedioActionPerformed
        JOptionPane.showMessageDialog(null, "Edad Promedio: " + mascotasDatos.edadPromedio());
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {
        FormularioDatos datosR = new FormularioDatos();
        datosR.setVisible(true);
        dispose();
    }

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        int fila = jTable1.getSelectedRow();

        if(fila == -1){
            if(mascotasDatos.getMascotas().size() == 0){
                JOptionPane.showMessageDialog(null, "No hay mascotas registradas");
            }else{
                JOptionPane.showMessageDialog(null, "Selecciona una mascota para retirarla ");
            }

        }else{
            dtm.removeRow(fila);
            mascotasDatos.retirar(fila);
        }

        
        
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnCantidadCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantidadCanActionPerformed
        JOptionPane.showMessageDialog(null, "Total Caninos: " + mascotasDatos.totalCaninos());
    }

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
            java.util.logging.Logger.getLogger(MacotasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MacotasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MacotasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MacotasForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MacotasForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCantidadCan;
    private javax.swing.JButton btnCantidadFel;
    private javax.swing.JButton btnEdadPromedio;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
