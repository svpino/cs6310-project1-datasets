import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This code will generate a random dataset to test Project 1. Make sure you specify the number of
 * students you want to test with as the first argument in the command line. The code uses 18
 * courses as specified on the description of the problem.
 * 
 * To execute this code, run it like this:
 * 
 * java Generator 1000 > file.csv
 * 
 * This way you'll end up with a CSV file with 1,000 students that you can later use to test your
 * code with.
 * 
 */
public class Generator {

	public static void main(String[] args) {

		System.out.println("student_ID,course_ID,semester_ID");

		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			Random random1 = new Random();
			int courses = 1 + random1.nextInt(18);

			List<Integer> used = new ArrayList<Integer>();

			for (int j = 0; j < courses; j++) {
				Random random2 = new Random();

				int course;
				do {
					course = 1 + random2.nextInt(18);
				} while (used.contains(course));

				used.add(course);

				System.out.println(i + "," + course + ",0");
			}
		}

	}

}
