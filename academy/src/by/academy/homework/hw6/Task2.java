package by.academy.homework.hw6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Result.txt");
		StringBuilder sb = new StringBuilder();
		
		try (FileReader fr = new FileReader("Text.txt")) {
			int b;
			while ((b = fr.read()) != -1) {
				if (' ' != ((char) b)) {
					sb.append((char) b);
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try (FileWriter fw = new FileWriter(file);) {
			file.createNewFile();
			fw.write(sb.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
