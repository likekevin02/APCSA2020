package Unit13;
//(c) A+ Computer Science

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort() {
		Arrays.sort(wordRay);
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < wordRay.length; i++) {
			output += wordRay[i] + "\n";
		}
		return output + "\n\n";
	}
}