package by.academy.homework.hw6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		File file = new File("Text.txt");
		file.createNewFile();
		try (FileWriter fw = new FileWriter(file)) {
			boolean b = true;
			while (b == true) {
				String text = scan.next();
				if ("stop".equals(text)) {
					b = false;
				} else {
					fw.write(text + " ");
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		scan.close();
	}
}
