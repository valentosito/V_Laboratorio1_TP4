
package gui_tp4;

import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


// La ventana VistaInscripcion es la única vista que termina trabajando con los dos HashSet que contienen Materia:
// toma una materia del conjunto general y se la intenta agregar al conjunto particular del alumno seleccionado.


public class VistaInscripcion extends javax.swing.JInternalFrame {

    // 1er paso
    
    private HashSet<Alumno> setDeAlumnos;
    private HashSet<Materia> setDeMaterias;
   
    
    // 2do paso
    public VistaInscripcion(HashSet<Alumno> setDeAlumnos, HashSet<Materia> setDeMaterias) {
        
        initComponents();
        setFrameIcon(new ImageIcon(getClass().getResource("/gui_tp4/logoULP.png")));
        
        this.setDeAlumnos = setDeAlumnos;
        this.setDeMaterias = setDeMaterias;
        
        cargarAlumnos();
        cargarMaterias();
    }

    
    
    // Dos métodos que manipulan los HashSet generales. 
    
    // Objetivo: pasar los objetos que están en los HashSet generales a los JComboBox 
    // para que el usuario pueda seleccionarlos desde la interfaz.
    
    // --> Puente entre los datos que ya existen y lo que se muestra en pantalla; cargar la interfaz.
    
    private void cargarAlumnos() {
        
        for (Alumno alumno : setDeAlumnos) {
        
            cmbAlumnos.addItem(alumno);
        }
    }
    
    private void cargarMaterias() {
        
        for (Materia materia : setDeMaterias) {
            
            cmbMaterias.addItem(materia);
        }
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new PanelFondo();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbMaterias = new javax.swing.JComboBox<>();
        cmbAlumnos = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCIÓN");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Elija una materia:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Elija un alumno:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cmbMaterias.addActionListener(this::cmbMateriasActionPerformed);

        cmbAlumnos.addActionListener(this::cmbAlumnosActionPerformed);

        btnInscribir.setBackground(new java.awt.Color(0, 177, 159));
        btnInscribir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInscribir.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(this::btnInscribirActionPerformed);

        btnSalir.setBackground(new java.awt.Color(0, 177, 159));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(this::btnSalirActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMaterias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnInscribir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    // Es el único método manejador que sí trabaja con las clases y por ende con el HashSet particular... El otro HashSet de Materia.
    
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        
        
        Alumno alumno = (Alumno) cmbAlumnos.getSelectedItem();
        Materia materia = (Materia) cmbMaterias.getSelectedItem();
           
        // Por cada objeto Alumno existe un HashSet<Materia> propio: 
        
        if (alumno.agregarMateria(materia)) {
            
            JOptionPane.showMessageDialog(this, "Materia inscripta correctamente.");
            
        } else {
            
            JOptionPane.showMessageDialog(this, "El alumno ya está inscripto en esa materia.", "Error", ERROR);
        }
        
        
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void cmbMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMateriasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       
        dispose ();
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlumnosActionPerformed


    
    
    // Cambio de String a objeto personalizado a través de propiedades y code:
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Alumno> cmbAlumnos;
    private javax.swing.JComboBox<Materia> cmbMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
