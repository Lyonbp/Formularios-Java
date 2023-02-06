
package Conexion_SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionSQL {
     Connection conectar = null;
    public Connection conexion (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/persona", "root","");

            JOptionPane.showMessageDialog(null,"conexion exitosa");
        }   catch (Exception e){
                JOptionPane.showMessageDialog(null, "error de conexion" + e.getMessage());
        }

        return conectar;
    }
}   
