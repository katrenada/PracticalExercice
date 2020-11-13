package practicalExercice;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product {
	private String title;
	private String author;
	private double price;
	private Date releaseDate;


	
	 public Product() {
		 
	 }
public Product(String title, String author, double price, Date releaseDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.releaseDate = releaseDate;
	}



public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Date getReleaseDate() {
		return releaseDate;
	}



	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}



public int addProduct()
{ 

   
       
		try {String req="INSERT INTO `book`(id,title,author,price,releaseDate) VALUES (?, ?, ?, ?, ?)";
			
			MyConnection maC= new MyConnection();  
			PreparedStatement pstmt =  maC.coonectToDb().prepareStatement(req);
			pstmt.setNString(1, null );
			pstmt.setString(2, title );
			pstmt.setString(3, author );
			pstmt.setDouble(4,price);
			pstmt.setDate(5, releaseDate );
			   
			    //String req = "INSERT INTO book (id,title,author,price,releaseDate) VALUES ('" +
			   // this.title + "', '"+ this.author  + "','"+this.price+"','"+this.releaseDate+"')";
int rowAffected= pstmt.executeUpdate();
System.out.println("product added");
return  rowAffected;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
            
		   
}



public void displayAllProducts() throws ClassNotFoundException, SQLException 
{   MyConnection con;
PreparedStatement pstmt;
con = new MyConnection();
try {
pstmt = con.coonectToDb().prepareStatement("SELECT * FROM book "); 
ResultSet rs = pstmt.executeQuery();
int i=0;
System.out.println("Id \t\t title \t\t author \t Price \t\t release date");
while (rs.next()) {
	i++;
	
	System.out.println(rs.getString("id")+"\t\t"+ rs.getString("title")+"\t\t"+ rs.getString("author")+"\t\t"+ rs.getString("price")+"\t\t"+rs.getString("releaseDate"));
  
                   }
	}
catch(SQLException e)
{e.printStackTrace();}
 }

public void updateProduct(int id,  String name, float price , int qte) {
    
					try { MyConnection maC = new MyConnection();
						PreparedStatement pstmt = maC.coonectToDb().prepareStatement("UPDATE book SET title = ?,author = ?,price = ?,releaseDate = ? WHERE id = ?"); 
			    		pstmt.setLong(6, id );
			    		pstmt.setString(2, title );
			    		pstmt.setString(3, author );
			    		pstmt.setDouble(4,price);
			    		pstmt.setDate(5, releaseDate );
			    		pstmt.executeUpdate();
						
						//stmt =  maC.coonectToDb().prepareStatement(req);
			int rowAffected= pstmt.executeUpdate();
			System.out.println(rowAffected );
			
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
	
}

public void deleteProduct(int id) {
	 String req = "DELETE from book WHERE id ='"+id+"'";
			   ;
			   
			    MyConnection maC= new MyConnection();     
					try {
						
						 PreparedStatement stmt;
						stmt =  maC.coonectToDb().prepareStatement(req);
			int rowAffected= stmt.executeUpdate(req);
			System.out.println(rowAffected );
			
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
