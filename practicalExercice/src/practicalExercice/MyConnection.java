package practicalExercice;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	
	Connection c;
	
	
	public Connection coonectToDb() {
		// String BDD = "gestionetudiant";
         String url = "jdbc:mysql://localhost:3306/bookstore?serverTimezone=UTC" ;
         String user = "root";
         String passwd = "";
         
		  try {
              Class.forName("com.mysql.cj.jdbc.Driver");
              c = DriverManager.getConnection(url, user, passwd);
              //System.out.println("vous étes connecté ");
          } catch (Exception e){
              e.printStackTrace();
              System.out.println("probleme de connection ");
              System.exit(0);
          }
		 return c; 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
