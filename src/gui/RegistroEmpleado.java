/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gui;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Victor Nivelo
 */
public class RegistroEmpleado extends javax.swing.JDialog {

    /**
     * Creates new form RegistroEmpleado
     */
    DefaultTableModel modelo;
    
    public RegistroEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Medoto de pago");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Total");
        this.tblRegistroVentas.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panVentas = new javax.swing.JPanel();
        lblRegistroVentas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRegistroVentas = new javax.swing.JTable();
        btnCalcularGanancias = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnSalirRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRO EMPLEADO");

        panVentas.setBackground(new java.awt.Color(204, 255, 204));
        panVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 1, true));

        lblRegistroVentas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRegistroVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistroVentas.setText("Registro de ventas");

        tblRegistroVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Victor David", "Tarjeta de credito", "6.94"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Metodo de pago", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblRegistroVentas);

        btnCalcularGanancias.setText("CALCULAR GANANCIAS");
        btnCalcularGanancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularGananciasActionPerformed(evt);
            }
        });

        lblTotal.setText("TOTAL");

        btnSalirRegistro.setText("SALIR DEL REGISTRO");
        btnSalirRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panVentasLayout = new javax.swing.GroupLayout(panVentas);
        panVentas.setLayout(panVentasLayout);
        panVentasLayout.setHorizontalGroup(
            panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(lblRegistroVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVentasLayout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalcularGanancias)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalirRegistro)))
                .addContainerGap())
        );
        panVentasLayout.setVerticalGroup(
            panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistroVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularGanancias)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirRegistro))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularGananciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularGananciasActionPerformed
        String []agregar = new String[6];
        agregar[0]=("Victor David");
        agregar[1]=("Tarjeta de credito");
        agregar [2]=("Helados");
        agregar [3]=("7");
        agregar [4]=("5.75");
        agregar [5]=("6.94");
        modelo.addRow(agregar);
        txtTotal.setText("6.94");
    }//GEN-LAST:event_btnCalcularGananciasActionPerformed

    private void btnSalirRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirRegistroActionPerformed
        this.dispose();
        /*AccesoARegistro accesoARegistro = new AccesoARegistro(new javax.swing.JFrame(), true);
        accesoARegistro.setVisible(true);*/
    }//GEN-LAST:event_btnSalirRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroEmpleado dialog = new RegistroEmpleado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularGanancias;
    private javax.swing.JButton btnSalirRegistro;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRegistroVentas;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel panVentas;
    private javax.swing.JTable tblRegistroVentas;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}