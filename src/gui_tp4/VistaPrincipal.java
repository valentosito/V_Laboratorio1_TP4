

package gui_tp4;

import java.util.HashSet;

import javax.swing.ImageIcon;


public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());

    // HashSet accesibles para el resto de las vistas:
    private static HashSet<Alumno> setDeAlumnos = new HashSet<>();
    private static HashSet<Materia> setDeMaterias = new HashSet<>();
    
    
   
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
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dtpEscritorioLayout.setVerticalGroup(
            dtpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        mnuAlumno.setText("Alumno");

        mniAgregarAlumno.setText("Agregar alumno");
        mniAgregarAlumno.addActionListener(this::mniAgregarAlumnoActionPerformed);
        mnuAlumno.add(mniAgregarAlumno);

        mnbPrincipal.add(mnuAlumno);

        mnuMateria.setText("Materia");

        mniAgregarMateria.setText("Agregar materia");
        mnuMateria.add(mniAgregarMateria);

        mnbPrincipal.add(mnuMateria);

        mnuRegistro.setText("Registro");

        mniFormularioInscripcion.setText("Formulario de inscripción");
        mnuRegistro.add(mniFormularioInscripcion);

        mnbPrincipal.add(mnuRegistro);

        mnuSalir.setText("Salir");
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

    private void mniAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarAlumnoActionPerformed
        
        
        
        
    }//GEN-LAST:event_mniAgregarAlumnoActionPerformed

    
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
