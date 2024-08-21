import java.util.Scanner;

public class ShinigamiEyes {

	public static void main(String[] args) {
		
        // fetch averages from google
		int averageMaleAge= 73;
		int averageFemaleAge = 79;
		
		// read user's input
		Scanner scanner = new Scanner(System.in);
		
		// confirm they're willing to continue
		System.out.println("Do you want to know how long you have to live? (true/false)");
		boolean answer = Boolean.valueOf(scanner.nextLine());
		if(answer!=true) {
			System.out.println("Failed, you are not ready to hear the truth.");
			return;
		}
		
		// get personal information
		System.out.println("Are you male or female? (m/f)");
		String sex = scanner.nextLine();
		if((sex.equals("m")) || (sex.equals("f"))) {
			System.out.println("What is your age?");
			int age = Integer.valueOf(scanner.nextLine());

			// calculate seconds to live
			int adjustedAge = averageFemaleAge;
			if(sex.equals("m")) {
				 adjustedAge = averageMaleAge;
			}
			int remainingYears =  adjustedAge-age;
			int remainingDays = remainingYears*365;
			int remainingHours= remainingDays*24;
			int remainingSeconds = remainingHours*3600;

			// output seconds to live
			System.out.println("You have "+remainingSeconds+" seconds to live on average.");
		}
	}
}
