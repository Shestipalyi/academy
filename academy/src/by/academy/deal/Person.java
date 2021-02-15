package by.academy.deal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
	public final DateValidator df = new DateValidator();
	private String name;
	private String phone;
	private String email;
	private Double money;
	private Date dateOfBirth;

	private final static Pattern pattern = Pattern.compile("-");
	private final static DateValidator dv = new DateValidator();
	private final static BelarusPhoneValidator bpv = new BelarusPhoneValidator();
	private final static EmailValidator ev = new EmailValidator();

	public Person() {
		super();
	}

	public Person(String name, String phone, String email, Double money, Date dateOfBirth) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
	}

	public void readNewPerson() throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ваше имя");
		setName(scan.nextLine());
		System.out.println("Введите количество денег");
		setMoney(scan.nextDouble());
		scan.nextLine();
		System.out.println("Введите дату рождения в формате dd/MM/yyyy или dd-MM-yyyy");
		String dateOfBirth = scan.nextLine();
		while (!dv.validate(dateOfBirth)) {
			System.out.println("Дата введена некорректно, попробуйте ещё раз");
			dateOfBirth = scan.nextLine();
		}
		setDateOfBirth(dateOfBirth);

		System.out.println("Введите ваш номер телефона");
		phone = scan.nextLine();
		while (!bpv.validate(phone)) {
			System.out.println("Номер телефона введен некорректно, попробуйте ещё раз");
			phone = scan.nextLine();
		}

		System.out.println("Введите вашу электронную почту");
		email = scan.nextLine();
		while (!ev.validate(email)) {
			System.out.println("Электронная почта введена некорректно, попробуйте ещё раз");
			email = scan.nextLine();
		}		
	}

	public void setDateOfBirth(String Date) throws ParseException {
		Matcher matcher = pattern.matcher(Date.trim());
		if (matcher.find()) {
			dateOfBirth = new SimpleDateFormat("dd-MM-yyyy").parse(Date);
		} else {
			dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(Date);
		}
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}
	
}
