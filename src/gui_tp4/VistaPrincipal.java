

package gui_tp4;

import java.util.HashSet;

import javax.swing.ImageIcon;


// los HashSet generales contienen "qué existe"; el HashSet<Materia> dentro de cada Alumno contiene "qué tiene ese alumno".


public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    // HashSets accesibles para el resto de las vistas:
    private static HashSet<Alumno> setDeAlumnos = new HashSet<>(); // todos los alumnos en el sistema
    
    private static HashSet<Materia> setDeMaterias = new HashSet<>(); // todas las materias disponibles en el sistema
    
    // EN CAMBIO, el OTRO setDeMaterias que hay en Alumno representa todas materias en las que un alumno está inscripto.
    
    // HashSet en VistaPrincipal equivale a un catálogo.
    // Hashset en clase Alumno equivale a un registro personal.
    
   
    public VistaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("logoULP.png")).getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dtpEscritorio = new DesktopPanelFondo();
        mnbPrincipal = new javax.swing.JMenuBar();
        mnuAlumno = new javax.swing.JMenu();
        mniAgregarAlumno = new javax.swing.JMenuItem();
        mnuMateria = new javax.swing.JMenu();
        mniAgregarMateria = new javax.swing.JMenuItem();
        mnuRegistro = new javax.swing.JMenu();
        mniFormularioInscripcion = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dtpEscritorioLayout = new javax.swing.GroupLayout(dtpEscritorio);
        dtpEscritorio.setLayout(dtpEscritorioLayout);
        dtpEscritorioLayout.setHorizontalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        mnuAlumno.setText("Alumno");

        mniAgregarAlumno.setText("Agregar alumno");
        mniAgregarAlumno.addActionListener(this::mniAgregarAlumnoActionPerformed);
        mnuAlumno.add(mniAgregarAlumno);

        mnbPrincipal.add(mnuAlumno);

        mnuMateria.setText("Materia");

        mniAgregarMateria.setText("Agregar materia");
        mniAgregarMateria.addActionListener(this::mniAgregarMateriaActionPerformed);
        mnuMateria.add(mniAgregarMateria);

        mnbPrincipal.add(mnuMateria);

        mnuRegistro.setText("Registro");

        mniFormularioInscripcion.setText("Formulario de inscripción");
        mniFormularioInscripcion.addActionListener(this::mniFormularioInscripcionActionPerformed);
        mnuRegistro.add(mniFormularioInscripcion);

        mnbPrincipal.add(mnuRegistro);

        mnuSalir.setText("Salir");
        mnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSalirMouseClicked(evt);
            }
        });
        mnbPrincipal.add(mnuSalir);

        setJMenuBar(mnbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dtpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Evento: crea y abre VistaAlumnos
    private void mniAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarAlumnoActionPerformed
             
        VistaAlumnos vista = new VistaAlumnos(setDeAlumnos);  // Se crea una vista Alumnos y se le pasa el HashSet compartido
        
        dtpEscritorio.add(vista);  // Se agrega la vista de Alumnos al JDesktopPane escritorio
        
        vista.setVisible(true); // Se muestra.
        
    }//GEN-LAST:event_mniAgregarAlumnoActionPerformed

    private void mniAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarMateriaActionPerformed
               
        VistaMaterias vista = new VistaMaterias(setDeMaterias);
        
        dtpEscritorio.add(vista);
        
        vista.setVisible(true);
        
    }//GEN-LAST:event_mniAgregarMateriaActionPerformed

   
    
    private void mniFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFormularioInscripcionActionPerformed
        
        VistaInscripcion vista = new VistaInscripcion(setDeAlumnos, setDeMaterias);
        
        dtpEscritorio.add(vista);

        vista.setVisible(true);      
        
    }//GEN-LAST:event_mniFormularioInscripcionActionPerformed

    private void mnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSalirMouseClicked
       
        dispose();
        
    }//GEN-LAST:event_mnuSalirMouseClicked

    
    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dtpEscritorio;
    private javax.swing.JMenuBar mnbPrincipal;
    private javax.swing.JMenuItem mniAgregarAlumno;
    private javax.swing.JMenuItem mniAgregarMateria;
    private javax.swing.JMenuItem mniFormularioInscripcion;
    private javax.swing.JMenu mnuAlumno;
    private javax.swing.JMenu mnuMateria;
    private javax.swing.JMenu mnuRegistro;
    private javax.swing.JMenu mnuSalir;
    // End of variables declaration//GEN-END:variables
}
