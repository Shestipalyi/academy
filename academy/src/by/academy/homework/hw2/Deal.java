package by.academy.homework.hw2;

//Задание 4. 
//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер. 
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков 
//(по 5 карт каждому) из рассортированной колоды. 
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

import java.util.Scanner;
import java.util.Random;

public class Deal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Введите количество игроков");
		int n = scan.nextInt();
		int hand = 5;
		String[] suit = { "Червы", "Пики", "Бубны", "Трефы" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз" };
		int numCards = suit.length * rank.length;
		String[] deck = new String[numCards];

		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deck[rank.length * i + j] = rank[j] + " " + suit[i];
			}
		}

		for (int i = 0; i < deck.length; i++) {
			int randNumCard = rand.nextInt(deck.length);
			String temp = deck[randNumCard];
			deck[randNumCard] = deck[i];
			deck[i] = temp;
		}

		for (int i = 0; i < n * hand; i++) {
			System.out.println(deck[i]);
			if ((i + 1) % n == 0) {
				System.out.println();
			}
		}
		scan.close();
	}
}
