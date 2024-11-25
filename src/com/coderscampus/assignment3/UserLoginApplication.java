package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		UserService userService = new UserService();
		userService.loadUsersFromFile("data.txt");
		int loginAttempts = 0;
		int maxLoginAttempts = 5;
		String inputUsername; 
		String inputPassword;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		while(loginAttempts < maxLoginAttempts) {
			System.out.println("Enter your email:");
			inputUsername = scanner.nextLine();
			System.out.println("Enter your password:");
			inputPassword = scanner.nextLine();
			
			if (userService.validateUser(inputUsername, inputPassword)) {
				String name = userService.getUserName(inputUsername);
				System.out.println("Welcome " + name);
				break;
			} else {
				System.out.println("Invalid login, please try again");
				loginAttempts++;
			}
		}
		
		if (loginAttempts == 5) {
			System.out.println("Too many failed login attempts, you are now locked out.");
		}
		scanner.close();
	}

}