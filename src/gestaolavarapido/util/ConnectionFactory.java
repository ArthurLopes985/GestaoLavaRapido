
package gestaolavarapido.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
   //classe para a conexão com o banco de dados
        public Connection getConexao() throws ClassNotFoundException, SQLException {
        //propriedades do banco de dados no computador como senha, porta
        String DRIVER = "com.mysql.cj.jdbc.Driver";
        String URL = "jdbc:mysql://localhost:3306/gestao_lava_rapido";
        String USER = "root"; 
        String PASSWORD = ""; 
        
        Class.forName(DRIVER);
        
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
