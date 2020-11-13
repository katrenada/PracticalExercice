package practicalExercice;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandLine {
	
	int quantity;
	Product p = new Product();
	 public CommandLine() {
		 
	 }
	public CommandLine(int quantity, Product p) {
		this.quantity=quantity;
		this.p=p;
	}
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	/*public float claculateTotalPrice() {
		return (this.quantity*this.p.getPrice());
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public void addCommandeline() throws ClassNotFoundException, SQLException
    { double pricebook = 0;
    MyConnection con= new MyConnection();
    PreparedStatement pstmt;
   
    System.out.println("Enter id book ");
    Scanner sc1 = new Scanner( System.in );
    long idBook   = sc1.nextLong();
    System.out.println("enter quantity ");
    Scanner sc2 = new Scanner( System.in );
    int quantite   = sc2.nextInt();
     try {
            pstmt = con.coonectToDb().prepareStatement("SELECT * FROM Book where id = ? ");
            pstmt.setDouble(1,idBook);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next())
                {
                 pricebook =Double.parseDouble(rs.getString("price"));
                }
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
    pstmt =  con.coonectToDb().prepareStatement("INSERT INTO `bill`(id_bill,id_book,price_book,price_CL,qte) VALUES ( ?, ?, ?, ?,?)");
    pstmt.setNString(1, null );
    pstmt.setLong(2, idBook );
    pstmt.setDouble(3,pricebook);
    pstmt.setInt(5, quantite );
    pstmt.setDouble(4,pricebook*quantite );
    System.out.println("added");
    pstmt.executeUpdate();
    }
	
	public void displayBill() {
		 MyConnection con;
		 PreparedStatement pstmt;
		 con = new MyConnection();
		 try {
		 pstmt = con.coonectToDb().prepareStatement("SELECT title,price_CL FROM book,bill WHERE book.id=bill.id_book "); 
		 ResultSet rs = pstmt.executeQuery();
		 int i=0;
		double s=0;
		 System.out.println("title \t\t price");
		 while (rs.next()) {
		 	i++;
		 	
		 	System.out.println(rs.getString("title")+"\t\t"+ rs.getString("price_CL"));
		   s=s+Double.parseDouble(rs.getString("price_CL"));
		                    }
		 System.out.println("total price is : "+s);
		 	}
		 catch(SQLException e)
		 {e.printStackTrace();}
		  }
	
	
	
}
 



