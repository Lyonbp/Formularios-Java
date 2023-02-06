package Formulario;

import Conexion_SQL.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;



public class system extends javax.swing.JFrame {
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    
    
    public system() {
        initComponents();
        setTitle("REGISTRO DE ALUMNO");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TApellido = new javax.swing.JTextField();
        CbMateria = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CbEstatus = new javax.swing.JComboBox<>();
        TCalificacion = new javax.swing.JTextField();
        BNuevo = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPersona = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setText("Nombre");

        TNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido");

        TApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TApellidoActionPerformed(evt);
            }
        });

        CbMateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Redes", "Programacion", "Seguridad", "Soporte" }));

        jLabel3.setText("Materia");

        jLabel4.setText("Calificacion");

        jLabel5.setText("Estatus");

        CbEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aprobado", "Reprobado" }));

        TCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCalificacionActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TNombre)
                                    .addComponent(TApellido)
                                    .addComponent(TCalificacion)
                                    .addComponent(CbEstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(BActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNuevo)
                    .addComponent(BGuardar)
                    .addComponent(BEliminar)
                    .addComponent(BActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
        jScrollPane1.setViewportView(TPersona);

        jLabel6.setText("Busqueda");

        TBuscar.setToolTipText("");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(74, 74, 74)
                        .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNombreActionPerformed
    
    public void filtrarDatos(String valor){
        String[] titulos={"ID", "Nombre", "Apellidos", "Materia", "Calificacion", "estatus"};
        String[] registros=new String[7];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from persona where nombre like '%"+valor+"%'";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idalumnos");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellidos");
            registros[3]=rs.getString("materia");
            registros[4]=rs.getString("calificacion");
            registros[5]=rs.getString("estatus");
            modelo.addRow(registros);
            }
            TPersona.setModel(modelo);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR DATOS" + e.getMessage());
        }
    }
    
    public void mostrarDatos(){
        String[] titulos={"ID", "Nombre", "Apellidos", "Materia", "Calificacion", "estatus"};
        String[] registros=new String[7];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from persona";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idalumnos");
            registros[1]=rs.getString("nombre");
            registros[2]=rs.getString("apellidos");
            registros[3]=rs.getString("materia");
            registros[4]=rs.getString("calificacion");
            registros[5]=rs.getString("estatus");
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
            String SQL="delete from persona where idalumnos="+TPersona.getValueAt(filaSeleccionada,0);
            Statement st=con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Eliminar Registro"+ e.getMessage());
        }
    }
    
    public void limpiarCajas(){
        TNombre.setText("");
        TApellido.setText("");
        TCalificacion.setText("");
        CbEstatus.setSelectedItem(null);
        CbMateria.setSelectedItem(null);
    }
    
    public void actualizarDatos(){
        try{
            String SQL="update persona set nombre=?,apellidos=?,materia=?,calificacion=?,estatus=? WHERE idalumnos=?" ;
            int filaSeleccionado=TPersona.getSelectedRow();
            String dao =(String)TPersona.getValueAt(filaSeleccionado,0);
            
            PreparedStatement pst= con.prepareStatement(SQL);
            
            pst.setString(1,TNombre.getText());
            pst.setString(2,TApellido.getText());
            
            int comboxM=CbMateria.getSelectedIndex();
            pst.setString(3,CbMateria.getItemAt(comboxM));
            
            pst.setDouble(4,Double.parseDouble(TCalificacion.getText()));
            
            int comboxE=CbEstatus.getSelectedIndex();
            pst.setString(5,CbEstatus.getItemAt(comboxE));
            
            pst.setString(6,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Edicion" + e.getMessage());
        }
    }
    
    public void InsertDatos(){
        try{
            String SQL="insert into persona(nombre,apellidos,materia,calificacion,estatus) values (?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(SQL);
            
            pst.setString(1,TNombre.getText());
            pst.setString(2,TApellido.getText());
            
            int comboxM=CbMateria.getSelectedIndex();
            pst.setString(3,CbMateria.getItemAt(comboxM));
            
            pst.setDouble(4,Double.parseDouble(TCalificacion.getText()));
            
            int comboxE=CbEstatus.getSelectedIndex();
            pst.setString(5,CbEstatus.getItemAt(comboxE));
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Conexion" + e.getMessage());
            
        }
    }
    
    private void TApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TApellidoActionPerformed

    private void TCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCalificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCalificacionActionPerformed

    private void TBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBuscarActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        InsertDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_BGuardarActionPerformed

    private void BActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarActionPerformed
        actualizarDatos();
        limpiarCajas();
        mostrarDatos();
    }//GEN-LAST:event_BActualizarActionPerformed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void TPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPersonaMouseClicked
        int FileSelect=TPersona.rowAtPoint(evt.getPoint());
        TNombre.setText(TPersona.getValueAt(FileSelect, 1).toString());
        TApellido.setText(TPersona.getValueAt(FileSelect, 2).toString());
        CbMateria.setSelectedItem(TPersona.getValueAt(FileSelect, 3));
        TCalificacion.setText(TPersona.getValueAt(FileSelect, 4).toString());
        CbEstatus.setSelectedItem(TPersona.getValueAt(FileSelect, 5));
    }//GEN-LAST:event_TPersonaMouseClicked

    private void BEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarActionPerformed
        eliminarRegistro();
        mostrarDatos();
        limpiarCajas();
    }//GEN-LAST:event_BEliminarActionPerformed

    private void TBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBuscarKeyReleased
        filtrarDatos(TBuscar.getText());
    }//GEN-LAST:event_TBuscarKeyReleased

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
            java.util.logging.Logger.getLogger(system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JComboBox<String> CbEstatus;
    private javax.swing.JComboBox<String> CbMateria;
    private javax.swing.JTextField TApellido;
    private javax.swing.JTextField TBuscar;
    private javax.swing.JTextField TCalificacion;
    private javax.swing.JTextField TNombre;
    private javax.swing.JTable TPersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void insertarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
