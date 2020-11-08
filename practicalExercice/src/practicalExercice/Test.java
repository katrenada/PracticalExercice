package practicalExercice;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {

	static void menu() {
		
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
		Product pp = null;
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
				pp.displayItems(prod);
				break;
			case 2: 
		        CommandLine line[]= new CommandLine[100];
			       int j=0;
			        int s=1;
			        do { 
			        Bill bl = new Bill();
			        	pp.displayItems(prod);
			            Scanner scanner = new Scanner( System.in );
			            System.out.println(" position= ");
			            int po = scanner.nextInt();
			           
			            System.out.println(" Quantity = ");
			            int qte= scanner.nextInt();
			            CommandLine y=new CommandLine (qte,prod.get(po));
			           
			            bl.addCommand(line,y,j);
			            System.out.println("Want to Command more?  1:Yes // 2:No");
			            Scanner scr = new Scanner( System.in );
			            s = scr.nextInt();
			            j+=1;
			        }while(s==1);
			    	double total=0.0;
					
					 for(int h=0;h<j;h++)
				     { total+=line[h].claculateTotalPrice();
					System.out.println("Product :"+line[h].getP().getName()+"   quantity  : "+line[h].getQuantity()+"  Total "+line[h].claculateTotalPrice()+" DT");
				     
				         }
					 System.out.println("total price is  :" +total);
				    
		
		
				
				
				
				
				break;
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
					
					
					sc =new Scanner (System.in);
					String s = sc.nextLine();					
					
					System.out.println("Enter Item Id: ");
					
					Scanner ssc1= new Scanner (System.in);
					int id= ssc1.nextInt();
					
					
					System.out.println("Enter Item Price: ");
					Scanner ssc2= new Scanner (System.in);
					float price= ssc1.nextFloat();
					
					
					System.out.println("Enter Item quantity: ");
					Scanner ssc3= new Scanner (System.in);
					int quanti= ssc3.nextInt();
					
					 pp= new Product(id,s,price,quanti);
					pp.addProduct(pp);
					prod.add(pp);
					
					break;
				case 2 :
					pp.displayItems(prod);
					break ;
				}
				
				break;
			}
			
			break;
		}
		}while(opt!=0);
	
	
		
		
	}

}
