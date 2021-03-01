package by.academy.homework.hw4.Task2;

public class Demo {

	public static void main(String[] args) {
        Generic<Integer> array = new Generic<>(2);
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println(array.get(0));
        System.out.println(array.getLast());
        System.out.println(array.getFirst());
        System.out.println(array.length());
        System.out.println(array.getIndexLastElement());
        System.out.println(array.remove(Integer.valueOf(2)));
        System.out.println(array.remove(1));
        System.out.println(array.getLast());
        System.out.println(array.length());
    }
}
