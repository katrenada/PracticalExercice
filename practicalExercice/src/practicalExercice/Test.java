package practicalExercice;

import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		int opt;
		int opt1;
		int opt3;
		int opt4;
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		Scanner sc4 = new Scanner (System.in);
		
		Product pp = new Product();
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
				
				pp.displayAllProducts();
				break;
			case 2: 
				int r;
				CommandLine cmd= new CommandLine();
				do {
					pp.displayAllProducts();
					 
					cmd.addCommandeline();
					System.out.println("tap 2 to exit");
					Scanner sx= new Scanner(System.in);
					 r=sx.nextInt();
				}while(r!=2);
				cmd.displayBill();
				
				
		        /*CommandLine line[]= new CommandLine[100];
			       int j=0;
			        int s=1;
			        do { 
			        Bill bl = new Bill();
			        	pp.displayAllProducts();
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
				    
		
		*/
				
				
				
				
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
					System.out.println("Enter book title: ");
					
					
					sc =new Scanner (System.in);
					String title = sc.nextLine();					
					
					System.out.println("Enter book author: ");
					
					Scanner ssc1= new Scanner (System.in);
					String author= ssc1.nextLine();
					
					
					System.out.println("Enter book Price: ");
					Scanner ssc2= new Scanner (System.in);
					double price= ssc1.nextDouble();
					
					
					System.out.println("Enter date release : ");
					Scanner ssc3= new Scanner (System.in);
					String relase= ssc3.next();
					//Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
					//Date releasedate= (Date) new SimpleDateFormat("dd/mm/yyyy").parse(relase);
					Date releasedate=Date.valueOf(relase);
					
					 pp= new Product(title,author,price,releasedate);
					pp.addProduct();
					
					
					break;
				case 2 :
					pp.displayAllProducts();
					break ;
				}
				
				break;
			}
			
			break;
		}
		}while(opt!=0);
	
	
		
		
	}

}
