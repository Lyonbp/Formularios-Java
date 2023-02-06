package FormularioPacheco;

import Conexion_SQL.ConexionPacheco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;

public class Cliente extends javax.swing.JFrame {

   ConexionPacheco cc = new ConexionPacheco();
   Connection con =cc.conexion();
   
    public Cliente() {
        initComponents();
        setTitle("REGISTRO DE CLIENTE");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BNuevo = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        TApellido = new javax.swing.JTextField();
        TEdad = new javax.swing.JTextField();
        TTelefono = new javax.swing.JTextField();
        TDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TPersona = new javax.swing.JTable();

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

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 229, 244));

        jPanel3.setBackground(new java.awt.Color(19, 210, 187));

        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        BEliminar.setText("Eliminar");
        BEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarActionPerformed(evt);
            }
        });

        BActualizar.setText("Actualizar");
        BActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombres:");

        jLabel8.setText("Apellidos:");

        jLabel9.setText("Edad:");

        jLabel10.setText("Telefono:");

        jLabel11.setText("DNI:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BNuevo)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(BEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(BActualizar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TDni, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNuevo)
                    .addComponent(BGuardar)
                    .addComponent(BEliminar)
                    .addComponent(BActualizar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel6.setText("Busqueda:");

        TBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBuscarActionPerformed(evt);
            }
        });
        TBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TBuscarKeyReleased(evt);
            }
        });

        TPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPersonaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TPersona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        InsertDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        eliminarRegistro();
        mostrarDatos();
        limpiarCajas();
    }//GEN-LAST:event_BEliminarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_BActualizarActionPerformed

    private void TPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPersonaMouseClicked
        int FileSelect=TPersona.rowAtPoint(evt.getPoint());
        TNombre.setText(TPersona.getValueAt(FileSelect, 1).toString());
        TApellido.setText(TPersona.getValueAt(FileSelect, 2).toString());
        TEdad.setText(TPersona.getValueAt(FileSelect, 3).toString());
        TTelefono.setText(TPersona.getValueAt(FileSelect, 4).toString());
        TDni.setText(TPersona.getValueAt(FileSelect, 5).toString());                  
    }//GEN-LAST:event_TPersonaMouseClicked

    private void TBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBuscarActionPerformed

    private void TBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBuscarKeyReleased
        filtrarDatos(TBuscar.getText());
    }//GEN-LAST:event_TBuscarKeyReleased

    public void filtrarDatos(String valor){
    String[] titulos={"ID", "Nombre", "Apellidos", "Edad", "Telefono", "DNI"};
    String[] registros=new String[7];
    DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from cliente where nombre like '%"+valor+"%'";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idcliente");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellidos");
            registros[3]=rs.getString("edad");
            registros[4]=rs.getString("telefono");
            registros[5]=rs.getString("dni");
            modelo.addRow(registros);
            }
            TPersona.setModel(modelo);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR DATOS" + e.getMessage());
        }
    }
    
    public void eliminarRegistro(){
        int filaSeleccionada=TPersona.getSelectedRow();
        try{
            String SQL="delete from cliente where idcliente="+TPersona.getValueAt(filaSeleccionada,0);
            Statement st=con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Eliminar Registro"+ e.getMessage());
        }
    }
    
    public void InsertDatos(){
        try{
            String SQL="insert into cliente(nombre,apellidos,edad,telefono,dni) values (?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(SQL);
            
            pst.setString(1,TNombre.getText());
            pst.setString(2,TApellido.getText());
            
            pst.setString(3,TEdad.getText());
            
            pst.setDouble(4,Double.parseDouble(TTelefono.getText()));
            
            pst.setDouble(5,Double.parseDouble(TDni.getText()));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Conexion" + e.getMessage());
            
        }
    }
    
    public void actualizarDatos(){
        try{
            String SQL="update cliente set nombre=?,apellidos=?,edad=?,telefono=?,dni=? WHERE idcliente=?" ;
            int filaSeleccionado=TPersona.getSelectedRow();
            String dao =(String)TPersona.getValueAt(filaSeleccionado,0);
            
            PreparedStatement pst= con.prepareStatement(SQL);
            
            pst.setString(1,TNombre.getText());
            pst.setString(2,TApellido.getText());
            
            pst.setString(3,TEdad.getText());
            
            pst.setDouble(4,Double.parseDouble(TTelefono.getText()));
            pst.setDouble(5,Double.parseDouble(TDni.getText()));
            
            pst.setString(6,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Edicion" + e.getMessage());
        }
    }
    public void mostrarDatos(){
        String[] titulos={"ID", "Nombre", "Apellidos", "Edad", "Telefono", "DNI"};
        String[] registros=new String[7];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from cliente";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idcliente");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellidos");
            registros[3]=rs.getString("edad");
            registros[4]=rs.getString("telefono");
            registros[5]=rs.getString("dni");
            modelo.addRow(registros);
            }
            TPersona.setModel(modelo);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR DATOS" + e.getMessage());
        }
    }
    
     public void limpiarCajas(){
        TNombre.setText("");
        TApellido.setText("");
        TEdad.setText("");
        TTelefono.setText("");
        TDni.setText("");
    }
 
    
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JTextField TApellido;
    private javax.swing.JTextField TBuscar;
    private javax.swing.JTextField TDni;
    private javax.swing.JTextField TEdad;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTable TPersona;
    private javax.swing.JTextField TTelefono;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
  
    private void insertarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
