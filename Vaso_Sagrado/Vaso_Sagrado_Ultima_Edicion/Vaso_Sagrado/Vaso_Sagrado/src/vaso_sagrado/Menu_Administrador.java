package vaso_sagrado;
import java.sql.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Menu_Administrador extends javax.swing.JFrame {
    
    public Menu_Administrador() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();
        jMenu21 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu25 = new javax.swing.JMenu();
        jMenu32 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenu27 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu28 = new javax.swing.JMenu();
        jMenu31 = new javax.swing.JMenu();
        jMenu29 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenu33 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programador");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        jMenu1.setText("Acciones");

        jMenu3.setText("Insertar");

        jMenu7.setText("Custodia");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu7);

        jMenu8.setText("Caliz");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu8);

        jMenu9.setText("Acetres");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu9);

        jMenu10.setText("Cestos");
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu10);

        jMenu1.add(jMenu3);

        jMenu6.setText("Consultar");

        jMenu19.setText("Custodia");
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu19);

        jMenu20.setText("Caliz");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu20);

        jMenu21.setText("Acetres");
        jMenu21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu21MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu21);

        jMenu22.setText("Cestos");
        jMenu22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu22MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu22);

        jMenu1.add(jMenu6);

        jMenu5.setText("Modificar");

        jMenu15.setText("Custodia");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu15);

        jMenu16.setText("Caliz");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu16);

        jMenu17.setText("Acetres");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu17);

        jMenu18.setText("Cestos");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu18);

        jMenu1.add(jMenu5);

        jMenu4.setText("Borrar");

        jMenu11.setText("Custodia");
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu11);

        jMenu12.setText("Caliz");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu12);

        jMenu13.setText("Acetres");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu13);

        jMenu14.setText("Cestos");
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenu4.add(jMenu14);

        jMenu1.add(jMenu4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Empleados");

        jMenu25.setText("Insertar");
        jMenu25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu25MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu25);

        jMenu32.setText("Consultar");
        jMenu32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu32MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu32);

        jMenu26.setText("Modificar");
        jMenu26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu26MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu26);

        jMenu27.setText("Borrar");
        jMenu27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu27MouseClicked(evt);
            }
        });
        jMenu2.add(jMenu27);

        jMenuBar1.add(jMenu2);

        jMenu23.setText("Clientes");

        jMenu28.setText("Agregar");
        jMenu28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu28MouseClicked(evt);
            }
        });
        jMenu23.add(jMenu28);

        jMenu31.setText("Consultar");
        jMenu31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu31MouseClicked(evt);
            }
        });
        jMenu23.add(jMenu31);

        jMenu29.setText("Modificar");
        jMenu29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu29MouseClicked(evt);
            }
        });
        jMenu23.add(jMenu29);

        jMenu30.setText("Borrar");
        jMenu30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu30MouseClicked(evt);
            }
        });
        jMenu23.add(jMenu30);

        jMenuBar1.add(jMenu23);

        jMenu33.setText("Reportes");
        jMenu33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu33MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu33);

        jMenu24.setText("Salir");
        jMenu24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu24MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu24);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        Insertar_Custodia InCus = new Insertar_Custodia();
        jDesktopPane1.add(InCus);
        InCus.show();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
       Insertar_Caliz InCa = new Insertar_Caliz();
       jDesktopPane1.add(InCa);
       InCa.show();
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        Insertar_Acetre InAc = new Insertar_Acetre();
        jDesktopPane1.add(InAc);
        InAc.show();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        Insertar_Cesto InCes = new Insertar_Cesto();
        jDesktopPane1.add(InCes);
        InCes.show();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
        Borrar_Custodia BoCus = new Borrar_Custodia();
        jDesktopPane1.add(BoCus);
        BoCus.show();
    }//GEN-LAST:event_jMenu11MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        Borrar_Caliz BoCa = new Borrar_Caliz();
        jDesktopPane1.add(BoCa);
        BoCa.show();
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        Borrar_Acetres BoAc = new Borrar_Acetres();
        jDesktopPane1.add(BoAc);
        BoAc.show();
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked
        Borrar_Cestos BoCes = new Borrar_Cestos();
        jDesktopPane1.add(BoCes);
        BoCes.show();
    }//GEN-LAST:event_jMenu14MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        Mod_Custodia MoCus = new Mod_Custodia();
        jDesktopPane1.add(MoCus);
        MoCus.show();
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        Mod_Caliz MoCa = new Mod_Caliz();
        jDesktopPane1.add(MoCa);
        MoCa.show();
    }//GEN-LAST:event_jMenu16MouseClicked

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        Mod_Acetres MoAc = new Mod_Acetres();
        jDesktopPane1.add(MoAc);
        MoAc.show();
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        Mod_Cestos MoCes = new Mod_Cestos();
        jDesktopPane1.add(MoCes);
        MoCes.show();
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu25MouseClicked
        Insertar_Empleado InEmp = new Insertar_Empleado();
        jDesktopPane1.add(InEmp);
        InEmp.show();
    }//GEN-LAST:event_jMenu25MouseClicked

    private void jMenu26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu26MouseClicked
        Mod_Empleado MoEmp = new Mod_Empleado();
        jDesktopPane1.add(MoEmp);
        MoEmp.show();
    }//GEN-LAST:event_jMenu26MouseClicked

    private void jMenu27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu27MouseClicked
        Borrar_Empleado BoEmp = new Borrar_Empleado();
        jDesktopPane1.add(BoEmp);
        BoEmp.show();
    }//GEN-LAST:event_jMenu27MouseClicked

    private void jMenu32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu32MouseClicked
        Consulta_Empleado ConEmp = new Consulta_Empleado();
        jDesktopPane1.add(ConEmp);
        ConEmp.show();
    }//GEN-LAST:event_jMenu32MouseClicked

    private void jMenu28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu28MouseClicked
        Insertar_Cliente InsCli = new Insertar_Cliente();
        jDesktopPane1.add(InsCli);
        InsCli.show();
    }//GEN-LAST:event_jMenu28MouseClicked

    private void jMenu29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu29MouseClicked
        Mod_Cliente MoCli = new Mod_Cliente();
        jDesktopPane1.add(MoCli);
        MoCli.show();
    }//GEN-LAST:event_jMenu29MouseClicked

    private void jMenu30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu30MouseClicked
        Borrar_Cliente BoCli = new Borrar_Cliente();
        jDesktopPane1.add(BoCli);
        BoCli.show();
    }//GEN-LAST:event_jMenu30MouseClicked

    private void jMenu31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu31MouseClicked
        Cosultar_Cliente ConCli = new Cosultar_Cliente();
        jDesktopPane1.add(ConCli);
        ConCli.show();
    }//GEN-LAST:event_jMenu31MouseClicked

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        Consulta_Custodia ConCus = new Consulta_Custodia();
        jDesktopPane1.add(ConCus);
        ConCus.show();
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        Consulta_Caliz ConCa = new Consulta_Caliz();
        jDesktopPane1.add(ConCa);
        ConCa.show();
    }//GEN-LAST:event_jMenu20MouseClicked

    private void jMenu21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu21MouseClicked
        Consulta_Acetre ConAc = new Consulta_Acetre();
        jDesktopPane1.add(ConAc);
        ConAc.show();
    }//GEN-LAST:event_jMenu21MouseClicked

    private void jMenu22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MouseClicked
        Consulta_Cesto ConCes = new Consulta_Cesto();
        jDesktopPane1.add(ConCes);
        ConCes.show();
    }//GEN-LAST:event_jMenu22MouseClicked

    private void jMenu24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu24MouseClicked
        new Bienvenido().setVisible(true);
        dispose();            
    }//GEN-LAST:event_jMenu24MouseClicked

private void jMenu33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu33MouseClicked
        Reportes rep = new Reportes();
        jDesktopPane1.add(rep);
        rep.show();
}//GEN-LAST:event_jMenu33MouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
