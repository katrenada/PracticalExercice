package practicalExercice;

import java.util.ArrayList;

public class Product {
private int id;
private String name;
private float price; 
private int qte;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public int getQte() {
	return qte;
}

public void setQte(int qte) {
	this.qte = qte;
}

public Product() {
	
}
public Product(int id, String name, float price, int qte) {
	this.id=id;
	this.name=name;
	this.price=price;
	this.qte=qte;
}

public void addProduct(Product p) {
	this.id=p.id;
	this.name=p.name;
	this.price=p.price;
	this.qte=p.qte;
}

public void displayItems(ArrayList<Product> prod) {
	for(Product product : prod) {
		System.out.println("----------------------------------------------");
		System.out.println(product.name);
		System.out.println("id Product\t\tStock\t\tName\t\tPrice");

		System.out.println(product.id+"\t\t\t"+product.qte+"\t\t\t"+product.name+"\t\t\t"+product.price);

		
		
		System.out.println("----------------------------------------------");
		
	}
}
/*public Product getProductByID(int id, ArrayList<Product> prod) {
	for(Product p:  prod) {
		if(this.id==p.id)
			return p;
		else return null;
	}
	return null;
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
