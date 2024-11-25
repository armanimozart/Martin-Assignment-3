package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserService {
	private User[] users;
	
	public UserService() {
//		String loadUsersFromFile = ("data.txt");
	}
	public void loadUsersFromFile(String data) {
		try {
			int lineCount = 0;
			try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))){
				while (fileReader.readLine() != null) {
					lineCount++;
				}
			}
			users = new User[lineCount];
			try (BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"))) {
				String line;
				int index = 0;
				while ((line = fileReader.readLine()) != null) {
					String[] userCredentials = line.split(",");
					if (userCredentials.length == 3) {
						users[index++] = new User(userCredentials[0], userCredentials[1], userCredentials[2]);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public boolean validateUser(String username, String password) {
		for (User user : users) {
			if (user != null && user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	public String getUserName(String username) {
		for (User user : users) {
			if (user != null && user.getUsername().equalsIgnoreCase(username)) {
				return user.getName();
			}
		}
		return null;
	}
}


