package by.academy.homework.hw6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User("Ivan01", "Ivanov01", 21));
		users.add(new User("Ivan02", "Ivanov02", 22));
		users.add(new User("Ivan03", "Ivanov03", 23));
		users.add(new User("Ivan04", "Ivanov04", 24));
		users.add(new User("Ivan05", "Ivanov05", 25));
		users.add(new User("Ivan06", "Ivanov06", 26));
		users.add(new User("Ivan07", "Ivanov07", 27));
		users.add(new User("Ivan08", "Ivanov08", 28));
		users.add(new User("Ivan09", "Ivanov09", 29));
		users.add(new User("Ivan10", "Ivanov10", 30));

		File folder = new File("users");
		if (!folder.exists()) {
			folder.mkdir();
		}

		for (User user : users) {
			String fileName = user.getName() + "_" + user.getSurname() + ".txt";
			File file = new File(folder, fileName);
			
			try (ObjectOutputStream objectStram = new ObjectOutputStream(new FileOutputStream(file))) {
				objectStram.writeObject(user);				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}