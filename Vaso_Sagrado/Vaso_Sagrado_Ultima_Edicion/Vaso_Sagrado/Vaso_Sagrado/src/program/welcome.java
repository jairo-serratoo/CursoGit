package program;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import vaso_sagrado.Bienvenido;

public class welcome extends javax.swing.JFrame {

    private int auxiliar = 0;
    private boolean realizado = false;
    hilo ejecutar = new hilo();

    public welcome() {
        initComponents();
        welcome.this.getRootPane().setOpaque(false);        
        welcome.this.getContentPane ().setBackground (new Color (0, 0, 0, 0));
        welcome.this.setBackground (new Color (0, 0, 0, 0)); 
        this.setResizable(false);
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        barra = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setFont(new java.awt.Font("Tahoma", 1, 12));
        text.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 30));
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 340, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(realizado == false){
        realizado = true;
        barra.setMaximum(49);
        barra.setMinimum(0);
        barra.setStringPainted(true);
        ejecutar.start();
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    private class hilo extends Thread{
    @Override
    public void run(){
        try {while(true){
            auxiliar++;
            barra.setValue(auxiliar);
            repaint();
            switch(auxiliar){
                case 3:
                    text.setText("Cargando programa...");
                    break;
                case 20:
                    text.setText("Leyendo preferencias");
                    break;
                case 50:
                    text.setText("Carga finalizada");
                    break;
                case 60:
                    Bienvenido objeto = new Bienvenido();
                    objeto.setVisible(true);
                    objeto.setLocationRelativeTo(welcome.this);
                    welcome.this.dispose();
                    break;                    
            }
            Thread.sleep(100);}
        } catch (InterruptedException ex) {
            Logger.getLogger(welcome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}

