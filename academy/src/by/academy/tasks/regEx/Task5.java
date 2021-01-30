package by.academy.tasks.regEx;

public class Task5 {
	
//5. Дана строка:
//" Hey      There!     How      Are you doing"   ;
//оставить лишь 1 пробел между слов.

	public static void main(String[] args) {
		String str = " Hey      There!     How      Are you doing";
		str = str.replaceAll("\\s+", " ").trim();
			
		System.out.println(str);
		

	}

}
