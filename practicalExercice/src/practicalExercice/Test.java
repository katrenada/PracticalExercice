package practicalExercice;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	static void menu() {
		//System.out.println("1- Display all items ");
		//System.out.println("2- Add new item ");
		//System.out.println("3- Manage Users ");
		System.out.println("----------------------------------------------- ");
		System.out.println("1- Do you want to switch to a user? tap 1  ");
		System.out.println("2- Do you want to switch to an admin? Tap 2 ");
		System.out.println("3- Do you want to exit? Tap 0 ");
		System.out.println("----------------------------------------------- ");
	}
	
	public static void main(String[] args) {
		
		
		
		int opt;
		int opt1;
		int opt3;
		int opt4;
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		Scanner sc4 = new Scanner (System.in);
		ArrayList<Product> prod = new ArrayList <Product>();
		Product p = new Product();
		do{menu();
		opt= sc.nextInt();
		switch(opt) {
		case 1 : 
			System.out.println("*********USER************");
			System.out.println("1- Display all items ");
			System.out.println("2- Pass command ");
			opt1=sc.nextInt();
			switch(opt1) {
			case 1:
				if(prod.size()==0) 
					System.out.println("There's no products ");
				
				else
				p.displayItems(prod);
				break;
			/*case 2: 
				
				Product pp = new Product();
				CommandLine lin= new CommandLine();
				System.out.println("Enter the product Quantity ");
				Scanner scc= new Scanner(System.in);
				pp.setQte(scc.nextInt());
				System.out.println("Enter the ID product ");
				pp.setName(scc.nextLine());
				
				//pp.addProduct(pp.getProductByID(pp.getId(), prod));
				System.out.println("Your bill : ");
				lin.setQuantity(pp.getQte());
				lin.setP(pp.getProductByID(pp.getId(), prod));
				System.out.println("The total is " +lin.claculateTotalPrice());
				break;*/
			}
			
			break;
		case 2:
			System.out.println("*********ADMIN************");
			System.out.println("1- Manage items ");
			System.out.println("2- Manage bills ");
			System.out.println("3- Manage Users ");
			opt3=sc.nextInt();
			switch(opt3) {
			case 1 :
				System.out.println("1- Add product ");
				System.out.println("2- Display all products ");
				System.out.println("3- Modify product ");
				System.out.println("4- Delete product ");
				opt4= sc.nextInt();
				switch(opt4) {
				case 1: 
					System.out.println("Enter Item Name: ");
					
					p.setName(sc.nextLine());
					sc =new Scanner (System.in);
					sc.next();
					
					
					System.out.println("Enter Item Id: ");
					
					p.setId(sc.nextInt());
					
					
					System.out.println("Enter Item Price: ");
					p.setPrice(sc.nextFloat());
					
					System.out.println("Enter Item quantity: ");
					p.setQte(sc.nextInt());
					
					prod.add(p);
					break;
				case 2 :
					p.displayItems(prod);
					break ;
				}
				
				break;
			}
			
			break;
		}
		}while(opt!=0);
	
	
		
		
	}

}
