package vaso_sagrado;
import java.sql.*;

public class Menu_Usuario extends javax.swing.JFrame {

  
    public Menu_Usuario() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu18 = new javax.swing.JMenu();
        jMenu17 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenu22 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenu24 = new javax.swing.JMenu();
        jMenu20 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario");

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

        jMenu1.setText("Agregar");

        jMenu4.setText("Cliente");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu4);

        jMenu5.setText("Empleado");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu1.add(jMenu5);

        jMenu3.setText("Producto");

        jMenu6.setText("Custodia");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu6);

        jMenu7.setText("Caliz");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu7);

        jMenu8.setText("Acetres");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu8);

        jMenu9.setText("Cestos");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenu3.add(jMenu9);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu10.setText("Consultar");

        jMenu12.setText("Cliente");
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu12);

        jMenu13.setText("Empleado");
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenu10.add(jMenu13);

        jMenu11.setText("Producto");

        jMenu18.setText("Acetres");
        jMenu18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu18MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu18);

        jMenu17.setText("Caliz");
        jMenu17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu17MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu17);

        jMenu19.setText("Cestos");
        jMenu19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu19MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu19);

        jMenu2.setText("Custodia");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu11.add(jMenu2);

        jMenu10.add(jMenu11);

        jMenuBar1.add(jMenu10);

        jMenu14.setText("Modificar");

        jMenu15.setText("Clientes");
        jMenu15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu15MouseClicked(evt);
            }
        });
        jMenu14.add(jMenu15);

        jMenu16.setText("Empleados");
        jMenu16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu16MouseClicked(evt);
            }
        });
        jMenu14.add(jMenu16);

        jMenuBar1.add(jMenu14);

        jMenu22.setText("Reportes");
        jMenu22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu22MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu22);

        jMenu23.setText("Acciones");

        jMenu24.setText("Asignar Trabajo");
        jMenu24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu24MouseClicked(evt);
            }
        });
        jMenu23.add(jMenu24);

        jMenuBar1.add(jMenu23);

        jMenu20.setText("Salir");
        jMenu20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu20MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu20);

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

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        Insertar_Custodia InCus = new Insertar_Custodia();
        jDesktopPane1.add(InCus);
        InCus.show();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        Insertar_Caliz InCa = new Insertar_Caliz();
        jDesktopPane1.add(InCa);
        InCa.show();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        Insertar_Acetre InAc = new Insertar_Acetre();
        jDesktopPane1.add(InAc);
        InAc.show();
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        Insertar_Cesto InCes = new Insertar_Cesto();
        jDesktopPane1.add(InCes);
        InCes.show();
    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Insertar_Cliente InCli = new Insertar_Cliente();
        jDesktopPane1.add(InCli);
        InCli.show();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Insertar_Empleado InEmp = new Insertar_Empleado();
        jDesktopPane1.add(InEmp);
        InEmp.show();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        Cosultar_Cliente ConCli = new Cosultar_Cliente();
        jDesktopPane1.add(ConCli);
        ConCli.show();
    }//GEN-LAST:event_jMenu12MouseClicked

    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        Consulta_Empleado CoEm = new Consulta_Empleado();
        jDesktopPane1.add(CoEm);
        CoEm.show();
    }//GEN-LAST:event_jMenu13MouseClicked

    private void jMenu15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu15MouseClicked
        Mod_Cliente MoCli = new Mod_Cliente();
        jDesktopPane1.add(MoCli);
        MoCli.show();
    }//GEN-LAST:event_jMenu15MouseClicked

    private void jMenu16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu16MouseClicked
        Mod_Empleado MoEmp = new Mod_Empleado();
        jDesktopPane1.add(MoEmp);
        MoEmp.show();
    }//GEN-LAST:event_jMenu16MouseClicked

    private void jMenu18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu18MouseClicked
        Consulta_Acetre CoAc = new Consulta_Acetre();
        jDesktopPane1.add(CoAc);
        CoAc.show();
    }//GEN-LAST:event_jMenu18MouseClicked

    private void jMenu17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu17MouseClicked
        Consulta_Caliz CoCa = new Consulta_Caliz();
        jDesktopPane1.add(CoCa);
        CoCa.show();
    }//GEN-LAST:event_jMenu17MouseClicked

    private void jMenu19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu19MouseClicked
        Consulta_Cesto CoCes = new Consulta_Cesto();
        jDesktopPane1.add(CoCes);
        CoCes.show();
    }//GEN-LAST:event_jMenu19MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Consulta_Custodia CoCus = new Consulta_Custodia();
        jDesktopPane1.add(CoCus);
        CoCus.show();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu20MouseClicked
        new Bienvenido().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_jMenu20MouseClicked

private void jMenu22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu22MouseClicked
        Reportes rep = new Reportes();
        jDesktopPane1.add(rep);
        rep.show();
}//GEN-LAST:event_jMenu22MouseClicked

private void jMenu24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu24MouseClicked
        Asignar_Tareas asigta = new Asignar_Tareas();
        jDesktopPane1.add(asigta);
        asigta.show();
}//GEN-LAST:event_jMenu24MouseClicked

  
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
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuario().setVisible(true);
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
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
