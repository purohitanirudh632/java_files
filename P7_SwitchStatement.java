
/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

import java.util.Scanner;

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		Scanner obj1 = new Scanner(System.in);
				int choice;
		System.out.println("enter the choijce ");
				choice = obj1.nextInt();

		switch(choice)
		{
			case 1:
				System.out.println("enter the current year");
				int year;
				year = obj1.nextInt();
				System.out.println("the current year is : " + year);
				break;
			case 2:
				System.out.println("enter  the current month");
				String months;
				months = obj1.nextLine();
				System.out.println("the month is : " + months);
				break;
			case 3:
				System.out.println("enter the current day");
				int day;
				day = obj1.nextInt();
				System.out.println("the day is " + day);
				break;
		}
	}
}