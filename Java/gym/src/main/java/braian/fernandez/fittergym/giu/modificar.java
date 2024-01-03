
package braian.fernandez.fittergym.giu;

import braian.fernandez.fittergym.logic.clientes;
import braian.fernandez.fittergym.logic.controllerJPA;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class modificar extends javax.swing.JFrame {

    public modificar() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelLeft = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panelMenu.setBackground(new java.awt.Color(255, 0, 0));
        panelMenu.setLayout(null);

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 0, 0));
        txtNombre.setText("Nombre");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelMenu.add(txtNombre);
        txtNombre.setBounds(40, 70, 270, 30);

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));
        txtApellido.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 0, 0));
        txtApellido.setText("Apellido");
        panelMenu.add(txtApellido);
        txtApellido.setBounds(40, 130, 270, 30);

        txtDNI.setBackground(new java.awt.Color(0, 0, 0));
        txtDNI.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(255, 0, 0));
        txtDNI.setText("DNI (Solo numeros)");
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        panelMenu.add(txtDNI);
        txtDNI.setBounds(40, 250, 270, 30);

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
        btnGuardar.setBounds(40, 300, 120, 20);

        btnBorrar.setBackground(new java.awt.Color(255, 0, 0));
        btnBorrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(0, 0, 0));
        btnBorrar.setText("Borrar");
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMenu.add(btnBorrar);
        btnBorrar.setBounds(190, 300, 120, 20);

        txtFecha.setBackground(new java.awt.Color(0, 0, 0));
        txtFecha.setForeground(new java.awt.Color(255, 0, 0));
        txtFecha.setDateFormatString("dd/MM/yyyy");
        panelMenu.add(txtFecha);
        txtFecha.setBounds(40, 190, 270, 30);

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el objeto a modificar" }));
        panelMenu.add(jComboBox1);
        jComboBox1.setBounds(40, 20, 270, 28);

        getContentPane().add(panelMenu);
        panelMenu.setBounds(50, 50, 350, 350);

        panelLeft.setBackground(new java.awt.Color(0, 0, 0));
        panelLeft.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("F");
        panelLeft.add(jLabel2);
        jLabel2.setBounds(10, 50, 30, 40);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("I");
        panelLeft.add(jLabel3);
        jLabel3.setBounds(10, 80, 30, 40);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("T");
        panelLeft.add(jLabel4);
        jLabel4.setBounds(10, 110, 30, 40);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("T");
        panelLeft.add(jLabel5);
        jLabel5.setBounds(10, 140, 30, 40);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E");
        panelLeft.add(jLabel6);
        jLabel6.setBounds(10, 170, 30, 40);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("R");
        panelLeft.add(jLabel7);
        jLabel7.setBounds(10, 200, 30, 40);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("G");
        panelLeft.add(jLabel8);
        jLabel8.setBounds(10, 230, 30, 40);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Y");
        panelLeft.add(jLabel9);
        jLabel9.setBounds(10, 260, 30, 40);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("M");
        panelLeft.add(jLabel10);
        jLabel10.setBounds(10, 290, 30, 40);

        getContentPane().add(panelLeft);
        panelLeft.setBounds(0, 0, 50, 400);

        panelUp.setBackground(new java.awt.Color(0, 0, 0));
        panelUp.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TU MEJOR VERSION TE ESPERA ! !");
        panelUp.add(jLabel1);
        jLabel1.setBounds(0, 10, 340, 30);

        getContentPane().add(panelUp);
        panelUp.setBounds(50, 0, 350, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        controllerJPA control = new controllerJPA();
        
        String dniString = txtDNI.getText();
        int DNI = Integer.parseInt(dniString);
        
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido.getText();
        
        Date Fecha = txtFecha.getDate();
        
        clientes clients = new clientes(1,DNI, Nombre, Apellido, Fecha);
        control.crearCliente(clients);
        JOptionPane.showMessageDialog(null,"El cliente " + Nombre + " " + Apellido + " fue agregado con exito");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelUp;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDNI;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
