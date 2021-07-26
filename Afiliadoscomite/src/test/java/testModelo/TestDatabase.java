package testModelo;
import java.sql.Connection;
import java.sql.SQLException;

import controlador.Conexion;

public class TestDatabase {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		testDatabase();
	}

	private static void testDatabase() {
		try {
			Connection conn = null;
			if (conn != Conexion.getConection()) {
				System.out.println("*********************************");
				System.out.println("    Conexión establecida!!");
				System.out.println("*********************************");
			}
		} catch (SQLException e) {
			System.out.println("***********************************************");
			System.out.println("  La conexióna a la base de datos ha fallado");
			System.out.println("***********************************************");
		}
	}
}
