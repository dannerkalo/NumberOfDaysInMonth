package numberofdaysInmonth;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print(isLeapYear(-1024));
		System.out.print(getDaysInMonth(1, -2020));
	}

	public static boolean isLeapYear(int year) {
		if ((year >= 1) && (year <= 9999)) {

			if ((year % 4) == 0 && (year % 100 != 0) || (year % 400) == 0) {

				return true;
			}

		}

		return false;
	}

	public static int getDaysInMonth(int month, int year) {
		
		
		int dayOfThemonth = 0;
		
		if ( (month < 1 || month > 12) || (year < 1 || year > 9999)) {
			return -1;
		}else {



		switch (month) {
		case 1:
			dayOfThemonth = 31;
			break;
		case 2:
			if (!isLeapYear(year)) {
				dayOfThemonth = 28;
			} else {
				dayOfThemonth = 29;
			}

			break;
		case 3:
			dayOfThemonth = 31;
			break;
		case 4:
			dayOfThemonth = 30;
			break;
		case 5:
			dayOfThemonth = 31;
			break;
		case 6:
			dayOfThemonth = 30;
			break;
		case 7:
			dayOfThemonth = 31;
			break;
		case 8:
			dayOfThemonth = 31;
			break;
		case 9:
			dayOfThemonth = 30;
			break;
		case 10:
			dayOfThemonth = 31;
			break;
		case 11:
			dayOfThemonth = 30;
			break;
		case 12:
			dayOfThemonth = 31;
			break;
		}
		}
		return dayOfThemonth;
	}

}
