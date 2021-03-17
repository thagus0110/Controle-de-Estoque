package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {

	private Connection con = null;
	private Statement stat = null;	
	private ResultSet res = null;

	public boolean conectar() {
		String servidor = "jdbc:mysql://localhost:3306/controle_estoque";
		String usuario = "root";
		String senha = "";
		//String driver = "com.mysql.jdbc.Driver";

		try {
			//Class.forName(driver);
			this.con = DriverManager.getConnection(servidor, usuario, senha);
			this.stat = this.con.createStatement();	
			return true;
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}
	
	public boolean desconectar() throws SQLException {
		con.close();
		if(con.isClosed()) {
			return true;
		}
		
		else {
			return false;
		}	
	}
		
	public void addProduto(String nome, String descricao, int quantidade, double preco) throws SQLException {
		conectar();
		try{
			String cmd = "INSERT INTO produto(nome, descricao, qtd, preco) VALUES ('" + nome + "', '" + descricao + "','" + quantidade + "', '" + preco + "')";
			this.stat.executeUpdate(cmd);
		}
		
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		desconectar();
	}
	
	public void removeProduto(int codigo) throws SQLException {
		conectar();
		try {
			String cmd = "DELETE FROM produto WHERE cod_produto = '"+ codigo +"'";
			this.stat.executeUpdate(cmd);
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		desconectar();
	}
		
}
