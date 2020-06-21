/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tania
 */
public class Conexion {
    
    private static Connection connection;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Nomina", "sa", "1234");
        } catch (Exception e) {
            connection = null;
        }
        
        return connection;
    }
    
    
    
}
