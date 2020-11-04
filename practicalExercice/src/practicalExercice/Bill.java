package practicalExercice;

import java.util.ArrayList;
import java.util.Date;



public class Bill {
int id;

ArrayList<CommandLine> prod = new ArrayList <CommandLine>();

public void addCommandLine(CommandLine c) {

	
	this.prod.add(c);
}

public Bill() {
	
}
public Bill(int id) {
	this.id=id;
	
}



	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void addCommand(CommandLine[] prod, CommandLine y, int j) {
    if (j < prod.length)
    {prod[j]=y;
    j+=1;
    }
    else
    System.out.println("Stock is full");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
