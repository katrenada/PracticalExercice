package practicalExercice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User extends Person {

	private List <User> listOfUsers = new ArrayList<>();
	


	
	
	public void addUser(User user) {
		this.name=user.name;
		this.surname=user.surname;
		this.id=user.id;
		this.listOfUsers.add(user);
	}
	
	
	public int countUsers() {
		return this.listOfUsers.size();
		}
	
	public int deleteUser(User user) {
		this.listOfUsers.remove(user);
		return countUsers();
	}

	
	public void showAllUsers() {
		for(User listOfUsers : listOfUsers) {
			System.out.println("----------------------------------------------");
			System.out.println(listOfUsers.name);
			System.out.println("name \t\t surname \t\t id");

			System.out.println(listOfUsers.name+"\t\t\t"+listOfUsers.surname+"\t\t\t"+listOfUsers.id);

			System.out.println("----------------------------------------------");
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
