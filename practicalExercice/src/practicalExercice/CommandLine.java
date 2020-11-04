package practicalExercice;

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
	public float claculateTotalPrice() {
		return (this.quantity*this.p.getPrice());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
