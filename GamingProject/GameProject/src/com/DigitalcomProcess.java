package com;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Main Menu - Choices" + "\n" + "1) RegisterUser" + "\n" + "2) ViewGames" + "\n"
					+ "3) searchByName " + "\n" + "4) Exit");
			int selectedOption = sc.nextInt();
			
			switch (selectedOption) {
			case 1:
				System.out.println("Enter your name : ");
				String userName = sc.next();
				System.out.println("Enter your password : ");
				String userPassword = sc.next();
				User.addUser(userName, userPassword);
				System.out.println("User Registered Successfully");
				break;
			case 2:
				GameService gs = new GameService();
				List<Game> listOfGames = gs.viewAll();
				Iterator<Game> it = listOfGames.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}
				break;
			case 3:
				System.out.println("Enter the name for which you want to serach the game : ");
				String name = sc.next();
				GameService gs1 = new GameService();
				String gameName = gs1.authorSearch(name);
				if(gameName == null) {
					System.out.println("Not found");
				}else {
					System.out.println(gameName);
				}
				break;
			case 4:
				System.out.println("Exiting");
				return;
			default:
				return;
			}
			
			if(selectedOption==4) {
				break;
			}
		}
		sc.close();
	}
}