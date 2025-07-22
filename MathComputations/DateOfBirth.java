import java.util.*;
class DateOfBirth{
	static boolean isLeap(int year){
		return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
	}
	
	static int[] daysInMonth = {31, 28, 31, 30, 31, 30,31 , 31, 30, 31, 30, 31};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

	        System.out.print("Enter birth day (1-31): ");
        	int bDay = sc.nextInt();
        	System.out.print("Enter birth month (1-12): ");
                int bMonth = sc.nextInt();
                System.out.print("Enter birth year: ");
                int bYear = sc.nextInt();

		System.out.print("Enter current day (1-31): ");
        	int cDay = sc.nextInt();
        	System.out.print("Enter current month (1-12): ");
        	int cMonth = sc.nextInt();
       		System.out.print("Enter current year: ");
        	int cYear = sc.nextInt();

		int finalDay, finalMonth, finalYear;
		
		if(isLeap(bYear)) daysInMonth[1] = 29;

		if(bDay > cDay){
			cDay += daysInMonth[(cMonth - 2 +12)%12];
			cMonth -= 1;
		}

		if(bMonth > cMonth){
			cMonth += 12;
			cYear -= 1;
		}

		finalDay = cDay - bDay;
		finalMonth = cMonth - bMonth;
		finalYear = cYear - bYear;

		System.out.println("Your age is: " +
                	finalYear + " years, " +
                	finalMonth + " months, and " +
                	finalDay + " days.");
	}
}
