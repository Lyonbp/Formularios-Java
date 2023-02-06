package FormularioPacheco;

import Conexion_SQL.ConexionPacheco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pago extends javax.swing.JFrame {

    ConexionPacheco cc = new ConexionPacheco();
    Connection con =cc.conexion();
   
    public Pago() {
        initComponents();
        setTitle("REGISTRO DE PAGO");
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TTarjeta = new javax.swing.JTextField();
        TFecha = new javax.swing.JTextField();
        TCvc = new javax.swing.JTextField();
        TTitular = new javax.swing.JTextField();
        BNuevo = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();
        BEliminar = new javax.swing.JButton();
        BActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CbTarjeta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPersona = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 237, 244));

        jLabel2.setText("Numero De Tarjeta de Credito:");

        jLabel3.setText("Fecha de Caducidad:");

        jLabel4.setText("CVC:");

        jLabel5.setText("Nombre del Titular:");

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

        jLabel6.setText("Tarjeta:");

        CbTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije la Tarjeta", "BCP", "Saga Falabella", "Scotiabank", "Interbank", "MasterCard", " ", " ", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(BGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CbTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNuevo)
                    .addComponent(BGuardar)
                    .addComponent(BEliminar)
                    .addComponent(BActualizar))
                .addGap(34, 34, 34))
        );

        jLabel1.setText("Busqueda:");

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
        jScrollPane1.setViewportView(TPersona);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
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

    private void TBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBuscarActionPerformed

    private void TBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TBuscarKeyReleased
        filtrarDatos(TBuscar.getText());
    }//GEN-LAST:event_TBuscarKeyReleased

    private void TPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPersonaMouseClicked
        int FileSelect=TPersona.rowAtPoint(evt.getPoint());
        CbTarjeta.setSelectedItem(TPersona.getValueAt(FileSelect, 1));
        TTarjeta.setText(TPersona.getValueAt(FileSelect, 2).toString());
        TFecha.setText(TPersona.getValueAt(FileSelect, 3).toString());
        TCvc.setText(TPersona.getValueAt(FileSelect, 4).toString());
        TTitular.setText(TPersona.getValueAt(FileSelect, 5).toString());
    }//GEN-LAST:event_TPersonaMouseClicked

    public void mostrarDatos(){
        String[] titulos={"ID", "Tarjeta","Numero", "Fecha", "CVC", "Titular"};
        String[] registros=new String[7];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from pago";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idpago");
            registros[1]=rs.getString("tarjeta");
            registros[2]=rs.getString("numero");
            registros[3]=rs.getString("fecha");
            registros[4]=rs.getString("cvc");
            registros[5]=rs.getString("titular");
            modelo.addRow(registros);
            }
            TPersona.setModel(modelo);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR AL MOSTRAR DATOS" + e.getMessage());
        }   
    }
    
    public void InsertDatos(){
        try{
            String SQL="insert into pago(tarjeta,numero,fecha,cvc,titular) values (?,?,?,?,?)";
            PreparedStatement pst= con.prepareStatement(SQL);
            
            int comboxM=CbTarjeta.getSelectedIndex();
            pst.setString(1,CbTarjeta.getItemAt(comboxM));
                    
            pst.setString(2,TTarjeta.getText());
            
            pst.setString(3,TFecha.getText());
            
            pst.setDouble(4,Double.parseDouble(TCvc.getText()));
            pst.setString(5,TTitular.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Conexion" + e.getMessage());
            
        }
    }
    
    public void filtrarDatos(String valor){
    String[] titulos={"ID", "Tarjeta", "Numero", "Fecha", "Cvc", "Titular"};
    String[] registros=new String[7];
    DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        
        String SQL="select * from pago where titular like '%"+valor+"%'";
        try {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(SQL);  
            while(rs.next()){
            registros[0]=rs.getString("idpago");
            registros[1]=rs.getString("tarjeta");
            registros[2]=rs.getString("numero");
            registros[3]=rs.getString("fecha");
            registros[4]=rs.getString("cvc");
            registros[5]=rs.getString("titular");
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
            String SQL="delete from pago where idpago="+TPersona.getValueAt(filaSeleccionada,0);
            Statement st=con.createStatement();
            int n=st.executeUpdate(SQL);
            if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al Eliminar Registro"+ e.getMessage());
        }
    }
    
    public void actualizarDatos(){
        try{
            String SQL="update pago set tarjeta=?,numero=?,fecha=?,cvc=?,titular=? WHERE idpago=?" ;
            int filaSeleccionado=TPersona.getSelectedRow();
            String dao =(String)TPersona.getValueAt(filaSeleccionado,0);
            
            PreparedStatement pst= con.prepareStatement(SQL);
            
            int comboxM=CbTarjeta.getSelectedIndex();
            pst.setString(1,CbTarjeta.getItemAt(comboxM));
                    
            pst.setString(2,TTarjeta.getText());
            
            pst.setDouble(3,Double.parseDouble(TFecha.getText()));
            
            pst.setDouble(4,Double.parseDouble(TCvc.getText()));
            pst.setString(5,TTitular.getText());
            
            pst.setString(6,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            
        }catch(Exception e){
            JOptionPane.showConfirmDialog(null, "Error de Edicion" + e.getMessage());
        }
    }
    
    public void limpiarCajas(){
        CbTarjeta.setSelectedItem(null);
        TTarjeta.setText("");
        TFecha.setText("");
        TCvc.setText("");
        TTitular.setText("");
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
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizar;
    private javax.swing.JButton BEliminar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JComboBox<String> CbTarjeta;
    private javax.swing.JTextField TBuscar;
    private javax.swing.JTextField TCvc;
    private javax.swing.JTextField TFecha;
    private javax.swing.JTable TPersona;
    private javax.swing.JTextField TTarjeta;
    private javax.swing.JTextField TTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
