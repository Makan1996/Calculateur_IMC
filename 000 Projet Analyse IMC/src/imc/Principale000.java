package imc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Principale000 {
	static ArrayList<IMC> ChList = new ArrayList<IMC>();
	public static void main(String[] args) {
		
	String url = "jdbc:mysql://localhost:3306/donneespatient?allowPublicKeyRetrieval=true&useSSL=false";
	
	String login = "root";
	String passwd = "";
	
	Connection cn =null; 
	Statement st = null;
	ResultSet rs =null ;
	
	try {
		// Etape 1 : Chargement du driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Etape 2 : r�cup�ration de la connexion
		cn = DriverManager.getConnection(url, login, passwd);

		// Etape 3 : Cr�ation d'un statement
		st = cn.createStatement();

		String sql = "SELECT * FROM IMC  "   ;

		// Etape 4 : ex�cution requ�te
		rs = st.executeQuery(sql);
		
		// Si r�cup donn�es alors �tapes 5 (parcours Resultset)
		System.out.println(rs);
		
		while (rs.next()) {
			System.out.println("-----------------------------------");
			System.out.println(rs.getString("nom"));
			System.out.println(rs.getString("taille"));
			System.out.println(rs.getString("poids"));
			
			//IMC patient = new IMC(rs.getString("nom"),rs.getInt("taille"),rs.getInt("poids"));
			IMC patient = new IMC (rs.getString("nom"),rs.getInt("taille"),rs.getInt("poids"));
			
			System.out.println(patient);
			
			
		}
		 
		
	} catch (ClassNotFoundException e) {//si il y un probleme de driver
	 
		e.printStackTrace();
	} catch (SQLException e) {//si il y un probleme de sql
 
		e.printStackTrace();
	}


}
}
