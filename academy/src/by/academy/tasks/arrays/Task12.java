package by.academy.tasks.arrays;

//Задача 12.
//Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных и положительных элементов там было поровну
//и не было нулей.При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных,
//а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.    

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] ar = new int[12];
		int plus = 0;
		int minus = 0;
		for (int i = 0; i < ar.length; i++) {
			int r = rand.nextInt(2);
			if (r == 0 && minus < 6) {
				ar[i] = -(rand.nextInt(10) + 1);
				minus++;
			}else if(r == 1 && plus < 6) {
				ar[i] = rand.nextInt(10) + 1;
				plus++;
			}else if(r == 0 && minus == 6) {
				ar[i] = rand.nextInt(10) + 1;
				plus++;
			}else if(r == 1 && plus == 6) {
				ar[i] = -(rand.nextInt(10) + 1);
				minus++;
			}
			System.out.print(ar[i] + " ");
		}
//		System.out.println("\n" + plus + "\n" + minus);

	}

}
