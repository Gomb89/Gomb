package feladat05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ABKezeloTuraUtvonalak {
	
	private Connection con;
	private String connectionString;
	private String user;
	private String pw;
	
	
	public ABKezeloTuraUtvonalak(String connectionString, String user, String pw) {
		this.connectionString = connectionString;
		this.user = user;
		this.pw = pw;
	}
	
	
	public void csatlakozas() throws SQLException {
		
		try {
			con = DriverManager.getConnection(connectionString,user,pw);
		} catch (Exception e) {
			throw new SQLException("Csatlakozás sikertelen!");
		}
		
	}

	
	public void bontas() throws SQLException {
		
		try {
			con.close();
		} catch (Exception e) {
			throw new SQLException("Kapcsolat bontása sikertelen!");
		}
		
	}
	
	
	public List<Tura> turaLekerdezes() throws SQLException{
		
		List<Tura> turak = new ArrayList<Tura>();
		
		// TODO adatlekérés, példányosítás, adatszerkezetbe töltés
		
		return turak;
		
	}
	
	
	public void ujTuraFelvitel(Tura tura) throws SQLException {
		
		// TODO új túraútvonal adatbázisba töltése	
		
	}

}
