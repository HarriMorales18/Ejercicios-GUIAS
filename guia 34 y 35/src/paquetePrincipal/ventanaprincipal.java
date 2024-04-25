/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquetePrincipal;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HarriMorales
 */
public class ventanaprincipal extends javax.swing.JFrame {

    /**
     * Creates new form ventanaprincipal
     */
    public ventanaprincipal() {
        initComponents();
        ConfiguracionVentana();
    }
    
    public final void ConfiguracionVentana(){
        this.setSize(800,600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        menuCerrarTodo = new javax.swing.JMenuItem();
        menuInfo = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        menuCascada = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInterno.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("Archivo");

        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrar);

        menuCerrarTodo.setText("Cerrar todo");
        menuCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarTodoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuCerrarTodo);

        menuInfo.setText("info");
        menuInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuInfo);
        menuArchivo.add(separador1);

        menuArchivoSalir.setText("Salir");
        menuArchivo.add(menuArchivoSalir);

        barraMenus.add(menuArchivo);

        menuVentana.setText("Ventana");

        menuCascada.setText("Cascada");
        menuCascada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCascadaActionPerformed(evt);
            }
        });
        menuVentana.add(menuCascada);

        barraMenus.add(menuVentana);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarActionPerformed
        // TODO add your handling code here:
        ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
        if(vactiva != null){
            vactiva.dispose();
        }
    }//GEN-LAST:event_menuArchivoCerrarActionPerformed

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
        // TODO add your handling code here:
        JFileChooser abrir = new JFileChooser();
        int boton = abrir.showOpenDialog(null);
        if(boton == JFileChooser.APPROVE_OPTION){
            ventanainterna vi = new ventanainterna();
            vi.setResizable(true);
            vi.setMaximizable(true);
            vi.setIconifiable(true);
            vi.setClosable(true);
            
            panelInterno.add(vi);
            
            String camino = abrir.getSelectedFile().toString();
            vi.setImagen(camino);
            vi.setTitle(camino);
            vi.setVisible(true);
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    private void menuInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoActionPerformed
        // TODO add your handling code here:
        ventanainterna vactiva = (ventanainterna) panelInterno.getSelectedFrame();
        if(vactiva != null){
            String titulo = vactiva.getTitle();
            
            JOptionPane.showMessageDialog(null, "Camino de la imagen:\n"+titulo);
        }else{
            JOptionPane.showMessageDialog(null, "No hay ninguna imagen seleccionada");
        }
    }//GEN-LAST:event_menuInfoActionPerformed

    private void menuCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarTodoActionPerformed
        // TODO add your handling code here:
        int i;
        JInternalFrame v[] = panelInterno.getAllFrames();
        
        for (i=0; i<v.length;i++){
            v[i].dispose();
        }
        
    }//GEN-LAST:event_menuCerrarTodoActionPerformed

    private void menuCascadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCascadaActionPerformed
        // TODO add your handling code here:
        int i;
        int x,y;
        
        JInternalFrame v[] = panelInterno.getAllFrames();
        
        x=0;
        y=0;
        
        for (i=v.length-1; i>=0;i--){
            v[i].setSize(600, 400);
            v[i].setLocation(x,y);
            x = x+30;
            y = y+30;
        }
    }//GEN-LAST:event_menuCascadaActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuCascada;
    private javax.swing.JMenuItem menuCerrarTodo;
    private javax.swing.JMenuItem menuInfo;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
