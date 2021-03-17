package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexao {

	private Connection con = null;
	private Statement stat = null;
	private ResultSet res = null;

	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/bdestoque";
		String usuario = "root";
		String senha = "";
		String driver = "com.mysql.jdbc.Driver";

		try {
			Class.forName(servidor);
			this.con = DriverManager.getConnection(servidor, usuario, senha);
			this.stat = this.con.createStatement();
		}

		catch (Exception e) {
			System.out.println("Erro!");
		}

	}

	public boolean estaConectado() {
		if (this.con != null) {
			return true;
		}

		else {
			return false;
		}
	}
}
