package formulario;

import java.sql.*;

public class Guardar {
    // se crea la conexion a la base de datos
    private static Connection con = null;
    private static Statement s = null;

    public static Connection traer() throws SQLException, ClassNotFoundException {
        // se introducen las variables en la base
        Datos objdata = new Datos();
        String nombre = objdata.getNombre();
        String app = objdata.getApp();
        String apm = objdata.getApm();
        String esc = objdata.getEsc();

        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/Registro", "root", "n0m3l0");
            } catch (SQLException ex) {
                throw new SQLException(ex);
            } catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
            try {
                
                s.executeUpdate("INSERT INTO datos Values('" + nombre + "','" + app + "','" + apm + "','" + esc + "');");
            } catch (SQLException e) {
                throw new SQLException(e);
            }

        }
        return con;
    }
    // se finaliza la conexion
    public static void terminar() throws SQLException {
        if (con != null) {
            con.close();
        }
    }
}
