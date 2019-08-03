package vaso_sagrado;
import java.sql.*;
import javax.swing.JTable;

public class Consulta_Cesto extends javax.swing.JInternalFrame {
String ar1[]={"Nombre","Capacidad","Coste","Existencia"};
String ar2[][]=new String [1][4];
    public Consulta_Cesto() {
        initComponents();
        ar2=llenarArreglo2();
        jTable1=new JTable (ar2,ar1);
        jScrollPane1.setViewportView(jTable1);
    }
     public String[][] llenarArreglo2(){
        String temp[][]=new String [1][4];
        try{
            Connection cn = Conexion.conectar("VasoSagrado", "sa", "sasa");
            Statement st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs=st.executeQuery("select * from Cestos");
            if(rs.last());
            int filas=rs.getRow();
            temp=new String[filas][4];
            rs.first();
            for(int i = 0; i< temp.length; i++){
                temp[i][0]=rs.getString("idNombre");
                temp[i][1]=rs.getString("Capacidad");
                temp[i][2]=rs.getString("Coste");
                temp[i][3]=rs.getString("Existencia");
                rs.next();
            }
            return temp;
        }catch(Exception e){
            System.out.print(e);
            return temp;}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consulta Cestos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
