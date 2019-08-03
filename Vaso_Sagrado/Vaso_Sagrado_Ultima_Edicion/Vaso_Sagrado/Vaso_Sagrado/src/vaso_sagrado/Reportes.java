package vaso_sagrado;
import java.sql.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Reportes extends javax.swing.JInternalFrame {

    public Reportes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jButton1.setText("Empleados");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Clientes");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Custodias");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Caliz");
        jButton4.setName("jButton4"); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Acetres");
        jButton5.setName("jButton5"); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Cestos");
        jButton6.setName("jButton6"); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try 
        {
            Connection cn = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteEmpleado.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        
        } catch (Exception e) {  }
}//GEN-LAST:event_jButton1MouseClicked

private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         try 
        {
            Connection cn1 = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteClientes.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn1);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        
        } catch (Exception e) {  } 
}//GEN-LAST:event_jButton2MouseClicked

private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try
        {
            Connection cn2 = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteCustodias.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn2);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) { }
}//GEN-LAST:event_jButton3MouseClicked

private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        try 
        {
            Connection cn3 = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteCaliz.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn3);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) { }
}//GEN-LAST:event_jButton4MouseClicked

private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        try 
        {
            Connection cn4 = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteAcetres.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn4);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) { }
}//GEN-LAST:event_jButton5MouseClicked

private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        try 
        {
            Connection cn5 = Conexion.conectar("VasoSagrado", "sa", "sasa");
            JasperReport reporte = JasperCompileManager.compileReport("ReporteCestos.jrxml");
            JasperPrint print = JasperFillManager.fillReport(reporte, null, cn5);
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);
        } catch (Exception e) { }
}//GEN-LAST:event_jButton6MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
