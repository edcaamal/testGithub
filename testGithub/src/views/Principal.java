/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.util.Set;
import javax.swing.table.DefaultTableModel;
import models.Municipio;
import static models.Municipio.llenarMunicipios;
import static models.Municipio.municipios;

public class Principal extends javax.swing.JFrame {
    DefaultTableModel dtmMunicipios = new DefaultTableModel();
    
    public Principal() {
        initComponents();
        llenarMunicipios();
        setModelo();
        setDatos();
        tlbMunicipios.repaint();
    }
    public void setModelo(){
        String[] tlbCabecera = {"No.", "ID", "Nombre Municipio"};
        dtmMunicipios.setColumnIdentifiers(tlbCabecera);
        tlbMunicipios.setModel(dtmMunicipios);
    }    
    public void setDatos(){
        Object[] datos = new Object[dtmMunicipios.getColumnCount()];
        int i = 1;
        dtmMunicipios.setRowCount(0);
        for (Municipio municipio : municipios) {
            datos[0] = i;
            datos[1] = municipio.getId();
            datos[2] = municipio.getNombre();
            i++;
            dtmMunicipios.addRow(datos);
        }
        tlbMunicipios.setModel(dtmMunicipios);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tlbMunicipios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        btnAceptar.setText("Aceptar");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        tlbMunicipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tlbMunicipios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        
        int id = Integer.parseInt(this.txtId.getText().trim());
        String nombre = this.txtNombre.getText();
        System.out.println(id);
        System.out.println(nombre);
        Municipio.insertarMunicipio(id, nombre);
        setDatos();
        limpiarCampos();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    }//GEN-LAST:event_btnAceptarActionPerformed

    public void limpiarCampos(){
        this.txtId.setText("");
        this.txtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tlbMunicipios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
