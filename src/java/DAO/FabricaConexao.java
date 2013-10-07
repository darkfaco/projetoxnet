package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {
	Connection con;
	
	public Connection abrirConexao (){
		
	 try {
            String nomeConexao = "xnet"; //conectao //xnet
            /* Tenta se conectar ao Driver */
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            /* nome do banco que voce deu anteriormente ao seu alias */
            con = DriverManager.getConnection("jdbc:odbc:" + nomeConexao);
        } catch (ClassNotFoundException e) {//capturando os erros da conexÃ£o
            e.getMessage();
        } catch (SQLException sqle) {
            sqle.getMessage();
        }
		
		return con;
	}
	
	public void fecharConexao(){
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
