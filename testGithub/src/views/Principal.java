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
    DefaultTableModel dtmMunicipios = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column){
            return false;
        }
    };
    
    public Principal() {
        initComponents();
        this.txtRecno.setText("-1");
        this.txtRecno.setVisible(false);
        this.lblRecno.setVisible(false);
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
        int i = 0;
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
        lblRecno = new javax.swing.JLabel();
        txtRecno = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnTActualizar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JButton();

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

        lblRecno.setText("RecNo");

        btnEditar.setText("Eliminar");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnTActualizar.setText("Actualizar");
        btnTActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTActualizarMouseClicked(evt);
            }
        });

        btnLimpiar.setText("Cancelar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRecno)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(txtRecno, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(btnLimpiar)
                                        .addGap(74, 74, 74)
                                        .addComponent(btnAceptar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRecno)
                    .addComponent(txtRecno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnLimpiar))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnTActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        
        int recNo = Integer.parseInt(this.txtRecno.getText().trim());
        int id = Integer.parseInt(this.txtId.getText().trim());
        String nombre = this.txtNombre.getText();
        
        if (recNo == -1){
           Municipio.insertarMunicipio(id, nombre);
        }else{
            System.out.println("Actualizando Datos");
            Municipio.actualizarMunicipio(recNo, id, nombre);
            this.btnTActualizar.setSelected(false);
            System.out.println(municipios);
        }
            
        setDatos();
        limpiarCampos();
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
         int filaActual = tlbMunicipios.getSelectedRow();
         System.out.println(filaActual);
         if (filaActual != -1){
            //dtmMunicipios.removeRow(filaActual);
            System.out.println(municipios);
            Municipio.eliminarMunicipio(filaActual);
            setDatos();

         }

    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnTActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTActualizarMouseClicked
         int filaActual = tlbMunicipios.getSelectedRow();
         System.out.println(filaActual);
         if (this.btnTActualizar.isSelected()){
            if (filaActual != -1){
                System.out.println(dtmMunicipios.getValueAt(filaActual, 0));
                System.out.println(dtmMunicipios.getValueAt(filaActual, 1));
                System.out.println(dtmMunicipios.getValueAt(filaActual, 2));

                this.txtRecno.setText(""+dtmMunicipios.getValueAt(filaActual, 0));
                this.txtId.setText(""+dtmMunicipios.getValueAt(filaActual, 1));
                this.txtNombre.setText(""+dtmMunicipios.getValueAt(filaActual, 2));
            }else{
                System.out.println("Debe selecccionar un registro ...");
                this.btnTActualizar.setSelected(false);
            }
         }else{
             limpiarCampos();
         }

    }//GEN-LAST:event_btnTActualizarMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    public void limpiarCampos(){
        this.txtRecno.setText("-1");
        this.txtId.setText("");
        this.txtNombre.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JToggleButton btnTActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRecno;
    private javax.swing.JTable tlbMunicipios;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRecno;
    // End of variables declaration//GEN-END:variables
}
