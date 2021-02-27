package by.academy.classwork.lesson14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {		
		List<HeavyBox> al = new ArrayList<>();
		al.add(new HeavyBox(2,3,4,5));
		al.add(new HeavyBox(3,5,9,7));
		al.add(new HeavyBox(6,7,2,1));
		al.add(new HeavyBox(2,3,7,5));
		
		for (HeavyBox b : al) {
			System.out.println(b);
		}
		
		al.get(0).setWeight(5);
		al.remove(al.size()-1);
	
		
		// 1 вариант
		Object[] objectArray = al.toArray();
		System.out.println(Arrays.toString(objectArray));

//		// 2 вариант
//		String[] stringArray1 = new String[al.size()];
//		list.toArray(stringArray1);
//		System.out.println(Arrays.toString(stringArray1));
//
//		// 3 вариант
//		String[] stringArray2 = list.toArray(new HeavyBox[0]);
//		System.out.println(Arrays.toString(stringArray2));
//		
		al.clear();
	}

}
