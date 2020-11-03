package practicalExercice;

import java.util.ArrayList;
import java.util.Date;

public class Bill {
int id;
Date dateBill;
float discount;
float price;
ArrayList<CommandLine> prod = new ArrayList <CommandLine>();

public void addCommandLine(CommandLine c) {

	
	this.prod.add(c);
}

public Bill() {
	
}
public Bill(int id, Date dateBill, float discount, float price) {
	this.id=id;
	this.dateBill=dateBill;
	this.discount=discount;
	this.price=price;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
