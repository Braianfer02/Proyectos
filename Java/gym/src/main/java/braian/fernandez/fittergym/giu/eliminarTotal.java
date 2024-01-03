
package braian.fernandez.fittergym.giu;

import braian.fernandez.fittergym.logic.controllerJPA;
import braian.fernandez.fittergym.persistence.exceptions.NonexistentEntityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class eliminarTotal extends javax.swing.JFrame {

    public eliminarTotal() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtCategoria = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JComboBox<>();
        panelLeft = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(255, 0, 0));
        panelMenu.setLayout(null);

        btnGuardar.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelMenu.add(btnGuardar);
        btnGuardar.setBounds(40, 140, 120, 20);

        btnBorrar.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMenu.add(btnBorrar);
        btnBorrar.setBounds(190, 140, 120, 20);

        txtCategoria.setBackground(new java.awt.Color(0, 0, 0));
        txtCategoria.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCategoria.setForeground(new java.awt.Color(255, 0, 0));
        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una categoria", "Clientes", "Pedidos", "Productos" }));
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        panelMenu.add(txtCategoria);
        txtCategoria.setBounds(40, 20, 270, 25);

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 0, 0));
        txtId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el ID", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        panelMenu.add(txtId);
        txtId.setBounds(40, 80, 270, 25);

        panelLeft.setBackground(new java.awt.Color(0, 0, 0));
        panelLeft.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("F");
        panelLeft.add(jLabel2);
        jLabel2.setBounds(10, 50, 30, 30);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("I");
        panelLeft.add(jLabel3);
        jLabel3.setBounds(10, 80, 30, 30);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("T");
        panelLeft.add(jLabel4);
        jLabel4.setBounds(10, 110, 30, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("T");
        panelLeft.add(jLabel5);
        jLabel5.setBounds(10, 140, 30, 30);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E");
        panelLeft.add(jLabel6);
        jLabel6.setBounds(10, 170, 30, 30);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("R");
        panelLeft.add(jLabel7);
        jLabel7.setBounds(10, 200, 30, 30);

        panelUp.setBackground(new java.awt.Color(0, 0, 0));
        panelUp.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TU MEJOR VERSION TE ESPERA ! !");
        panelUp.add(jLabel1);
        jLabel1.setBounds(0, 10, 340, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUp, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        controllerJPA control = new controllerJPA();
        
        String idString = (String) txtId.getSelectedItem();
        int id = Integer.parseInt(idString);
        String categoria = (String) txtCategoria.getSelectedItem();
        
        switch(categoria){
            case "Clientes" -> control.eliminarCliente(id);
            case "Pedidos" -> control.eliminarPedidos(id);
            case "Productos" -> control.eliminarProductos(id);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
                
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCategoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelUp;
    private javax.swing.JComboBox<String> txtCategoria;
    private javax.swing.JComboBox<String> txtId;
    // End of variables declaration//GEN-END:variables
}
