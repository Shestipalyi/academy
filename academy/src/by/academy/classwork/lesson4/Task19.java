package by.academy.classwork.lesson4;

public class Task19 {

	public static void main(String[] args) {
//два двузначных числа, записанные одно за другим, образуют четырехзначное число, которое делится на их произведение

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				if ((i * 100 + j) % (i * j) == 0){
					System.out.println("Число i: " + i + " Число j: " + j);
				}
			}
		}

	}

}
