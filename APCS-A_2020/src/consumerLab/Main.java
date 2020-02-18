package consumerLab;

import java.io.File;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		System.out.println(Review.sentimentVal("epic"));
		System.out.println(Review.sentimentVal("fiber"));
		System.out.println(Review.sentimentVal("reform"));
		System.out.println(Review.totalSentiment("src/consumerLab/simpleReview.txt"));
		System.out.println("This review gave " + Review.starRating("src/consumerLab/simpleReview.txt") + " stars.");
		System.out.println("\n");
		System.out.println(Review.totalSentiment("src/consumerLab/26WestReview.txt"));
		System.out.println("This review gave " + Review.starRating("src/consumerLab/26WestReview.txt") + " stars.");
		
		// test reading from files
		// read in the positive adjectives in postiveAdjectives.txt
		/**try {
			Scanner input = new Scanner(new File("src/consumerLab/simpleReview.txt"));
			while (input.hasNextLine()) {
				String temp = input.nextLine().trim();
				System.out.println(temp);

			}
			input.close();
		} catch (Exception e) {
			System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
		}
		*/
	}
}
		