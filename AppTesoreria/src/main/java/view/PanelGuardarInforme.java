/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import controller.ProcesarMovimientosDeCuentaDeEmpresa;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ariel
 */
public class PanelGuardarInforme extends javax.swing.JPanel implements InterfacePanel {

    //variables de comboBox
    private DefaultComboBoxModel cuentasModel;

    private final ValidadorDeCampos validador;

    private ProcesarMovimientosDeCuentaDeEmpresa controlador;

    /**
     * Creates new form PanelEmpresa
     *
     * @param controlador
     */
    public PanelGuardarInforme(ProcesarMovimientosDeCuentaDeEmpresa controlador) {

        //JComboBox vacio
        this.cuentasModel = new DefaultComboBoxModel();

        initComponents();
        validador = new ValidadorDeCampos();
        this.controlador = controlador;

        

        habilitarTodosLosCampos(false);
        habilitarTodosLosBotones(false);
        this.validador.habilitarBoton(true, this.jbtn_cancelar, Color.RED, Color.WHITE, null, null);        
        this.validador.habilitarBoton(true, this.jbtn_buscar, new Color(30, 132, 73), Color.WHITE, null, null);
        
        this.validador.habilitarBoton(true, this.jbtn_guardarArchivo, new Color(30, 132, 73), Color.WHITE, null, null);

        this.jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa.setStringPainted(true);
        this.jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa.setString("Crear PDF");
        this.jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa.setValue(20);
        this.jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa.setForeground(new Color(220, 118, 51));

        this.jlbl_titulo.setBackground(Color.BLACK);
        this.jlbl_titulo.setOpaque(true);

        repaint();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelProgreso = new javax.swing.JPanel();
        jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa = new javax.swing.JProgressBar();
        jlbl_titulo = new javax.swing.JLabel();
        jPanel_Contenido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_rutaArchivo = new javax.swing.JTextField();
        jbtn_buscar = new javax.swing.JButton();
        jbtn_guardarArchivo = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(950, 750));
        setMinimumSize(new java.awt.Dimension(950, 750));
        setPreferredSize(new java.awt.Dimension(950, 750));

        jlbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_titulo.setText("PROCESAR MOVIMIENTOS DE CUENTAS DE EMPRESA");

        javax.swing.GroupLayout jPanelProgresoLayout = new javax.swing.GroupLayout(jPanelProgreso);
        jPanelProgreso.setLayout(jPanelProgresoLayout);
        jPanelProgresoLayout.setHorizontalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                    .addComponent(jlbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProgresoLayout.setVerticalGroup(
            jPanelProgresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProgresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Contenido.setMaximumSize(new java.awt.Dimension(930, 460));
        jPanel_Contenido.setMinimumSize(new java.awt.Dimension(930, 460));
        jPanel_Contenido.setPreferredSize(new java.awt.Dimension(930, 460));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("RUTA");

        jtf_rutaArchivo.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jtf_rutaArchivo.setEnabled(false);
        jtf_rutaArchivo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jtf_rutaArchivoPropertyChange(evt);
            }
        });

        jbtn_buscar.setText("BUSCAR");
        jbtn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ContenidoLayout = new javax.swing.GroupLayout(jPanel_Contenido);
        jPanel_Contenido.setLayout(jPanel_ContenidoLayout);
        jPanel_ContenidoLayout.setHorizontalGroup(
            jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ContenidoLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_rutaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_ContenidoLayout.setVerticalGroup(
            jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContenidoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jtf_rutaArchivo)
                    .addComponent(jbtn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(360, Short.MAX_VALUE))
        );

        jbtn_guardarArchivo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_guardarArchivo.setText("GUARDAR ARCHIVO");
        jbtn_guardarArchivo.setEnabled(false);
        jbtn_guardarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarArchivoActionPerformed(evt);
            }
        });

        jbtn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbtn_cancelar.setText("CANCELAR");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_guardarArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel_Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jbtn_guardarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        //Inhabilita Botones
        habilitarTodosLosBotones(false);

        //limpia todos los campos
        limpiarTodosLosCampos();

        //Habilita el Arbol de seleccion
        JFramePrincipal.getArbolModulos().setEnabled(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        this.removeAll();
        JFramePrincipal.getjPanelContenido().repaint();
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    /**
     * Comenzar Nuevo registro de movimiento
     * @param evt 
     */
    private void jbtn_guardarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarArchivoActionPerformed
        
        String ruta = jtf_rutaArchivo.getText();
        String contenido = "fecha: ";
        
        try {
            FileOutputStream archivo = new FileOutputStream(ruta +".pdf");
            Document doc = new Document();
            PdfWriter.getInstance(null, archivo);
            doc.open();
            doc.add(new Paragraph(contenido));
            doc.close();
            JOptionPane.showMessageDialog(null, "PDF Creado");
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }

        //Se crea el Panel Emplesa    
        PanelRegistroDeMovimientos unPanelRegistroDeMovimientos = new PanelRegistroDeMovimientos(this.controlador);
        unPanelRegistroDeMovimientos.setSize(950, 750);
        unPanelRegistroDeMovimientos.setLocation(0, 0);
        unPanelRegistroDeMovimientos.setVisible(true);
        JFramePrincipal.getjPanelContenido().removeAll();
        JFramePrincipal.getjPanelContenido().add(unPanelRegistroDeMovimientos);
        JFramePrincipal.getjPanelContenido().repaint();
        JFramePrincipal.getjPanelContenido().validate();
        this.updateUI();

    }//GEN-LAST:event_jbtn_guardarArchivoActionPerformed

    private void jbtn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_buscarActionPerformed
        JFileChooser dlg = new JFileChooser();
        int opcion = dlg.showSaveDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION ) {
            File f = dlg.getSelectedFile();
            jtf_rutaArchivo.setText(f.toString());
        }
    }//GEN-LAST:event_jbtn_buscarActionPerformed

    private void jtf_rutaArchivoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jtf_rutaArchivoPropertyChange
        
    }//GEN-LAST:event_jtf_rutaArchivoPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelProgreso;
    private javax.swing.JPanel jPanel_Contenido;
    private javax.swing.JButton jbtn_buscar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JButton jbtn_guardarArchivo;
    private javax.swing.JLabel jlbl_titulo;
    private javax.swing.JProgressBar jpb_estado_ProcesarMovimientosDeCuentaDeEmpresa;
    private javax.swing.JTextField jtf_rutaArchivo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void habilitarTodosLosCampos(boolean estado) {
        //inhabilita campos
    }

    @Override
    public void limpiarTodosLosCampos() {
    }

    @Override
    public void habilitarTodosLosBotones(boolean estado) {
        this.validador.habilitarBoton(estado, this.jbtn_buscar, new Color(30, 132, 73), Color.WHITE, null, null);
    }

    

}