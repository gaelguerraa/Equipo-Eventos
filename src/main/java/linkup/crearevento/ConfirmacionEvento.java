/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package linkup.crearevento;

import DTO_Negocio.EventoDTO;
import ObjetosNegocio.Evento;
import ObjetosNegocio.Usuario;
import java.util.List;
import linkup.control.ControlCrearEvento;
import sistemaEventosNegocio.IFachadaEventos;

/**
 *
 * @author Dana Chavez
 */
public class ConfirmacionEvento extends javax.swing.JFrame {

    private ControlCrearEvento controlador;
    private IFachadaEventos fachadaEventos;
    private EventoDTO eventoDTO;
    private List<Usuario> contactosSeleccionados;
    /**
     * Creates new form VentanaPrincipalCrearEvento
     */
    
    
    public ConfirmacionEvento(ControlCrearEvento controlador, IFachadaEventos fachadaEventos, EventoDTO eventoDTO, List<Usuario> contactosSeleccionados) {
        this.controlador = controlador;
        this.eventoDTO = eventoDTO;
        this.fachadaEventos = fachadaEventos;
        this.contactosSeleccionados = contactosSeleccionados;
        initComponents();
        setLocationRelativeTo(null);
    }

    public ConfirmacionEvento() {
        initComponents();
    }
    
    public void mostrar(){
        setVisible(true);
    }
    
    public void cerrar(){
        setVisible(false);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        menuButton = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        inicioButton = new javax.swing.JButton();
        explorarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(168, 91, 102));
        jLabel7.setText("Banner");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(253, 166, 179));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuButton.setBackground(new java.awt.Color(253, 166, 179));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupbotonmenu.png"))); // NOI18N
        jPanel2.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 560));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linklogo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 210, 50));

        inicioButton.setBackground(new java.awt.Color(255, 255, 255));
        inicioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupinicio.png"))); // NOI18N
        inicioButton.setBorder(null);
        inicioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioButtonActionPerformed(evt);
            }
        });
        jPanel1.add(inicioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 110, 50));

        explorarButton.setBackground(new java.awt.Color(255, 255, 255));
        explorarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupexplorar.png"))); // NOI18N
        jPanel1.add(explorarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupcreandoevento.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        jPanel3.setBackground(new java.awt.Color(246, 227, 230));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(168, 91, 102));
        jLabel3.setText("Detalles del evento");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton2.setBackground(new java.awt.Color(246, 227, 230));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupbotoncancelar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jButton3.setBackground(new java.awt.Color(246, 227, 230));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupbotonregresar.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        jPanel5.setBackground(new java.awt.Color(152, 79, 89));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 300));

        jButton5.setBackground(new java.awt.Color(246, 227, 230));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/linkupcrear.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 300, 400));

        jPanel4.setBackground(new java.awt.Color(195, 123, 133));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 300, 10));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(168, 91, 102));
        jLabel2.setText("Confirmacion del evento");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 864, 558));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inicioButtonActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        controlador.mostrarVentanaPrincipal();
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controlador.mostrarEnviarInvitaciones(eventoDTO);
        cerrar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Evento evento = fachadaEventos.CrearEvento(eventoDTO);
        fachadaEventos.enviarInvitaciones(contactosSeleccionados, evento);
        controlador.mostrarVentanaPrincipal();
        cerrar();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmacionEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmacionEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmacionEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton explorarButton;
    private javax.swing.JButton inicioButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logo;
    private javax.swing.JButton menuButton;
    // End of variables declaration//GEN-END:variables
}
