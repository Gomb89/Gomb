package teszt05;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import feladat05.ABKezeloTuraUtvonalak;

class TuraUtvonalakTeszt {

	@Test
	void turaLekerdezesTeszt() {
		
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/turautvonalak?autoReconnect=true&useSSL=false";
			ABKezeloTuraUtvonalak dbMotor = new ABKezeloTuraUtvonalak(connectionURL,"root","Ruander2000");
			
			dbMotor.csatlakozas();
			
			assertTrue(dbMotor.turaLekerdezes().size()>0);
			
			dbMotor.bontas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	

}
