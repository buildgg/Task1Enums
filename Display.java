package javaenum2;

import java.util.Scanner;

public class Display {

	public void questionDisplay() {
		System.out.print("¬ведите мес€ца: \n ");

		Scanner scaner = new Scanner(System.in);
		String inputLine = scaner.nextLine();

		MonthsEnum monthsenum = new MonthsEnum();
		try {
			monthsenum.getOrderMonthFromOut(inputLine);
			System.out.print(monthsenum.getOrderMonth());
			
		} catch (IllegalArgumentException e) {
			System.out.println("ќшибка ввода, повторите попытку ");
			questionDisplay();
		}

	}

}
