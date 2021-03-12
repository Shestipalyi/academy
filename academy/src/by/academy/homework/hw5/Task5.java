package by.academy.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class Task5 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		String text = "Imagine no possessions,\n" + 
				"I wonder if you can,\n" + 
				"No need for greed or hunger\n" + 
				"A brotherhood of man\n" + 
				"Imagine all the people\n" + 
				"Sharing all the world\n" + 
				"\r\n" + 
				"You may say I'm a dreamer,\n" + 
				"But I'm not the only one\n" + 
				"I hope some day you'll join us\n" + 
				"And the world will live as one";
		System.out.println(text);
		
		char[] ch = text.replaceAll("[^A-Za-zА-Яа-я]", "").toCharArray();

		for (Character c : ch) {
			if (!map.containsKey(c)) {
				map.put(c, 0);
			}
			map.put(c, map.get(c) + 1);
		}

		System.out.println(map);
	}
}
