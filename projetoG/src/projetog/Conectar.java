/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetog;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ALUNO
 */
public class Conectar {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    String str_conn = "jdbc:postgresql://localhost:5432/FINALBANCO"; //URL de conexão
    public Connection conn = null;
    
    public boolean getConnection(){
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(str_conn, "postgres", "root");
            return true;
            
        }catch(ClassNotFoundException erro){
                        return false;

        }catch(SQLException erro){
            return false;
            
        }
     }
    public void close(){
        try{
            conn.close();
        }catch(SQLException erro){
            
        }
    
}

}
