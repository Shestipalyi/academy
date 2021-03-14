package by.academy.homework.hw6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Task4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		
		File folder = new File("task4");
		if (!folder.exists()) {
			folder.mkdir();
		}

		try (FileReader reader = new FileReader("Text.txt")) {
			int c;
			while ((c = reader.read()) != -1) {
				sb.append((char) c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int lenghtText = sb.length();

		for (int i = 1; i <= 100; i++) {
			int k = (int) rand.nextInt(lenghtText);;
			File file = new File(folder, i + ".txt");
			
			try (FileWriter fw = new FileWriter(file)) {
				file.createNewFile();
				fw.write(sb.substring(0, k));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

		File file = new File("result.txt");
		try (FileWriter fw = new FileWriter(file)) {
			for (File f : folder.listFiles()) {
				fw.append(f.getName() + " " + f.length() + "\n");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
